package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.User;
import uz.pdp.warehousewithdatarest.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface UserPr {

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getPassword();

    Boolean getActive();

    Set<Warehouse> getWarehouses();
}
