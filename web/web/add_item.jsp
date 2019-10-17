<%@page import="models.entities.Categories"%>
<%@page import="java.util.List"%>
<%@page import="models.beans.CategoriesFacade"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
    <head>
        <title>Cars Trending</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
    </head>
    <body>
        <jsp:useBean id="obj" scope="page" class="servlets.servlet" />
        <%
           try{ Integer  string=(Integer) session.getAttribute("currentuserid");
            
            if( string != null ){
        session.setAttribute("source", "add_item");
                 }else
            {
            response.sendRedirect("index.jsp");
            
            
            }}catch(Exception e){
            response.sendRedirect("index.jsp");
           
            }
            
       // CategoriesFacade categoriesFacade =new CategoriesFacade();
        
        
        %>
        <div class="header-bg">
            <div class="wrap"> 
                <div class="h-bg">
                    <div class="total">
                        <div class="header">
                            <div class="box_header_user_menu">
                                <ul class="user_menu"><li class="act first"><a href=""><div class="button-t"><span>Cars Trending</span></div></a></li><li><a href="index.jsp"><div onclick="<% session.setAttribute("isAdmin", false); %>"  class="button-t"><span>Logout</span></div></a></li></ul>
                            </div>
                            <div class="header-right">
                                <ul class="follow_icon">
                                    <li><a href="#"><img src="images/icon.png" alt=""/></a></li>
                                    <li><a href="#"><img src="images/icon1.png" alt=""/></a></li>
                                    <li><a href="#"><img src="images/icon2.png" alt=""/></a></li>
                                    <li><a href="#"><img src="images/icon3.png" alt=""/></a></li>
                                </ul>
                            </div><div class="clear"></div> 
                            <div class="header-bot">
                                <div class="logo">
                                    <a href="index.html"><img src="images/logo.png" alt=""/></a>
                                </div>
                                <div class="search">
                                    <input type="text" class="textbox" value="" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                this.value = '';
                                            }">
                                    <button class="gray-button"><span>Search</span></button>
                                </div>
                                <div class="clear"></div> 
                            </div>		
                        </div>	
                        <div class="menu"> 	
                            <div class="top-nav"> 
                                <ul>
                                     <li><a href="index.jsp">Home</a></li>
                                    <li><a href="specials.jsp">Specials</a></li>
                                    <li ><a href="new.jsp">New</a></li>
                                    <li><a href="contact.jsp">Contact</a></li>
                                    <li><a href="remove.jsp">remove user</a></li>
                                    <li><a href="edit.jsp">edit user</a></li>
                                    <li><a href="remove_cat.jsp">remove categories</a></li>
                                    <li><a href="add_cat.jsp">add categories</a></li>
                                    <li class="active"><a href="add_item.jsp">add Item</a></li>
                                    <li><a href="remove_item.jsp">remove Item</a></li>
                                    <li><a href="edit_item.jsp">Edit Item</a></li>
                                </ul>
                                <div class="clear"></div> 
                            </div>
                        </div>
                        <div class="banner-top">
                            <div class="header-bottom">
                                <div class="header_bottom_right_images">
                                    <div class="content-wrapper">
                                        
                                        <form action="../servlet" method="POST">

                                            Name: <input type="text" name="username" value="" required="true"/><br/>
                                            Price:<input type="number" name="price" value="" /><br/>
                                            Description:<textarea name="description" rows="4" cols="20">
                                             
                                                        </textarea><br/>
                                                   <!--    Categorie :<select name="drowpdown">
                                                        <         List<Categories > cs= (List<Categories>)session.getAttribute("categories");

                                                                int i=0;
                                                            while(i<cs.size()){
                                                                out.print("<option value="+cs.get(i).getId() +">"+cs.get(i).getCategoryName() +"</option>");
                                                        i++;
                                                            }
                                                           
                                                        >
                                                           </select> 
                                           -->
                                            <input type="submit" value="add" />


                                        </form>
                                    </div>













                                </div>
                                <div class="header-para">
                                    <div class="categories">
                                        <div class="list-categories">
                                            <div class="first-list">
                                                <div class="div_2"><a href="">Cars</a></div>
                                                <div class="div_img">
                                                    <img src="images/car1.jpg" alt="Cars" title="Cars" width="60" height="39">
                                                </div><div class="clear"></div>
                                            </div>
                                            <div class="first-list">
                                                <div class="div_2"><a href="">Rental</a></div>
                                                <div class="div_img">
                                                    <img src="images/car2.jpg" alt="Cars" title="Cars" width="60" height="39">
                                                </div><div class="clear"></div>
                                            </div>
                                            <div class="first-list">
                                                <div class="div_2"><a href="">Banking</a></div>
                                                <div class="div_img">
                                                    <img src="images/car3.jpg" alt="Cars" title="Cars" width="60" height="39">
                                                </div><div class="clear"></div>
                                            </div>
                                            <div class="first-list">
                                                <div class="div_2"><a href="">Trucks</a></div>
                                                <div class="div_img">
                                                    <img src="images/car4.jpg" alt="Cars" title="Cars" width="60" height="39">
                                                </div><div class="clear"></div>
                                            </div>
                                        </div>
                                        <div class="box"> 
                                            <div class="box-heading"><h1><a href="#">Cart:&nbsp;</a></h1></div>
                                            <div class="box-content">
                                                Now in your cart&nbsp;<strong> 0 items</strong>
                                            </div>	
                                        </div>
                                        <div class="box-title">
                                            <h1><span class="title-icon"></span><a href="">Specials</a></h1>
                                        </div>
                                        <div class="section group example">
                                            <div class="col_1_of_2 span_1_of_2">
                                                <img src="images/pic21.jpg" alt=""/>
                                                <img src="images/pic24.jpg" alt=""/>
                                                <img src="images/pic25.jpg" alt=""/>
                                                <img src="images/pic27.jpg" alt=""/>
                                            </div>
                                            <div class="col_1_of_2 span_1_of_2">
                                                <img src="images/pic22.jpg" alt=""/>
                                                <img src="images/pic23.jpg" alt=""/>
                                                <img src="images/pic26.jpg" alt=""/>
                                                <img src="images/pic28.jpg" alt=""/>
                                            </div><div class="clear"></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="clear"></div>
                                <div class="footer-bottom">
                                    <div class="copy">
                                        <p>All rights Reserved | Design by <a href="http://w3layouts.com">W3Layouts</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>



