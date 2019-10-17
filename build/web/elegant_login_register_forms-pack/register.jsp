<%-- 
    Document   : register
    Created on : May 14, 2017, 4:10:53 PM
    Author     : mahmoud
--%>

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
    <body>	
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
                        session.setAttribute("source", "register_user");
                    %>
                    <form method="post" action="../servlet">
                        <input type="text" name="firstname" value="First Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                        this.value = 'First Name';
                                                                    }" >
                        <input type="text" name="lastname" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                            this.value = 'Last Name';
                                                                        }" >
                        <input type="text" name="username" value="User Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                            this.value = 'User Name';
                                                                        }" >
                        <input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                            this.value = 'Password';
                                                                        }" >
                        <input type="password" name="repassword" value=" Confirm Password" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                            this.value = ' Confirm Password';
                                                                        }" >
                        <div class="Remember-me">
                            <div class="p-container">
                                <label class="checkbox"><input type="checkbox" name="admin" value="ON"><i></i>Is Admin </label>
                                <div class ="clear"></div>
                            </div>

                            <div class="submit">
                                <input type="submit"  value="Sign Up >" >
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


