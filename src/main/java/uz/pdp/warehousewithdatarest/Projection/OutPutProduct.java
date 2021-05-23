package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Output;
import uz.pdp.warehousewithdatarest.entity.OutputProduct;
import uz.pdp.warehousewithdatarest.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutPutProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
