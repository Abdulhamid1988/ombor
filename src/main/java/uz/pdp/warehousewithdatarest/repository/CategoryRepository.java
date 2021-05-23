package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.CategoryPr;
import uz.pdp.warehousewithdatarest.entity.Category;

@RepositoryRestResource(path = "category",collectionResourceRel = "category",excerptProjection = CategoryPr.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}

