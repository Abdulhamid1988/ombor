package uz.pdp.warehousewithdatarest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousewithdatarest.payload.ApiResponse;
import uz.pdp.warehousewithdatarest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/Attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;


    @PostMapping
    public ApiResponse uploadFile(MultipartHttpServletRequest request) throws IOException {
        return attachmentService.uploadAttachment(request);
    }

    @GetMapping("/downlaod/{id}")
    public void downloadFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.downloadAttachment(id, response);
    }
}
