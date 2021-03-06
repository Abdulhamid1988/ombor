package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.entity.InputProduct;

import java.util.Date;
import java.util.List;

@Repository
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
    @Query(value = "select * from input_product as ip join input i on i.id = ip.input_id where i.date=:date", nativeQuery = true)
    List<InputProduct> findByDate(Date date);


    List<InputProduct> getByExpireDate(Date date);


}
