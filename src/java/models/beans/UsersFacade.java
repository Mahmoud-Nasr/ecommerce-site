/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import models.entities.Users;

/**
 *
 * @author mahmoud
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "ecommerce_2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }

    @Override
    public void create(Users users) {
        try {
            Query q = em.createNativeQuery("INSERT INTO Users (Username ,FirstName,LastName,Password,IsAdmin,IsBanned) VALUES"
                    + "(? ,? ,? ,?,?,?)");

            q.setParameter(1, users.getUsername());
            q.setParameter(2, users.getFirstName());
            q.setParameter(3, users.getLastName());
            q.setParameter(4, users.getPassword());
            q.setParameter(5, users.getIsAdmin());
            q.setParameter(6, users.getIsBanned());
            q.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Users find(String name, String password, boolean admin) {
        Query q = em.createNativeQuery("SELECT  a.Id,a.Username ,a.FirstName,a.LastName,a.Password,a.IsAdmin,a.IsBanned FROM Users a WHERE  a.Username = ? AND a.Password = ? AND a.IsAdmin=?", Users.class);
        q.setParameter(1, name);
        q.setParameter(2, password);
        q.setParameter(3, admin);
        try {
            Users x = (Users) q.getSingleResult();
            return x;
        } catch (Exception e) {
            return null;
        }

    }

    public Users find(int id) {
        Query q = em.createNativeQuery("SELECT  a.Id,a.Username ,a.FirstName,a.LastName,a.Password,a.IsAdmin,a.IsBanned FROM Users a WHERE  a.Id = ? ", Users.class);
        q.setParameter(1, id);

        try {
            Users x = (Users) q.getSingleResult();
            return x;
        } catch (Exception e) {
            return null;
        }

    }

    public List<Users> ListAll() {

        Query q = em.createNativeQuery("select Id,Username from Users");

        List<Users> x = q.getResultList();
        return x;

    }

    public void remove(int id) {

        Query q = em.createNativeQuery("DELETE from Users WHERE Id = ?");
        q.setParameter(1, id);
        q.executeUpdate();

    }

    public void update(Users user) {

        Query query = em.createNativeQuery("UPDATE Users SET Username = ?,FirstName = ?,LastName =  ?,Password = ?,IsBanned = ?,IsAdmin =?  WHERE Id = ? ");
        query.setParameter(1, user.getUsername()); 
        query.setParameter(2, user.getFirstName());
        query.setParameter(3, user.getLastName());
        query.setParameter(4, user.getPassword());
        query.setParameter(5, user.getIsBanned());
        query.setParameter(6, user.getIsAdmin());
        query.setParameter(7, user.getId());
        query.executeUpdate();

    }

}
