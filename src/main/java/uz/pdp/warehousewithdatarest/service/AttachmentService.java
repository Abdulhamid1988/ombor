package uz.pdp.warehousewithdatarest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousewithdatarest.entity.Attachment;
import uz.pdp.warehousewithdatarest.entity.AttachmentContent;
import uz.pdp.warehousewithdatarest.payload.ApiResponse;
import uz.pdp.warehousewithdatarest.repository.AttachmentContentRepository;
import uz.pdp.warehousewithdatarest.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    public ApiResponse uploadAttachment(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file!=null){
            Attachment attachment=new Attachment();
            attachment.setFileOriginalName(file.getOriginalFilename());
            attachment.setSize(file.getSize());
            attachment.setContentType(file.getContentType());
            attachmentRepository.save(attachment);

            AttachmentContent attachmentContent=new AttachmentContent();
            attachmentContent.setBytes(file.getBytes());
            attachmentContent.setAttachment(attachment);
            attachmentContentRepository.save(attachmentContent);
            return new ApiResponse("File saved!!! ",true);
        }
        return new ApiResponse("Error!!! ",false);
    }

    public void downloadAttachment(Integer id, HttpServletResponse response) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findAttachmentContentByAttID(id);
            if (optionalAttachmentContent.isPresent()) {
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment; filename=\"" + attachment.getFileOriginalName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }
        }
    }
}
