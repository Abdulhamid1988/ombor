package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Client;
import uz.pdp.warehousewithdatarest.entity.Currency;
import uz.pdp.warehousewithdatarest.entity.Output;
import uz.pdp.warehousewithdatarest.entity.Warehouse;

import java.sql.Date;

@Projection(types = Output.class)
public interface OutputPr {

    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();


}
