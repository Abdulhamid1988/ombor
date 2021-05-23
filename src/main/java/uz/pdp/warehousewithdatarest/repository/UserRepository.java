package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.entity.User;

@RepositoryRestResource(path = "users",collectionResourceRel = "user",excerptProjection = User.class)
public interface UserRepository  extends JpaRepository<User,Integer> {
        boolean existsByPhoneNumber(String phoneNUmber);
}
