package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Client;

@Projection(types = Client.class)
public interface ClientPr {

    Integer getId();

    String getName();

    String getPhoneNumber();
}
