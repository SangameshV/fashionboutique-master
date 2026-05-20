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
public class CreditCard extends org.apache.struts.action.ActionForm {
    
    private String username;

    private String card;
    private String price;

    public void setcard(String card) {
        this.card = card;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getcard() {
        return card;
    }

    public String getprice() {
        return price;
    }

    public String getusername() {
        return username;
    }

    /**
     * @return
     */
    
    /**
     *
     */
    public CreditCard() {
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
        if (getcard() == null || getcard().length() < 1) {
            errors.add("name", new ActionMessage("error.card.required"));
            
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
