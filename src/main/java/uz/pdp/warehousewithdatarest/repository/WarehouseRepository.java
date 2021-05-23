package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.warehousewithdatarest.Projection.WareHousePr;
import uz.pdp.warehousewithdatarest.entity.Warehouse;

import java.util.List;

@RepositoryRestResource(path = "Warehouse",collectionResourceRel = "wareHouseDb",excerptProjection = WareHousePr.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    boolean existsByName(String name);





    //@RestResource(path = "name",rel = "name")

    //  public List<Warehouse> findByNameStartsWith(@Param("name")String street);
}
