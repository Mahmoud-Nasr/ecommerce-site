<%-- 
    Document   : register
    Created on : May 14, 2017, 4:10:53 PM
    Author     : mahmoud
--%>

<%@page import="models.entities.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>	
        <title>Register </title>
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--webfonts-->
        <link href='http://fonts.googleapis.com/css?family=Lobster|Pacifico:400,700,300|Roboto:400,100,100italic,300,300italic,400italic,500italic,500' ' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,600,700,300' rel='stylesheet' type='text/css'>
        <!--webfonts-->
    </head>
    <body>	<jsp:useBean id="obj" scope="page" class="servlets.servlet" />
        <!--start-login-form-->
        <div class="main">
            <div class="login-head">
                <h1>Cars trending </h1>
            </div>
            <div  class="wrap">
                <div class="Regisration">
                    <div class="Regisration-head">
                        <a>  <h2 ><span></span>Register</h2></a>
                    </div>
                    <%
                         Users user=new Users();
                        try{
Boolean string =(Boolean)session.getAttribute("isAdmin");
if(string.equals(true))
            { 
                session.setAttribute("source", "update");
                       user= (Users) session.getAttribute("editable"); 
            }else{
            session.invalidate();
            response.sendRedirect("index.jsp");
            }}catch(Exception e){
            response.sendRedirect("index.jsp");}
                    %>
                    <form method="post" action="../servlet">
                        <input type="text" name="firstname" value="<%= user.getFirstName() %>"   >
                        <input type="text" name="lastname" value="<%= user.getLastName() %>"  >
                        <input type="text" name="username" value="<%= user.getUsername() %>"  >
                        <input type="password" name="password" value="<%= user.getPassword() %>"  >
                        <input type="password" name="repassword" value="<%= user.getPassword() %>"  >
                        <div class="Remember-me">
                            <div class="p-container">
                                <label class="checkbox"><input type="checkbox" name="admin"  <%  if (user.getIsAdmin().equals(true)){out.print("disabled=\"true\""); } %> ><i></i>Is Admin </label>
                                <div class ="clear"></div>
                            </div>

                            <div class="submit">
                                <input type="submit"  value="Update >" >
                            </div>
                            <div class="clear"> </div>
                        </div>

                    </form>
                </div>


                </form>
            </div>
        </div>
        <!--//End-login-form-->	
        <div class ="copy-right">
            <p>Created by <a href="#">ELmnofy Team</a></p>
        </div>
    </div>
</body>
</html>


