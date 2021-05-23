package uz.pdp.warehousewithdatarest.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousewithdatarest.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementPr {

    Integer getId();

    String getName();

    boolean getActive();
}
