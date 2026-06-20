
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;
import java.sql.*;
import javax.naming.*;
import javax.servlet.http.HttpSession;
import formBeans.LoginFromBean;


/**
 *
 * @author Adnan Aftab
 */
public class AddToCart extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String query=null;
        try {
            HttpSession hs=request.getSession();
            LoginFromBean log=(LoginFromBean)hs.getAttribute("user");
            

            Connection con=null;
            PreparedStatement stmt=null;

            InitialContext in=new InitialContext();
            DataSource ds=(DataSource)in.lookup("java:comp/env/Account");
            con=ds.getConnection();
            stmt=con.prepareStatement("insert into catalogue values(?, ?, ?, ?, ?)");
            stmt.setString(1, request.getParameter("id"));
            stmt.setInt(2, 0);
            stmt.setString(3, request.getParameter("price"));
            stmt.setInt(4, 0);
            stmt.setString(5, log.getuName());
            stmt.executeUpdate();
            response.sendRedirect("MyCart.jsp");
         response.sendRedirect("MyCart.jsp");
        } 
        catch(Exception e)
        {
            
            response.sendRedirect("cusWelcome.jsp");
        }
        finally {
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
