/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.beans.UsersFacade;
import models.entities.Users;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import models.beans.CategoriesFacade;
import models.beans.ItemsFacade;
import models.entities.Categories;
import models.entities.Items;

/**
 *
 * @author mahmoud
 */
public class servlet extends HttpServlet {

    @EJB
    private UsersFacade UsersFacade;
    @EJB
    private CategoriesFacade categoriesFacade;
    @EJB
    private ItemsFacade itemsFacade;
        
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    public List<Users> users;
    public Users Editable;
    public Items itemsEditable;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String source = (String) request.getSession().getAttribute("source");
        String name, pass, firstname, lastname, admin, repeatpass;
                        String price,description;

        switch (source) {

            case "register_user":
                name = request.getParameter("username");
                pass = request.getParameter("password");
                firstname = request.getParameter("firstname");
                lastname = request.getParameter("lastname");
                admin = request.getParameter("admin");
                repeatpass = request.getParameter("repassword");
                Users u = new Users();
                u.setFirstName(firstname);
                u.setLastName(lastname);
                u.setUsername(name);
                if (pass.equals(repeatpass)) {
                    u.setPassword(pass);
                } else {
                    //response.getWriter().println("<h2>please write password identical</h2>");
                    // request.getRequestDispatcher("/elegant_login_register_forms-pack/register.jsp").include(request, response);

                    response.sendRedirect("/ecommerce_2/elegant_login_register_forms-pack/register.jsp");
                    break;
                }
                // u.setId(0);
                if (admin != null && admin.equals("ON")) {
                    u.setIsAdmin(true);
                } else {
                    u.setIsAdmin(false);
                }
                u.setIsBanned(false);

                UsersFacade.create(u);
                
                if(u.getIsAdmin()){
                response.sendRedirect("/ecommerce_2/web/new.jsp");
}
                else{
                                response.sendRedirect("/ecommerce_2/web/new_foruser.jsp");

                
                }
                break;

            case "login":
                Users result;
                name = request.getParameter("username");
                pass = request.getParameter("password");
                admin = request.getParameter("admin");
                if (admin != null && admin.equals("ON")) {
                    result = UsersFacade.find(name, pass, true);

                } else {
                    result = UsersFacade.find(name, pass, false);

                }
                if (result == null) {
                    
                    response.sendRedirect("/ecommerce_2/elegant_login_register_forms-pack/login.jsp");
                    break;

                } else {

                    request.getSession().setAttribute("currentuserid", result.getId());
                    request.getSession().setAttribute("isAdmin", true);
                    if(result.getIsAdmin()){
                    
                    response.sendRedirect("/ecommerce_2/web/new.jsp");
                    break;
                    }else{
                    response.sendRedirect("/ecommerce_2/web/new_foruser.jsp");
                    break;
                    }
                }

            case "remove":
                name = request.getParameter("username");
                UsersFacade.remove(Integer.parseInt(name));
                response.sendRedirect("/ecommerce_2/web/new.jsp");

                break;
            case "Edit":
                name = request.getParameter("username");
                Editable = UsersFacade.find(Integer.parseInt(name));
                if (Editable == null) {

                    response.sendRedirect("/ecommerce_2/web/edit.jsp");
                    break;
                }
                request.getSession().setAttribute("editable", Editable);
                response.sendRedirect("/ecommerce_2/elegant_login_register_forms-pack/edit.jsp");

                break;
            case "update":
                name = request.getParameter("username");
                pass = request.getParameter("password");
                firstname = request.getParameter("firstname");
                lastname = request.getParameter("lastname");
                admin = request.getParameter("admin");
                repeatpass = request.getParameter("repassword");
                Users up = new Users();
                up.setFirstName(firstname);
                up.setLastName(lastname);
                up.setUsername(name);
                up.setId(Editable.getId());
                if (pass.equals(repeatpass)) {
                    up.setPassword(pass);
                } else {
                    //response.getWriter().println("<h2>please write password identical</h2>");
                    // request.getRequestDispatcher("/elegant_login_register_forms-pack/register.jsp").include(request, response);

                    response.sendRedirect("/ecommerce_2/elegant_login_register_forms-pack/edit.jsp");
                }
                // u.setId(0);
                if (admin != null && !admin.isEmpty()) {
                    up.setIsAdmin(true);
                } else {
                    up.setIsAdmin(false);
                }
                up.setIsBanned(false);

                UsersFacade.update(up);
                response.sendRedirect("/ecommerce_2/web/new.jsp");

                break;
            case "add_cat":
                name = request.getParameter("username");
                Categories categories = new Categories();
                categories.setCategoryName(name);
                categoriesFacade.create(categories);
                response.sendRedirect("/ecommerce_2/web/new.jsp");

                break;
            case "remove_cat":
                name = request.getParameter("username");
                categoriesFacade.remove(Integer.parseInt(name));
                response.sendRedirect("/ecommerce_2/web/new.jsp");
                break;

            case "add_item":
                name=request.getParameter("username");
                price=request.getParameter("price");
                description=request.getParameter("description");
                Items items =new Items();
                items.setDescription(description);
                items.setItemName(name);
                items.setPrice(Integer.parseInt(price));
                itemsFacade.create(items);
                response.sendRedirect("/ecommerce_2/web/new.jsp");
                break;
            case "remove_item":
                name = request.getParameter("username");
                itemsFacade.remove(Integer.parseInt(name));
                response.sendRedirect("/ecommerce_2/web/new.jsp");
                
                break;
            case "edit_item":
                name = request.getParameter("username");
                itemsEditable = itemsFacade.find(Integer.parseInt(name));
                if (itemsEditable == null) {

                    response.sendRedirect("/ecommerce_2/web/edit_item.jsp");
                    break;
                }
                request.getSession().setAttribute("editableItem", itemsEditable);
                response.sendRedirect("/ecommerce_2/elegant_login_register_forms-pack/edit_item.jsp");

                break;
            case "update_item":
                name=request.getParameter("username");
                price=request.getParameter("price");
                description=request.getParameter("description");
                Items ups =new Items();
                ups.setDescription(description);
                ups.setItemName(name);
                ups.setId(itemsEditable.getId());
                ups.setPrice(Integer.parseInt(price));
                itemsFacade.update(ups);
                response.sendRedirect("/ecommerce_2/web/new.jsp");

              
                
                break;
                
              case "external":
                  List<Categories> categorieses=allCat();
                  request.getSession().setAttribute("categories", categorieses);
                  response.sendRedirect("/ecommerce_2/web/add_item.jsp");

                  
                  break;
                
            default:
                response.sendRedirect("/ecommerce_2/web/new.jsp");
                break;
        }
    }

    public List<Categories> allCat(){
        categoriesFacade=new CategoriesFacade();
    return categoriesFacade.findAll();
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
