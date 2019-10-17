<%-- 
    Document   : login
    Created on : May 14, 2017, 4:35:49 PM
    Author     : mahmoud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
	<head>	
		<title>Login</title>
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--webfonts-->
		<link href='http://fonts.googleapis.com/css?family=Lobster|Pacifico:400,700,300|Roboto:400,100,100italic,300,300italic,400italic,500italic,500' ' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,600,700,300' rel='stylesheet' type='text/css'>
		<!--webfonts-->
	</head>
	<body>	
            <%
            session.setAttribute("source", "login");
            //session.setAttribute("trying", 1);
            %>
			<!--start-login-form-->
				<div class="main">
			    	<div class="login-head">
					    <h1>Cars trending</h1>
					</div>
					<div  class="wrap">
						
					<div class="Login">
							<div class="Login-head">
						    	<h3>LOGIN</h3>
						 	</div>

                                            <form method="post" action="../servlet">
								<div class="ticker">
									<h4>Username</h4>
                                                                        <input type="text"  name="username"value="User Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Name';}" >
						  			<div class="clear"> </div>
						  		</div>
						  		<div>
						  		<h4>Username</h4>
                                                                <input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" >
								  			<div class="clear"> </div>
								</div>
								<div class="checkbox-grid">
									<div class="inline-group green">
                                <label class="checkbox"><input type="checkbox" name="admin" value="ON"><i></i>Is Admin </label>
									<div class="clear"> </div>
									</div>

								</div>
												 
								<div class="submit-button">
									<input type="submit"  value="LOGIN  >" >
								</div>
									<div class="clear"> </div>
								</div>
											
						  </form>
					</div>
			</div>
				<!--//End-login-form-->	
						<div class ="copy-right">
							<p>Template by <a href="#">Elmnofy Team</a></p>
						</div>
			  </div>
	</body>
</html>


