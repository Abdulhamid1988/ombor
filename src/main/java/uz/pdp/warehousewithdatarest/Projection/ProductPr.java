package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Attachment;
import uz.pdp.warehousewithdatarest.entity.Category;
import uz.pdp.warehousewithdatarest.entity.Measurement;
import uz.pdp.warehousewithdatarest.entity.Product;

@Projection(types = Product.class)
public interface ProductPr {

    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();

    Attachment getAttachment();

    String getCode();


    Measurement getMeasurement();



}
