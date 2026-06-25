/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actionBeans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import database.*;
import formBeans.*;
import javax.sql.*;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Adnan Aftab
 */
public class PreEditProfile extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
HttpSession hs=request.getSession();
        LoginFromBean log=(LoginFromBean)hs.getAttribute("user");
        String query="Select * From login where userName=?";
        ResultSet rs=null;
        ProfileForm f=(ProfileForm)form;
        
        DataBaseManager db=new DataBaseManager();
        if(db.ChkValid("Select * form login where userName=\'"+log.getuName()+"\'"))
        {
          try{rs= db.ReadData(query, log.getuName());
          rs.next();
          f.setname(rs.getString("Name"));
          //javax.swing.JOptionPane.showMessageDialog(null, f.getname());
          f.setuName(rs.getString("userName"));
          f.setemail(rs.getString("Email"));
          f.setphone(rs.getString("Phone"));
          f.setuPsd(rs.getString("Password"));
          return mapping.findForward("success");}
          catch(Exception e){return mapping.findForward("failure");}
        }
        return mapping.findForward("failure");
        
    }
}
