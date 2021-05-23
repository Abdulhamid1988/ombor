package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousewithdatarest.Projection.InputPr;
import uz.pdp.warehousewithdatarest.entity.Input;

@RepositoryRestResource(path = "Input",collectionResourceRel = "inputs",excerptProjection = InputPr.class)
public interface InputRepository extends JpaRepository<Input,Integer> {


}
