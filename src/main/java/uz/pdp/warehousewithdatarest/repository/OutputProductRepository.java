package uz.pdp.warehousewithdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.OutputPr;
import uz.pdp.warehousewithdatarest.entity.OutputProduct;


@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "Output Product",excerptProjection = OutputPr.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {


}
