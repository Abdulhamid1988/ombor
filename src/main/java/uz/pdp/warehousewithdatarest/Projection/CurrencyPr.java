package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyPr {

    Integer getId();

    String getName();

    boolean getActive();
}
