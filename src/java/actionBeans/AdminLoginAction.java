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
import formBeans.AdminLoginForm;
/**
 *
 * @author Adnan Aftab
 */
public class AdminLoginAction extends org.apache.struts.action.Action {
    
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
        AdminLoginForm f=(AdminLoginForm)form;

        String query = "Select * From adminlogin where userName=? and password=?";
        DataBaseManager db = new DataBaseManager();
        if (db.ChkValid(query, f.getuName(), f.getpsd()))
        return mapping.findForward(SUCCESS);
        else return mapping.findForward("failure");
    }
}
