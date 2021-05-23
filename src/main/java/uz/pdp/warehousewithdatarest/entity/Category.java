package uz.pdp.warehousewithdatarest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.warehousewithdatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true) //Abs Entity
@Entity
@Data
public class Category extends AbsEntity {

    @ManyToOne
    private Category parentCategory; //null u eng katta kategoriya   pC 2 ,1 qaysidir cat ni ichki kategoriyasi
}
