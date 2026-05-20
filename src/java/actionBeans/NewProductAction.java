package actionBeans;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import database.*;
import formBeans.*;
import org.apache.struts.upload.FormFile;
/**
 *
 * @author Adnan Aftab
 */
public class NewProductAction extends org.apache.struts.action.Action {
    
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
        ProductFormBean f=(ProductFormBean)form;
        FormFile file=f.getimage();
        String query=null;
        String path="images/"+f.getPath();
       try{ query="Insert into product values(\'"+f.getid()+"\',\'"+f.getname()+"\',\'"+f.gettype()+"\',"+f.getprice()+",\'"+path+"\')";
        DataBaseManager db=new DataBaseManager();
        if(db.CUD(query))
        return mapping.findForward(SUCCESS);}
        catch(Exception e){
           
            return mapping.findForward("failure");}
        return mapping.findForward("failure");
    }
}
