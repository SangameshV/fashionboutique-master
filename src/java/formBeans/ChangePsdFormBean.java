/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formBeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Adnan Aftab
 */
public class ChangePsdFormBean extends org.apache.struts.action.ActionForm {
    
   private String uName;
   private String uPsd;
   
   private String nPsd;

    public String getnPsd() {
        return nPsd;
    }

  

    public String getuName() {
        return uName;
    }

    public String getuPsd() {
        return uPsd;
    }

    public void setnPsd(String nPsd) {
        this.nPsd = nPsd;
    }

  

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuPsd(String uPsd) {
        this.uPsd = uPsd;
    }

    /**
     *
     */
    public ChangePsdFormBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getuName() == null || getuName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
