package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WareHousePr {

    Integer getId();

    String getName();

    Boolean getActive();
}
