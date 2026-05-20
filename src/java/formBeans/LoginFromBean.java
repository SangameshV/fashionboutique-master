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
public class LoginFromBean extends org.apache.struts.action.ActionForm {
    
    private String uName;

    private String psd;

    /**
     * @return
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param string
     */
    public void setuName(String string) {
        uName = string;
    }

    /**
     * @return
     */
    public  String getpsd() {
        return psd;
    }

    /**
     * @param i
     */
    public void setpsd(String i) {
        psd = i;
    }

    /**
     *
     */
    public LoginFromBean() {
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
        if (getuName() == null || getpsd().length() < 1) {
            errors.add("name", new ActionMessage("error.id.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
