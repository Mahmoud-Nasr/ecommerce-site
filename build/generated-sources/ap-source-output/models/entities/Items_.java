package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.Categories;
import models.entities.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T17:14:33")
@StaticMetamodel(Items.class)
public class Items_ { 

    public static volatile SingularAttribute<Items, String> itemName;
    public static volatile SingularAttribute<Items, Boolean> isDeleted;
    public static volatile SingularAttribute<Items, Integer> price;
    public static volatile SingularAttribute<Items, String> imageURL;
    public static volatile SingularAttribute<Items, String> description;
    public static volatile SingularAttribute<Items, Integer> id;
    public static volatile SingularAttribute<Items, Users> userId;
    public static volatile SingularAttribute<Items, Categories> categoryId;

}