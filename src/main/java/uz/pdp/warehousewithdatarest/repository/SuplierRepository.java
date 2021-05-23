package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousewithdatarest.Projection.SupplierPr;
import uz.pdp.warehousewithdatarest.entity.Supplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "supplier",excerptProjection = SupplierPr.class)
public interface SuplierRepository extends JpaRepository<Supplier,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);
}
