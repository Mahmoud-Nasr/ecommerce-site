package org.apache.jsp.elegant_005flogin_005fregister_005fforms_002dpack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\t\n");
      out.write("\t\t<title>Login</title>\n");
      out.write("\t\t<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\t\t<!--webfonts-->\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Lobster|Pacifico:400,700,300|Roboto:400,100,100italic,300,300italic,400italic,500italic,500' ' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,600,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<!--webfonts-->\n");
      out.write("\t</head>\n");
      out.write("\t<body>\t\n");
      out.write("            ");

            session.setAttribute("source", "login");
            //session.setAttribute("trying", 1);
            
      out.write("\n");
      out.write("\t\t\t<!--start-login-form-->\n");
      out.write("\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t    \t<div class=\"login-head\">\n");
      out.write("\t\t\t\t\t    <h1>Cars trending</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div  class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"Login-head\">\n");
      out.write("\t\t\t\t\t\t    \t<h3>LOGIN</h3>\n");
      out.write("\t\t\t\t\t\t \t</div>\n");
      out.write("\n");
      out.write("                                            <form method=\"post\" action=\"../servlet\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ticker\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Username</h4>\n");
      out.write("                                                                        <input type=\"text\"  name=\"username\"value=\"User Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'User Name';}\" >\n");
      out.write("\t\t\t\t\t\t  \t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t  \t\t<div>\n");
      out.write("\t\t\t\t\t\t  \t\t<h4>Username</h4>\n");
      out.write("                                                                <input type=\"password\" name=\"password\" value=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Password';}\" >\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"checkbox-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"inline-group green\">\n");
      out.write("                                <label class=\"checkbox\"><input type=\"checkbox\" name=\"admin\" value=\"ON\"><i></i>Is Admin </label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"submit-button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\"  value=\"LOGIN  >\" >\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t  </form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<!--//End-login-form-->\t\n");
      out.write("\t\t\t\t\t\t<div class =\"copy-right\">\n");
      out.write("\t\t\t\t\t\t\t<p>Template by <a href=\"#\">Elmnofy Team</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
