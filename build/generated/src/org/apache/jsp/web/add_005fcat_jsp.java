package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fcat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Free Cars-Online Website Template | New :: w3layouts</title>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");
  
            try{
Boolean string =(Boolean)session.getAttribute("isAdmin");
if(string.equals(true) )
            { 
        session.setAttribute("source", "add_cat");
            }else{
            response.sendRedirect("index.jsp");
            }}catch(Exception e){
            response.sendRedirect("index.jsp");
            }
        
      out.write("\r\n");
      out.write("        <div class=\"header-bg\">\r\n");
      out.write("            <div class=\"wrap\"> \r\n");
      out.write("                <div class=\"h-bg\">\r\n");
      out.write("                    <div class=\"total\">\r\n");
      out.write("                        <div class=\"header\">\r\n");
      out.write("                            <div class=\"box_header_user_menu\">\r\n");
      out.write("                                <ul class=\"user_menu\"><li class=\"act first\"><a href=\"\"><div class=\"button-t\"><span>Cars Trending</span></div></a></li><li><a href=\"index.jsp\"><div class=\"button-t\"><span>Logout</span></div></a></li></ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"header-right\">\r\n");
      out.write("                                <ul class=\"follow_icon\">\r\n");
      out.write("                                    <li><a href=\"#\"><img src=\"images/icon.png\" alt=\"\"/></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img src=\"images/icon1.png\" alt=\"\"/></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img src=\"images/icon2.png\" alt=\"\"/></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><img src=\"images/icon3.png\" alt=\"\"/></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div><div class=\"clear\"></div> \r\n");
      out.write("                            <div class=\"header-bot\">\r\n");
      out.write("                                <div class=\"logo\">\r\n");
      out.write("                                    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"/></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"search\">\r\n");
      out.write("                                    <input type=\"text\" class=\"textbox\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\r\n");
      out.write("                                                this.value = '';\r\n");
      out.write("                                            }\">\r\n");
      out.write("                                    <button class=\"gray-button\"><span>Search</span></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clear\"></div> \r\n");
      out.write("                            </div>\t\t\r\n");
      out.write("                        </div>\t\r\n");
      out.write("                        <div class=\"menu\"> \t\r\n");
      out.write("                            <div class=\"top-nav\"> \r\n");
      out.write("                                <ul>\r\n");
      out.write("                                     <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                    <li><a href=\"specials.jsp\">Specials</a></li>\r\n");
      out.write("                                    <li ><a href=\"new.jsp\">New</a></li>\r\n");
      out.write("                                    <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                    <li><a href=\"remove.jsp\">remove user</a></li>\r\n");
      out.write("                                    <li><a href=\"edit.jsp\">edit user</a></li>\r\n");
      out.write("                                    <li><a href=\"remove_cat.jsp\">remove categories</a></li>\r\n");
      out.write("                                    <li class=\"active\"><a href=\"add_cat.jsp\">add categories</a></li>\r\n");
      out.write("                                    <li><a href=\"add_item.jsp\">add Item</a></li>\r\n");
      out.write("                                    <li><a href=\"remove_item.jsp\">remove Item</a></li>\r\n");
      out.write("                                    <li><a href=\"edit_item.jsp\">Edit Item</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"clear\"></div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"banner-top\">\r\n");
      out.write("                            <div class=\"header-bottom\">\r\n");
      out.write("                                <div class=\"header_bottom_right_images\">\r\n");
      out.write("                                        <div class=\"content-wrapper\">\r\n");
      out.write("                                    \r\n");
      out.write("                                            <form action=\"../servlet\" method=\"POST\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                <input type=\"text\" name=\"username\" value=\"\" required=\"true\"/><br/>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <input type=\"submit\" value=\"add\" />\r\n");
      out.write("                                                \r\n");
      out.write("                                                \r\n");
      out.write("                                            </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"header-para\">\r\n");
      out.write("                                    <div class=\"categories\">\r\n");
      out.write("                                        <div class=\"list-categories\">\r\n");
      out.write("                                            <div class=\"first-list\">\r\n");
      out.write("                                                <div class=\"div_2\"><a href=\"\">Cars</a></div>\r\n");
      out.write("                                                <div class=\"div_img\">\r\n");
      out.write("                                                    <img src=\"images/car1.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("                                                </div><div class=\"clear\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"first-list\">\r\n");
      out.write("                                                <div class=\"div_2\"><a href=\"\">Rental</a></div>\r\n");
      out.write("                                                <div class=\"div_img\">\r\n");
      out.write("                                                    <img src=\"images/car2.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("                                                </div><div class=\"clear\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"first-list\">\r\n");
      out.write("                                                <div class=\"div_2\"><a href=\"\">Banking</a></div>\r\n");
      out.write("                                                <div class=\"div_img\">\r\n");
      out.write("                                                    <img src=\"images/car3.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("                                                </div><div class=\"clear\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"first-list\">\r\n");
      out.write("                                                <div class=\"div_2\"><a href=\"\">Trucks</a></div>\r\n");
      out.write("                                                <div class=\"div_img\">\r\n");
      out.write("                                                    <img src=\"images/car4.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("                                                </div><div class=\"clear\"></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"box\"> \r\n");
      out.write("                                            <div class=\"box-heading\"><h1><a href=\"#\">Cart:&nbsp;</a></h1></div>\r\n");
      out.write("                                            <div class=\"box-content\">\r\n");
      out.write("                                                Now in your cart&nbsp;<strong> 0 items</strong>\r\n");
      out.write("                                            </div>\t\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"box-title\">\r\n");
      out.write("                                            <h1><span class=\"title-icon\"></span><a href=\"\">Specials</a></h1>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"section group example\">\r\n");
      out.write("                                            <div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("                                                <img src=\"images/pic21.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic24.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic25.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic27.jpg\" alt=\"\"/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("                                                <img src=\"images/pic22.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic23.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic26.jpg\" alt=\"\"/>\r\n");
      out.write("                                                <img src=\"images/pic28.jpg\" alt=\"\"/>\r\n");
      out.write("                                            </div><div class=\"clear\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                                <div class=\"footer-bottom\">\r\n");
      out.write("                                    <div class=\"copy\">\r\n");
      out.write("                                        <p>All rights Reserved | Design by <a href=\"http://w3layouts.com\">W3Layouts</a></p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
