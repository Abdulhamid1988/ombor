package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.ProductPr;
import uz.pdp.warehousewithdatarest.entity.Product;

@RepositoryRestResource(path = "product",collectionResourceRel = "productsList",excerptProjection = ProductPr.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product existsByNameAndCategoryId(String name,Integer categoryId);

}
