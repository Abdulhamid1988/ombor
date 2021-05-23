package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Category;

@Projection(types = Category.class)
public interface CategoryPr {
    Integer getId();

    String getName();

    boolean getActive();

    Category getParentCategory();
}
