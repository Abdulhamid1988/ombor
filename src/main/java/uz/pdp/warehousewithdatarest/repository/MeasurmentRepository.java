package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.MeasurementPr;
import uz.pdp.warehousewithdatarest.entity.Measurement;

@RepositoryRestResource(path = "Measuremnet",collectionResourceRel = "Meas",excerptProjection = MeasurementPr.class)
public interface MeasurmentRepository extends JpaRepository<Measurement,Integer> {

    boolean existsByName(String name);
}
