/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.administration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.db.connection.DBConnection;

/**
 *
 * @author user
 */
public class LoginUserHandler extends SimpleTagSupport {

    private String email;
    private String password;
    
            DBConnection Conn = new DBConnection();
         Connection newConn  = Conn.getConnection();
         SystemAdminstrationModule Sys =  new SystemAdminstrationModule();

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");
//                           out.println("Here  " +email + "passwprd" +password);
                                Statement St = newConn.createStatement();
                         ResultSet user =  St.executeQuery("SELECT * FROM `administrator`");
                         out.println("Am Done");
//                         if(user.getString("email").equalsIgnoreCase(email) && user.getString("password") == password){
//                             out.println("clear");
//                             
//                         }
//                         else{
//                             out.println("Not the same");
//                         }

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in LoginUserHandler tag", ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginUserHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
