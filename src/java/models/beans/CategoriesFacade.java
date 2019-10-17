/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.entities.Categories;

/**
 *
 * @author mahmoud
 */
@Stateless
public class CategoriesFacade extends AbstractFacade<Categories> {
    @PersistenceContext(unitName = "ecommerce_2PU")
    private EntityManager em ;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriesFacade() {
        super(Categories.class);
    }
    @Override
    public void create(Categories c){
        Query query=em.createNativeQuery("INSERT INTO Categories(CategoryName)VALUES(?)");
        query.setParameter(1, c.getCategoryName());
        query.executeUpdate();
        
        
    }
    @Override
    public List<Categories> findAll(){
    Query query = em.createNativeQuery("SELECT a.Id , a.CategoryName FROM Categories a",Categories.class);
    List<Categories> categorieses= query.getResultList();
    return categorieses;
    }
    
    public  void remove(int id){
     Query q = em.createNativeQuery("DELETE from Categories WHERE Id = ?");
        q.setParameter(1, id);
        q.executeUpdate();
    }
   
    
}
