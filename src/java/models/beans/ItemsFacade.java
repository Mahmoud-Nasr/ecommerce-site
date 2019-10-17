/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import models.entities.Items;

/**
 *
 * @author mahmoud
 */
@Stateless
public class ItemsFacade extends AbstractFacade<Items> {
    @PersistenceContext(unitName = "ecommerce_2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemsFacade() {
        super(Items.class);
    }
    
    @Override
    public void create(Items items){
        Query query =em.createNativeQuery("INSERT INTO Items(ItemName,Price,Description,ImageURL,UserId,CategoryId,IsDeleted)VALUES"+
                "(?,?,?,?,?,?,?)");
        query.setParameter(1, items.getItemName());
        query.setParameter(2, items.getPrice());
        query.setParameter(3, items.getDescription());
        query.setParameter(4, "");
        query.setParameter(5, 1);
        query.setParameter(6, 1);
        query.setParameter(7, false);
        query.executeUpdate();
        
    }
     public Items find(int id) {
        Query q = em.createNativeQuery("SELECT  a.Id,a.ItemName ,a.Price,a.Description FROM Items a WHERE  a.Id = ? ", Items.class);
        q.setParameter(1, id);

        try {
            Items x = (Items) q.getSingleResult();
            return x;
        } catch (Exception e) {
            return null;
        }

    }
    public void remove(int id ){
     Query q = em.createNativeQuery("DELETE from Items WHERE Id = ?");
        q.setParameter(1, id);
        q.executeUpdate();
    
    }

   
    public void update(Items ups) {
         Query query = em.createNativeQuery("UPDATE Items SET ItemName = ?,Price = ?,Description =  ?  WHERE Id = ? ");
       query.setParameter(1, ups.getItemName());
        query.setParameter(2, ups.getPrice());
        query.setParameter(3, ups.getDescription());
        query.setParameter(4, ups.getId());
      
        query.executeUpdate();
        
    }
    
    
}
