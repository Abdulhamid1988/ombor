package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.OutputPr;
import uz.pdp.warehousewithdatarest.entity.Output;

@RepositoryRestResource(path = "output",collectionResourceRel = "Output list",excerptProjection = OutputPr.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {

}
