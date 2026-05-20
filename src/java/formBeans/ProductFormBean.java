/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formBeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;




/**
 *
 * @author Adnan Aftab
 */
public class ProductFormBean extends org.apache.struts.action.ActionForm {
    
private String id;
private String name;
private String type;
private double price;
private FormFile image;
    public FormFile getimage()
    {
        return image;
    }
    public String getPath()
    {
        
        return image.getFileName();
    }
    public void setimage(FormFile path)
    {
        image=path;
    }
    public String getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getprice() {
        return price;
    }

    public String gettype() {
        return type;
    }

    public void setid(String id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void settype(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    
    /**
     *
     */
    public ProductFormBean() {
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
        if (getid() == null || getid().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
