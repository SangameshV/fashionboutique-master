package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;

public final class ViewProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sql_005fsetDataSource_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<htm:html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Welcome</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"a\"  onload=\"setupZoom()\">\r\n");
      out.write("<table width=\"1068\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"992\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"21%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"1%\" rowspan=\"3\" align=\"center\"><img src=\"images/line.jpg\" alt=\"line\" width=\"1\" height=\"48\" /></td>\r\n");
      out.write("            <td width=\"18%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"38%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"7%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"6%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("                <td class=\"site-name\">Fashion Botique</td>\r\n");
      out.write("                <td valign=\"bottom\" class=\"top-text\">Welcome  Adminestrator     </td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td valign=\"bottom\" class=\"top-text\">");
      if (_jspx_meth_html_005flink_005f0(_jspx_page_context))
        return;
      out.write("| \r\n");
      out.write("                  <font color=\"#FFFFFF\"><a href=\"ViewCustomer.jsp\"> <font color=\"#CCCCCC\">ViewCutomer</font></a></font>|</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("                <td colspan=\"4\" valign=\"bottom\" class=\"top-nav-text style1\"><a href=\"AdminPanel.jsp\"><font color=\"#FFFFFF\">Main</font></a> \r\n");
      out.write("                  | <font color=\"#000000\"><a href=\"Cart.jsp\"><font color=\"#FFFFFF\">ViewCart</font></a></font></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td valign=\"top\" class=\"header\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"100\" height=\"8px;\" colspan=\"5\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              \r\n");
      out.write("            </table>\r\n");
      out.write("              <table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("               \r\n");
      out.write("                  </table>\r\n");
      out.write("              </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"3px;\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#fbfbfb\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td valign=\"bottom\" class=\"body-tp\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#fbfbfb\" ></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FBFBFB\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"170\" bgcolor=\"#FBFBFB\"><table width=\"170\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td colspan=\"4\"><img src=\"images/styles.jpg\" width=\"169\" height=\"36\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"14\">&nbsp;</td>\r\n");
      out.write("                    <td width=\"21\">&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                            <td colspan=\"2\" class=\"nav-text\">Ball</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                            <td colspan=\"2\" class=\"nav-text\">Bridal Dress</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                            <td colspan=\"2\" class=\"nav-text\">Seasonal Suits</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                            <td colspan=\"2\" class=\"nav-text\">Shoes</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">EarringJacket</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Engagement Sets</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Flat</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Gem</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td width=\"121\" align=\"right\" class=\"nav-text\">More</td>\r\n");
      out.write("                    <td width=\"14\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td colspan=\"4\"><img src=\"images/sub-style.jpg\" width=\"168\" height=\"36\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Anchor</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Beads</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Bike</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Black Onyx</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Box</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Byzatine</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Caltic</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Charm bracelet</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Circles</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td align=\"right\"><span class=\"nav-text\">More</span></td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td colspan=\"4\"><img src=\"images/collection.jpg\" width=\"168\" height=\"37\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">3 Stone Jewelry</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Anniversery Jewelry</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">Designer Jewelry</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><img src=\"images/bullet-2.jpg\" alt=\"1\" width=\"14\" height=\"6\" /></td>\r\n");
      out.write("                    <td colspan=\"2\" class=\"nav-text\">5 stone Jewelry</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td align=\"right\"><span class=\"nav-text\">More</span></td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td width=\"101\" valign=\"top\" bgcolor=\"#FBFBFB\"><table width=\"101\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td width=\"671\" valign=\"top\" bgcolor=\"#FBFBFB\"><table width=\"671\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                            <td><span class=\"top-nav-text\">Availabel Products</span></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td class=\"body-text\" ><p>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         ");
      if (_jspx_meth_sql_005fquery_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><th>Image</th><th>Product ID</th><th>Product Name</th><th>Product Type</th><th>Price</th></tr>\r\n");
      out.write("\t\t\t\t\t ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                              </td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td class=\"dottedt-line\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td ></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td><table width=\"686\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td class=\"lower-box-top\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td bgcolor=\"#EDF5F7\" class=\"lower-box-bg\"><table width=\"686\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td width=\"37\">&nbsp;</td>\r\n");
      out.write("                            <td width=\"128\" rowspan=\"3\"><table width=\"122\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\" class=\"lower-box-head\">Company Info</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\"></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td width=\"13\"><img src=\"images/bullet.png\" alt=\"\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td width=\"109\" class=\"lower-box-text\">Abouts us </td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Contact Us</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Affiliate Program</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Sitemap</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Jewelry Blog </td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </table></td>\r\n");
      out.write("                            <td width=\"136\" rowspan=\"3\"><table width=\"128\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\" class=\"lower-box-head\">Account Center</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\"></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td width=\"13\"><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td width=\"113\" class=\"lower-box-text\">My Account</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Wish List</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Order Status</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Gift Certificates </td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                                <td>&nbsp;</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </table></td>\r\n");
      out.write("                            <td width=\"143\" rowspan=\"3\"><table width=\"142\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\" class=\"lower-box-head\">Company Policies</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td colspan=\"2\"></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td width=\"13\"><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td width=\"127\" class=\"lower-box-text\">Shipping</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Return &amp; Exchange</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Price Guarantee</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Privacy Policy</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Sales Tax</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td><img src=\"images/bullet.png\" alt=\"1\" width=\"7\" height=\"5\" /></td>\r\n");
      out.write("                                <td class=\"lower-box-text\">Terms &amp; Conditions</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            </table></td>\r\n");
      out.write("                            <td width=\"16\" rowspan=\"3\"><img src=\"images/lower-box-line.jpg\" width=\"4\" height=\"100\" /></td>\r\n");
      out.write("                            <td width=\"208\" rowspan=\"3\"><img src=\"images/banner.jpg\" width=\"188\" height=\"102\" border=\"0\" usemap=\"#Map\" /></td>\r\n");
      out.write("                            <td width=\"18\">&nbsp;</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>&nbsp;</td>\r\n");
      out.write("                            <td>&nbsp;</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>&nbsp;</td>\r\n");
      out.write("                            <td>&nbsp;</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </table>                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td class=\"lower-box-bottom\">&nbsp;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td><table width=\"686\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td width=\"223\" align=\"center\"><img src=\"images/paypal.jpg\" width=\"216\" height=\"100\" onclick=\"this.src='images/paypal.jpg';this.height=400;this.width=300\" ondblclick=\"this.src='images/paypal.jpg';this.height=200;this.width=150\"/></td>\r\n");
      out.write("                        <td width=\"9\">&nbsp;</td>\r\n");
      out.write("                        <td width=\"216\"><img src=\"images/2nd-last.jpg\" width=\"216\" height=\"100\" /></td>\r\n");
      out.write("                        <td width=\"10\">&nbsp;</td>\r\n");
      out.write("                        <td width=\"228\"><img src=\"images/email.jpg\" width=\"216\" height=\"100\" /></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td width=\"50\" bgcolor=\"#FBFBFB\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"4d7096\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"97%\" align=\"center\" class=\"footer\">Copyright Â© 2007-2009 All Rights Reserved</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<map name=\"Map\" id=\"Map\"><area shape=\"rect\" coords=\"2,30,84,94\" href=\"#\" /></map></body>\r\n");
      out.write("</htm:html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_005fsetDataSource_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_005fsetDataSource_005f0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_005fsetDataSource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fsetDataSource_005f0.setParent(null);
    // /ViewProducts.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setVar("Ds");
    // /ViewProducts.jsp(12,0) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fsetDataSource_005f0.setDataSource(new String("Account"));
    int _jspx_eval_sql_005fsetDataSource_005f0 = _jspx_th_sql_005fsetDataSource_005f0.doStartTag();
    if (_jspx_th_sql_005fsetDataSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsql_005fsetDataSource_0026_005fvar_005fdataSource_005fnobody.reuse(_jspx_th_sql_005fsetDataSource_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent(null);
    // /ViewProducts.jsp(54,53) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005flink_005f0.setAction("/preEditAction");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_0026_005faction_005fnobody.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /ViewProducts.jsp(288,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f0.setVar("query");
    // /ViewProducts.jsp(288,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f0.setValue(new String("Select * From product"));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_sql_005fquery_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_005fquery_005f0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_005fquery_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sql_005fquery_005f0.setParent(null);
    // /ViewProducts.jsp(289,9) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setVar("rs");
    // /ViewProducts.jsp(289,9) name = dataSource type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_sql_005fquery_005f0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_sql_005fquery_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_005fquery_005f0 = _jspx_th_sql_005fquery_005f0.doStartTag();
      if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]++;
          _jspx_th_sql_005fquery_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_005fquery_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("         ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_sql_005fquery_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_005fquery_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_005fquery_005f0[0]--;
        }
      }
      if (_jspx_th_sql_005fquery_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_005fquery_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_005fquery_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_005fquery_005f0.doFinally();
      _005fjspx_005ftagPool_005fsql_005fquery_0026_005fvar_005fdataSource.reuse(_jspx_th_sql_005fquery_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /ViewProducts.jsp(292,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f1.setVar("img");
    // /ViewProducts.jsp(292,9) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fset_005f1.setValue(new String("images/Dainty.JPG"));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /ViewProducts.jsp(295,6) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rs.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /ViewProducts.jsp(295,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fforEach_005f0.setVar("row");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                 <tr>\r\n");
          out.write("                 <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"1\" width=\"35\" height=\"40\" /></td>\r\n");
          out.write("                 <td>");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                 <td>");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                 <td>");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("                 <td>");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("           \r\n");
          out.write("\r\n");
          out.write("                 <td><a href=\"DeleteProd?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">Delete Product</a>\r\n");
          out.write("\r\n");
          out.write("                 </tr>\r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /ViewProducts.jsp(298,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /ViewProducts.jsp(299,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /ViewProducts.jsp(300,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.type}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /ViewProducts.jsp(301,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
