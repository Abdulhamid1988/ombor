package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.entity.AttachmentContent;

import java.util.Optional;

@Repository
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
    Optional<AttachmentContent> findByAttachmentId(Integer id);

    @Query(value = "select * from attachment_content aco join attachment att on aco.attachment_id=att.id\n" +
            "where att.id=:attID",nativeQuery = true)
    Optional<AttachmentContent> findAttachmentContentByAttID(@Param("attID") Integer attID);

}
