<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.io.*, javax.servlet.*, javax.servlet.http.*, javax.naming.*,formBeans.*, javax.sql.*, java.sql.*"%>
<sql:setDataSource var="Ds" dataSource="Account"/>
<htm:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Welcome</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style1 {
	font-size: 14px;
	color: #FFFFFF;
	font-family: Arial, Helvetica, sans-serif;
}
-->
</style>
</head>

<body>
<table width="1068" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="992" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="21%">&nbsp;</td>
            <td width="1%" rowspan="3" align="center"><img src="images/line.jpg" alt="line" width="1" height="48" /></td>
            <td width="18%">&nbsp;</td>
            <td width="1%">&nbsp;</td>
            <td width="38%">&nbsp;</td>
            <td width="2%">&nbsp;</td>
            <td width="7%">&nbsp;</td>
            <td width="3%">&nbsp;</td>
            <td width="3%">&nbsp;</td>
            <td width="6%">&nbsp;</td>
          </tr>
          <tr>
                <td class="site-name">Hira Botique</td>
                <td valign="bottom" class="top-text">Welcome Admin        </td>
                <td>&nbsp;</td>
                <td valign="bottom" class="top-text">&nbsp;</td>
            <td>&nbsp;</td>
                <td colspan="4" valign="bottom" class="top-nav-text style1"><font color="#FFFFFF"><a href="AdminPanel.jsp"><font color="#CCCCCC">AdminPanel 
                  </font></a></font>| <a href="LogOut"><font color="#FFFFFF">Logout</font></a>| 
                </td>
            </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
        </tr>
      <tr>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td valign="top" class="header"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="100" height="8px;" colspan="5"></td>
                </tr>
              
            </table>
              <table width="100%" border="1" cellspacing="0" cellpadding="0">
               
                  </table>
              </td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="3px;"></td>
      </tr>
      <tr>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#fbfbfb">
          <tr>
            <td valign="bottom" class="body-tp">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#fbfbfb" ></td>
          </tr>
          <tr>
            <td bgcolor="#FBFBFB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="170" bgcolor="#FBFBFB"><table width="170" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td colspan="4"><img src="images/styles.jpg" width="169" height="36" /></td>
                    </tr>
                  <tr>
                    <td width="14">&nbsp;</td>
                    <td width="21">&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Ball</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Bridal Dress</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Seasonal Suits</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Shoes</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">EarringJacket</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Engagement Sets</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Flat</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Gem</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td width="121" align="right" class="nav-text">More</td>
                    <td width="14">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td colspan="4"><img src="images/sub-style.jpg" width="168" height="36" /></td>
                    </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Anchor</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Beads</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Bike</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Black Onyx</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Box</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Byzatine</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Caltic</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Charm bracelet</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Circles</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right"><span class="nav-text">More</span></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td colspan="4"><img src="images/collection.jpg" width="168" height="37" /></td>
                    </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">3 Stone Jewelry</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Anniversery Jewelry</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">Designer Jewelry</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><img src="images/bullet-2.jpg" alt="1" width="14" height="6" /></td>
                    <td colspan="2" class="nav-text">5 stone Jewelry</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right"><span class="nav-text">More</span></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                  </tr>
                </table></td>
                <td width="101" valign="top" bgcolor="#FBFBFB"><table width="101" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="671" valign="top" bgcolor="#FBFBFB"><table width="671" border="0" cellspacing="0" cellpadding="0">
                          <tr> 
                            <td>Total Orders</td>
                  </tr>
                  <tr>
                    <td class="body-text" ><p>
					
         <table><tr></tr>
					<tr><th width="81">Product ID</th>
                                  <th width="108">User Name</th>
                                  <th width="39">Price</th></tr>

                 <tr>
         <%
         Connection con=null;
         Statement stmt=null;
         ResultSet rs;
        try{ InitialContext in=new InitialContext();
         DataSource ds=(DataSource)in.lookup("java:comp/env/Account");
         con=ds.getConnection();
         stmt=con.createStatement();
         
         String query="Select * From catalogue ";
          rs=stmt.executeQuery(query);
          while(rs.next()){
         %>
        
         
                 
        <td><c:out value="<%= rs.getString("id") %>"/></td>
                 <td><c:out value="<%= rs.getString("user") %>"/></td>

                 <td><c:out value="<%= rs.getString("price") %>"/></td>



                                </tr>
             
             <% }}
             catch(Exception e){ application.log("Error in Cart.jsp", e); out.print("An error occurred while processing your request. Please try again later."); }
        %>
                    </table>
                              </td>
                  </tr>
                  <tr>
                    <td class="dottedt-line">&nbsp;</td>
                  </tr>
                  <tr>
                    <td ></td>
                  </tr>
                  <tr>
                    <td><table width="686" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td class="lower-box-top">&nbsp;</td>
                        </tr>
                      <tr>
                        <td bgcolor="#EDF5F7" class="lower-box-bg"><table width="686" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="37">&nbsp;</td>
                            <td width="128" rowspan="3"><table width="122" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td colspan="2" class="lower-box-head">Company Info</td>
                              </tr>
                              <tr>
                                <td colspan="2"></td>
                              </tr>
                              <tr>
                                <td width="13"><img src="images/bullet.png" alt="" width="7" height="5" /></td>
                                <td width="109" class="lower-box-text">Abouts us </td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="" width="7" height="5" /></td>
                                <td class="lower-box-text">Contact Us</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="" width="7" height="5" /></td>
                                <td class="lower-box-text">Affiliate Program</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="" width="7" height="5" /></td>
                                <td class="lower-box-text">Sitemap</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="" width="7" height="5" /></td>
                                <td class="lower-box-text">Jewelry Blog </td>
                              </tr>
                              <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                            </table></td>
                            <td width="136" rowspan="3"><table width="128" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td colspan="2" class="lower-box-head">Account Center</td>
                              </tr>
                              <tr>
                                <td colspan="2"></td>
                              </tr>
                              <tr>
                                <td width="13"><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td width="113" class="lower-box-text">My Account</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Wish List</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Order Status</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Gift Certificates </td>
                              </tr>
                              <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                            </table></td>
                            <td width="143" rowspan="3"><table width="142" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td colspan="2" class="lower-box-head">Company Policies</td>
                              </tr>
                              <tr>
                                <td colspan="2"></td>
                              </tr>
                              <tr>
                                <td width="13"><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td width="127" class="lower-box-text">Shipping</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Return &amp; Exchange</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Price Guarantee</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Privacy Policy</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Sales Tax</td>
                              </tr>
                              <tr>
                                <td><img src="images/bullet.png" alt="1" width="7" height="5" /></td>
                                <td class="lower-box-text">Terms &amp; Conditions</td>
                              </tr>
                            </table></td>
                            <td width="16" rowspan="3"><img src="images/lower-box-line.jpg" width="4" height="100" /></td>
                            <td width="208" rowspan="3"><img src="images/banner.jpg" width="188" height="102" border="0" usemap="#Map" /></td>
                            <td width="18">&nbsp;</td>
                          </tr>
                          <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                          </tr>
                        </table>                          </td>
                        </tr>
                      <tr>
                        <td class="lower-box-bottom">&nbsp;</td>
                        </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td><table width="686" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                                  <td width="223" align="center">&nbsp;</td>
                        <td width="9">&nbsp;</td>
                                  <td width="216">&nbsp;</td>
                        <td width="10">&nbsp;</td>
                                  <td width="228">&nbsp;</td>
                      </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="50" bgcolor="#FBFBFB">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="4d7096">
          <tr>
            <td colspan="2">&nbsp;</td>
          </tr>
          <tr>
            <td width="3%">&nbsp;</td>
            <td width="97%" align="center" class="footer">Copyright Â© 2007-2009 All Rights Reserved</td>
          </tr>
          <tr>
            <td colspan="2">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>

<map name="Map" id="Map"><area shape="rect" coords="2,30,84,94" href="#" /></map></body>
</htm:html>
