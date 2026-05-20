<%-- 
    Document   : ViewCart
    Created on : 25-Jul-2009, 15:28:53
    Author     : Adnan Aftab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.io.*, javax.servlet.*, javax.servlet.http.*, javax.naming.*, javax.sql.*, java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<sql:setDataSource var="Ds" dataSource="Account"/>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Cart</title>
    </head>
    <body>
        <h1>View Cart!</h1>
        
        <c:set var="user" value=" <bean:write name='user' property='uName' scope='session'/>"/>
        <c:set var="query" value="Select * From catalogue where userName=${user}"/>
         <sql:query var="rs" dataSource="${Ds}">
         ${query}
         </sql:query>
        <table>
            <tr>
                <th>Product ID</th>
                <th>User Name</th>
                
                <th>Product Price</th>
                
               
            </tr>
             <c:forEach items="${rs.rows}" var="row">
                 <tr><td><c:out value="${row.id}" /></td>
                 <td><c:out value="${row.userName}" /></td>
                 
                 <td><c:out value="${row.price}" /></td>
                
               
                 </tr>
             </c:forEach>
             <tr>
                 <td></td>
                 <td></td>
                 <td>Checkout</td>
             </tr>
             </table>
    </body>
</html:html>
