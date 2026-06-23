<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.io.*, javax.servlet.*, javax.servlet.http.*, javax.naming.*, javax.sql.*, java.sql.*"%>
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
                <td class="site-name">Fashion Botique</td>
                <td valign="bottom" class="top-text">Welcome  Adminestrator     </td>
                <td>&nbsp;</td>
                <td valign="bottom" class="top-text"><html:link action="/preEditAction" ></html:link>| 
                  <font color="#FFFFFF"><a href="ViewCustomer.jsp"> <font color="#CCCCCC">ViewCutomer</font></a></font>|</td>
            <td>&nbsp;</td>
                <td colspan="4" valign="bottom" class="top-nav-text style1"><a href="AdminPanel.jsp"><font color="#FFFFFF">Main</font></a> 
                  | <font color="#000000"><a href="Cart.jsp"><font color="#FFFFFF">ViewCart</font></a></font></td>
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
                            <td colspan="2" class="nav-text">Bridal Bags</td>
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
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td width="121" align="right" class="nav-text">&nbsp;</td>
                            <td width="14">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td colspan="4">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td align="right">&nbsp;</td>
                            <td>&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td colspan="4">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td colspan="2" class="nav-text">&nbsp;</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td align="right">&nbsp;</td>
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
                            <td><span class="top-nav-text">Availabel Products</span></td>
                  </tr>
                  <tr>
                    <td class="body-text" ><p>
                        <c:set var="j" value="Dress"/>
					<c:set var="query" value="Select * From product where type='${j}'"/>
         <sql:query var="rs" dataSource="${Ds}">
         ${query}
         </sql:query>
         <c:set var="img" value="images/Dainty.JPG"/>
					<table>
					<tr><th>Image</th><th>Name</th><th>Price</th><th></th><th>Action</th></tr>
					
                 <tr>
                                  <td><img src="<c:out value="${param.path}"/>" alt="1" width="400" height="450" border="" /></td>
                                  <td></td>
                                  <td><c:out value="${param.name}"/></td>
                                  <td></td>
                                  <td><c:out value="${param.price}"/></td>
                                  <td><a href="login.jsp">Add To Cart</a></td>
           

                

                 </tr>
             

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
                                        <td width="128" rowspan="3">&nbsp;</td>            <td width="136" rowspan="3">&nbsp;</td>            <td width="143" rowspan="3">&nbsp;</td>
                            <td width="16" rowspan="3"><img src="images/lower-box-line.jpg" width="4" height="100" /></td>
                                        <td width="208" rowspan="3">&nbsp;</td>
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

</body>
</htm:html>
