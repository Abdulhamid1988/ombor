package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Currency;
import uz.pdp.warehousewithdatarest.entity.Input;
import uz.pdp.warehousewithdatarest.entity.Supplier;
import uz.pdp.warehousewithdatarest.entity.Warehouse;

import java.sql.Date;

@Projection(types = Input.class)
public interface InputPr {

    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

}
