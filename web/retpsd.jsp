<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.io.*, javax.servlet.*, javax.servlet.http.*, javax.naming.*, javax.sql.*, java.sql.*"%>
<sql:setDataSource var="Ds" dataSource="Account"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>home</title>
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
                <td width="1%" rowspan="3" align="center">&nbsp;</td>
                <td width="18%" class="top-nav-text">&nbsp;</td>
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
                <td colspan="3" valign="bottom" class="top-nav-text"> <a href="Home.html"><font color="#FFFFFF">Home</font></a> 
                  <span class="top-text">|</span> <a href="abous-us.html"><font color="#FFFFFF">About 
                  Us</font></a> <span class="top-text">|</span> <font color="#CCCCCC"><a href="index.html"><font color="#FFFFFF">Products</font></a></font> 
                  <span class="top-text">|</span> <a href="Contact.html"><font color="#FFFFFF">contact 
                  us</font></a> </td>
                <td>&nbsp;</td>
                <td colspan="4" valign="bottom" class="top-nav-text style1"><a href="signUp.jsp"><font color="#FFFFFF">SignUp</font></a> 
                  | <a href="login.jsp"><font color="#FFFFFF">Login</font></a> 
                  | <font color="#FFFFFF"><a href="LoginAdmin.jsp"><font color="#CCCCCC" face="Arial, Helvetica, sans-serif">Admin</font></a> 
                  <a href="abous-us.html"></a></font></td>
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
                      <td width="170" valign="top" bgcolor="#FBFBFB">
<table width="171" height="263" border="0" cellpadding="0" cellspacing="0">
                          <tr> 
                            <td colspan="4"><img src="images/styles.gif" width="169" height="36" /></td>
                          </tr>
                          <tr> 
                            <td width="14">&nbsp;</td>
                            <td width="21"><img src="images/bullet-2.jpg" width="14" height="6" /></td>
                            <td width="270" colspan="2" class="nav-text">Bridal 
                              Dress</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Bridal Jewlery</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Bridal Bags</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" class="nav-text">Bridal Shoes</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" valign="middle" class="nav-text">Formal 
                              Wear</td>
                          </tr>
                          <tr> 
                            <td>&nbsp;</td>
                            <td><img src="images/bullet-2.jpg" alt="" width="14" height="6" /></td>
                            <td colspan="2" valign="middle" class="nav-text">Casual 
                              Wear</td>
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
                        </table>
                      </td>
                <td width="101" valign="top" bgcolor="#FBFBFB"><table width="101" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="671" valign="top" bgcolor="#FBFBFB"><table width="671" border="0" cellspacing="0" cellpadding="0">
                    <c:set var="query" value="Select Password From login where Name=\'${param.name}\' and Email=\'${param.email}\'"/>
                    <sql:query var="rs" dataSource="${Ds}">
                        ${query}
                    </sql:query>
                    <c:forEach items="${rs.rows}" var="row">
                                             <c:set var="p" value="${row.Password}"/>
                              </c:forEach>
                        <tr>
                            <td><p>Congrationaltion Password Has Been Reterived...</p>
                              <p>&nbsp;</p>
                              <p><font color="#990000">Your password Is : 
                              <c:out value="${p}"/></font></p></td>
                                        
                              
                            <td>&nbsp;</td>
                          </tr>
                          <tr> 
                            <td class="dottedt-line">....................................................................................................................................................................................................................................</td>
                          </tr>
                          <tr> 
                            <td ></td>
                          </tr>
                          <tr></tr>
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
                <td colspan="2"><div align="center" class="top-text">Home <span class="top-text">|</span> 
                    About Us <span class="top-text">|</span> Products <span class="top-text">|</span> 
                    contact us <span class="top-text">| </span>History </div></td>
          </tr>
          <tr>
            <td width="3%">&nbsp;</td>
            <td width="97%" align="center" class="footer">Copyright © 2007-2009 All Rights Reserved</td>
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
</html>
