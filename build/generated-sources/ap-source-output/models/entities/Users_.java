package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.Items;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T17:14:33")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Items> itemsCollection;
    public static volatile SingularAttribute<Users, Boolean> isBanned;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, Boolean> isAdmin;
    public static volatile SingularAttribute<Users, String> username;

}