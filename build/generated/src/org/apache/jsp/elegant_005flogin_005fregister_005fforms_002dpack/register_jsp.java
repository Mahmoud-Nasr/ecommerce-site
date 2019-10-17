package org.apache.jsp.elegant_005flogin_005fregister_005fforms_002dpack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\t\n");
      out.write("        <title>Register </title>\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--webfonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lobster|Pacifico:400,700,300|Roboto:400,100,100italic,300,300italic,400italic,500italic,500' ' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,500,600,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--webfonts-->\n");
      out.write("    </head>\n");
      out.write("    <body>\t\n");
      out.write("        <!--start-login-form-->\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"login-head\">\n");
      out.write("                <h1>Cars trending </h1>\n");
      out.write("            </div>\n");
      out.write("            <div  class=\"wrap\">\n");
      out.write("                <div class=\"Regisration\">\n");
      out.write("                    <div class=\"Regisration-head\">\n");
      out.write("                        <a>  <h2 ><span></span>Register</h2></a>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        session.setAttribute("source", "register_user");
                    
      out.write("\n");
      out.write("                    <form method=\"post\" action=\"../servlet\">\n");
      out.write("                        <input type=\"text\" name=\"firstname\" value=\"First Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                                        this.value = 'First Name';\n");
      out.write("                                                                    }\" >\n");
      out.write("                        <input type=\"text\" name=\"lastname\" value=\"Last Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                                            this.value = 'Last Name';\n");
      out.write("                                                                        }\" >\n");
      out.write("                        <input type=\"text\" name=\"username\" value=\"User Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                                            this.value = 'User Name';\n");
      out.write("                                                                        }\" >\n");
      out.write("                        <input type=\"password\" name=\"password\" value=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                                            this.value = 'Password';\n");
      out.write("                                                                        }\" >\n");
      out.write("                        <input type=\"password\" name=\"repassword\" value=\" Confirm Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                                            this.value = ' Confirm Password';\n");
      out.write("                                                                        }\" >\n");
      out.write("                        <div class=\"Remember-me\">\n");
      out.write("                            <div class=\"p-container\">\n");
      out.write("                                <label class=\"checkbox\"><input type=\"checkbox\" name=\"admin\" value=\"ON\"><i></i>Is Admin </label>\n");
      out.write("                                <div class =\"clear\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"submit\">\n");
      out.write("                                <input type=\"submit\"  value=\"Sign Up >\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--//End-login-form-->\t\n");
      out.write("        <div class =\"copy-right\">\n");
      out.write("            <p>Created by <a href=\"#\">ELmnofy Team</a></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
