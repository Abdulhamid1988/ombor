package uz.pdp.warehousewithdatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousewithdatarest.Projection.ClientPr;
import uz.pdp.warehousewithdatarest.entity.Client;

@RepositoryRestResource(path = "client",collectionResourceRel = "ClientList",excerptProjection = ClientPr.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
