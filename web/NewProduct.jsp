<%-- 
    Document   : NewProduct
    Created on : 25-Jul-2009, 18:36:36
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

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Product!</h1>
        <html:form action="newProd">
        <table>
            <tr>
            <td>ProductID</td>
            <td><html:text name="ProductFormBean" property="id"/> </td>
            </tr>
            <tr>
                <td>Product Name</td>
                <td><html:text name="ProductFormBean" property="name"/> </td>
            </tr>
            <tr>
                <td>Product Type</td>
                <td><html:select name="ProductFormBean" property="type">
                    <html:option value="Dress"></html:option>
                    <html:option value="Jewlery"></html:option>
                    <html:option value="Shoes"></html:option>
                    <html:option value="Bags"></html:option>
                    </html:select>
                </td>
            </tr>
            <tr>
                <td>Product Price</td>
                <td><html:text name="ProductFormBean" property="price"/> </td>
            </tr>
            <tr>
                <td>Product Image</td>
                <td><html:file name="ProductFormBean" property="image"/> </td>
            </tr>
            <tr>
                <td><html:submit value="Ok"/> </td>
                <td><html:reset value="Reset"/></td>
            </tr>
        </table>
        </html:form>

    </body>
</html:html>
