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
public class ProfileForm extends org.apache.struts.action.ActionForm {

    private String uName;

    private String uPsd;
    private String rPsd;
    private String email;
    private String name;
    private String phone;

    public String getemail() {
        return email;
    }

    public String getname() {
        return name;
    }

    public String getphone() {
        return phone;
    }

    public String getrPsd() {
        return rPsd;
    }

    public String getuName() {
        return uName;
    }

    public String getuPsd() {
        return uPsd;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public void setrPsd(String rPsd) {
        this.rPsd = rPsd;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuPsd(String uPsd) {
        this.uPsd = uPsd;
    }

    public ProfileForm() {
    }

    /**
     * @return
     */

    /**
     *
     */

    /**
     * This is the action called from the Struts framework.
     * 
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
