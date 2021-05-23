package uz.pdp.warehousewithdatarest.entity;



import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.warehousewithdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true) //Abs Entity
@Entity
@Data
public class Warehouse extends AbsEntity {



}
