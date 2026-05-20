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
import formBeans.*;
import database.*;
import org.apache.jasper.tagplugins.jstl.core.Catch;
/**
 *
 * @author Adnan Aftab
 */
public class SignUpAction extends org.apache.struts.action.Action {
    
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
        try{
        SignUpFormBean f=(SignUpFormBean)form;
        String query=query="Insert Into login Values(\'"+f.getuName()+"\',\'"+f.getuPsd()+"\',\'"+f.getname()+"\',\'"+f.getemail()+"\',\'"+f.getphone()+"\')";
        DataBaseManager db=new DataBaseManager();
        if(db.CUD(query))
        {
        return mapping.findForward("success");
        }
        else{ mapping.findForward("failure");}
    }
        catch(Exception e)
        {
            mapping.findForward("failure");
        }
        return mapping.findForward("failure");
    }

}
