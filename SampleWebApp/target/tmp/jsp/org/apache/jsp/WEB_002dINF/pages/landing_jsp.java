/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2017-11-26 15:57:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class landing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/axiaRepo/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("file:/D:/axiaRepo/.m2/repository/org/springframework/spring-webmvc/4.2.0.RELEASE/spring-webmvc-4.2.0.RELEASE.jar", Long.valueOf(1511684743562L));
    _jspx_dependants.put("jar:file:/D:/axiaRepo/.m2/repository/org/springframework/spring-webmvc/4.2.0.RELEASE/spring-webmvc-4.2.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1438286782000L));
    _jspx_dependants.put("file:/D:/axiaRepo/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1504076589353L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("  <title>KreditMedia</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);\r\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-family: Arial;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: -20px;\r\n");
      out.write("\tleft: -20px;\r\n");
      out.write("\tright: -40px;\r\n");
      out.write("\tbottom: -40px;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tbackground-image: url(http://ginva.com/wp-content/uploads/2012/07/city-skyline-wallpapers-008.jpg);\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\t-webkit-filter: blur(5px);\r\n");
      out.write("\tz-index: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".grad{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: -20px;\r\n");
      out.write("\tleft: -20px;\r\n");
      out.write("\tright: -40px;\r\n");
      out.write("\tbottom: -40px;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\topacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: calc(50% - 35px);\r\n");
      out.write("\tleft: calc(50% - 255px);\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header div{\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-family: 'Exo', sans-serif;\r\n");
      out.write("\tfont-size: 35px;\r\n");
      out.write("\tfont-weight: 200;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header div span{\r\n");
      out.write("\tcolor: #5379fa !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: calc(50% - 75px);\r\n");
      out.write("\tleft: calc(50% - 50px);\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("\twidth: 350px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=text]{\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-family: 'Exo', sans-serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\tpadding: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=password]{\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-family: 'Exo', sans-serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\tpadding: 4px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=button]{\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder: 1px solid #fff;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tcolor: #a18d6c;\r\n");
      out.write("\tfont-family: 'Exo', sans-serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\tpadding: 6px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".login input[type=submit]{\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder: 1px solid #fff;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tcolor: #a18d6c;\r\n");
      out.write("\tfont-family: 'Exo', sans-serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\tpadding: 6px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=button]:hover{\r\n");
      out.write("\topacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=button]:active{\r\n");
      out.write("\topacity: 0.6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=text]:focus{\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=password]:focus{\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login input[type=button]:focus{\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-webkit-input-placeholder{\r\n");
      out.write("   color: rgba(255,255,255,0.6);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-moz-input-placeholder{\r\n");
      out.write("   color: rgba(255,255,255,0.6);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"prefixfree.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"body\"></div>\r\n");
      out.write("\t\t<div class=\"grad\"></div>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div>Kredit<span>Media</span></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"login\">\r\n");
      out.write("\t\t\tUser Details Submited\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
