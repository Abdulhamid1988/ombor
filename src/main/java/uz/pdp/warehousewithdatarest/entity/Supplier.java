package uz.pdp.warehousewithdatarest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.warehousewithdatarest.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true) //Abs Entity
@Entity
@Data
public class Supplier extends AbsEntity {

    @Column(unique = true, nullable = false)
    private String phoneNumber;

}
