package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("        <title>Cars Trending</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   \r\n");
      out.write("<!--slider-->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/superfish.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header-bg\">\r\n");
      out.write("\t<div class=\"wrap\"> \r\n");
      out.write("\t\t<div class=\"h-bg\">\r\n");
      out.write("\t\t\t<div class=\"total\">\r\n");
      out.write("\t\t\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box_header_user_menu\">\r\n");
      out.write("                                            <ul class=\"user_menu\"><li class=\"act first\"><a href=\"\"><div class=\"button-t\"><span>Cars Trending</span></div></a></li><li class=\"\"><a href=\"../elegant_login_register_forms-pack/register.jsp\"><div class=\"button-t\"><span>Create an Account</span></div></a></li><li class=\"last\"><a href=\"../elegant_login_register_forms-pack/login.jsp\"><div class=\"button-t\"><span>Log in</span></div></a></li></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"follow_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon.png\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon1.png\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon2.png\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon3.png\" alt=\"\"/></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div><div class=\"clear\"></div> \r\n");
      out.write("\t\t\t\t\t<div class=\"header-bot\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" class=\"textbox\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t    <button class=\"gray-button\"><span>Search</span></button>\r\n");
      out.write("\t\t\t\t       </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div> \r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t<div class=\"menu\"> \t\r\n");
      out.write("\t\t\t<div class=\"top-nav\"> \r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"specials.jsp\">Specials</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"new.jsp\">New</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"banner-top\">\r\n");
      out.write("\t\t\t<div class=\"header-bottom\">\r\n");
      out.write("\t\t\t\t <div class=\"header_bottom_right_images\">\r\n");
      out.write("\t\t\t\t     \t<div id=\"slideshow\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a href=\"details.html\"><canvas ></canvas><img src=\"images/banner4.jpg\" alt=\"Marsa Alam underawter close up\" ></a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"details.html\"><canvas></canvas><img src=\"images/banner2.jpg\" alt=\"Turrimetta Beach - Dawn\" ></a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"details.html\"><canvas></canvas><img src=\"images/banner3.jpg\" alt=\"Power Station\" ></a></li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"details.html\"><canvas></canvas><img src=\"images/banner1.jpg\" alt=\"Colors of Nature\" ></a></li>\r\n");
      out.write("\t\t\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t\t\t    <span class=\"arrow previous\"></span>\r\n");
      out.write("\t\t\t\t\t\t    <span class=\"arrow next\"></span>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t  \t\t\t<div class=\"content-wrapper\">\t\t  \r\n");
      out.write("\t\t\t\t\t\t<div class=\"content-top\">\r\n");
      out.write("\t\t\t\t\t\t\t  \t<div class=\"box_wrapper\"><h1>New Products For July</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"text\"> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic5.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic6.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic4.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"content-top\">\r\n");
      out.write("\t\t\t\t\t\t\t  \t<div class=\"box_wrapper\"><h1>Featured Products</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"text\"> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic1.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic2.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"grid_1_of_3 images_1_of_3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"grid_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pic3.jpg\" title=\"continue reading\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"title1\">Lorem ipsum dolor sitconsectetuer adipiscing elit</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <div class=\"price\" style=\"height: 19px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \t <span class=\"reducedfrom\">$66.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t        \t\t\t\t<span class=\"actual\">$12.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart-button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/cart.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"button\"><span>Details</span></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header-para\">\r\n");
      out.write("\t\t\t\t<div class=\"categories\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"list-categories\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"first-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_2\"><a href=\"\">Cars</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/car1.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"first-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_2\"><a href=\"\">Rental</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/car2.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"first-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_2\"><a href=\"\">Banking</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/car3.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"first-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_2\"><a href=\"\">Trucks</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"div_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/car4.jpg\" alt=\"Cars\" title=\"Cars\" width=\"60\" height=\"39\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"box\"> \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-heading\"><h1><a href=\"#\">Cart:&nbsp;</a></h1></div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"box-content\">\r\n");
      out.write("\t\t\t\t\t\t\tNow in your cart&nbsp;<strong> 0 items</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"box-title\">\r\n");
      out.write("\t\t\t\t\t<h1><span class=\"title-icon\"></span><a href=\"\">Branches</a></h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"section group example\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("\t\t\t\t\t  <img src=\"images/pic21.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t   <img src=\"images/pic24.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t   <img src=\"images/pic25.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t   <img src=\"images/pic27.jpg\" alt=\"\"/>\r\n");
      out.write("\t \t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t <img src=\"images/pic22.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t  \t<img src=\"images/pic23.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t  \t<img src=\"images/pic26.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t  \t<img src=\"images/pic28.jpg\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t  </div><div class=\"clear\"></div>\r\n");
      out.write("\t\t   \t\t </div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t<div class=\"copy\">\r\n");
      out.write("\t\t\t\t<p>All rights Reserved | Design by <a href=\"\">Elmnofy Team</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("            ");
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
