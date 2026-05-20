<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Zohaib &amp; Co.</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="900" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="900" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/navigation.jpg" width="900" height="76" /></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td><img src="images/header-home.jpg" width="900" height="233" border="0" /></td>
      </tr>
      <tr>
        <td height="290" valign="top" background="images/body-bg.jpg"><table width="900" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="212" valign="top"><table width="207" border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td height="15"></td>
              </tr>
              <tr>
                <td><table width="207" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="187" valign="top" style="background-image: url(images/left-body_02.jpg); background-repeat:no-repeat;" ><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      
                      <tr>
                        <td><table width="96%" border="0" align="right" cellpadding="0" cellspacing="0">
                          <tr>
                            <td height="15"></td>
                          </tr>
                          <tr>

                              <td valign="top"> <html:link  href="main.html">
                              <font color="#FFFFFF">Main </font></html:link><br>
                              <a href="accountchart.jsp" class="white-text-bold">Account Charts</a> <BR>
                              
                              <a href="journal.jsp" class="white-text-bold">General journel </a> <BR>
                              <a href="ledger.jsp" class="white-text-bold">General Ledger </a> <BR>
                              <a href="trailbalance.jsp" class="white-text-bold">Trail Balance </a> <BR>
                              <a href="incomestmt.jsp" class="white-text-bold">Income Statment </a> <BR>
                              <a href="changepsd.jsp" class="white-text-bold">Cahnge password </a><BR>
                              
                            </td>
                          </tr>
                        </table></td>
                      </tr>
                    </table></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
            <td width="64">&nbsp;</td>
            <td width="624" valign="top"><table width="96%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td height="15"></td>
              </tr>
              <tr>
                      <td class="heading-bold">Create new user account</td>
              </tr>
              <tr>
                <td height="10" class="body-text"></td>
              </tr>
              <tr>
                  <td class="body-text"><html:form action="signUp">
		<table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
          <tr>
            <td width="39%" valign="top" class="Heading">&nbsp;</td>
            <td width="61%" align="right" valign="top" class="footer">&nbsp;</td>
          </tr>
          <tr>
            <td height="3" colspan="2" valign="top"></td>
          </tr>
          <tr>
            <td colspan="2" valign="top" class="bodyText">
			
			                      <table width="100%" border="0" cellspacing="0" cellpadding="2">
                                    <tr> 
                                      <td><strong class="Heading">Account Info</strong></td>
                                    </tr>
                                    <tr> 
                                      <td><table width="100%" border="0" align="center" cellspacing="2">
                                          <tr> 
                                            <td>UserName</td>
                                            <td><html:text name="SignUpFormBean" property="uName"/></td>
                                            <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                          <tr> 
                                            
                                        <td> Password</td>
                                            <td><html:password name="SignUpFormBean" property="uPsd"/></td>
                                            <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                          <tr> 
                                            
                                        <td>Retype Password</td>
                                            <td><html:password name="SignUpFormBean" property="rPsd"/></td>
                                            <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                          <tr>
                                              <td> Name</td><td><html:text name="SignUpFormBean" property="name"/></td>
                                              <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                          <tr>
                                              <td> PhoneNumber</td><td><html:text name="SignUpFormBean" property="phone"/></td>
                                              <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                          <tr>
                                              <td> Email</td><td><html:text name="SignUpFormBean" property="email"/></td>
                                              <td>&nbsp;</td>
                                            <td>&nbsp;</td>
                                          </tr>
                                        </table></td>
                                    </tr>
                                    <tr> 
                                      <td height="3"></td>
                                    </tr>
                                    <tr> 
                                      <td height="3"></td>
                                    </tr>
                                    <tr> 
                                      <td align="left"><table align="center" width="100%">
                                          <tr> 
                                          <td width="7%"><html:submit value="Ok"/></td>
                                          <td width="93%"><html:reset value="Reset"/>
                                          </td>
                                          </tr>
                                        </table></td>
                                    </tr>
                                    <tr> 
                                      <td>&nbsp;</td>
                                    </tr>
                                  </table>
						</td>
          </tr>
          <tr>
            <td height="3" colspan="2" valign="top" class="bodyText"></td>
          </tr>
        </table>
		
		</html:form></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td bgcolor="#F1F1F1" height="13"></td>
      </tr>
      <tr>
        <td height="51" background="images/footer.jpg"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="2%">&nbsp;</td>
            <td width="98%" class="footer">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>

</body>
</html:html>
