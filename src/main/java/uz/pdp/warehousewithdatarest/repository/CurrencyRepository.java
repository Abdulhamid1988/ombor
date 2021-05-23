package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.warehousewithdatarest.Projection.CurrencyPr;
import uz.pdp.warehousewithdatarest.entity.Currency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "currencyList",excerptProjection = CurrencyPr.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {


}
