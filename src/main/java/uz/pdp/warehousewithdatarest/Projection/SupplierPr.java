package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierPr {

    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}
