/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.administration;

import java.sql.Connection;
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
public class Administration extends SimpleTagSupport  {
    
    private String email;
    private String name;
    private String role;
    private String password;
    private String confirmPassword;
    
        DBConnection Conn = new DBConnection();
         Connection newConn  = Conn.getConnection();
         SystemAdminstrationModule Sys =  new SystemAdminstrationModule();
       
        //Statement St = newConn.createStatement();
//         try{}
//         catch()
//         Statement st = newConn.createStatement();
    
    
    
//    SystemAdminstrationModule Sys = new SystemAdminstrationModule();
     //Sys.insertIntoTable(email, name, role, password, confirmPassword);
    
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
            //System.out.println("The email is "+email);
            //out.println("The email is "+email);
//                St.execute(Sys.insertIntoTable(email, name, role, password, confirmPassword));
// St.execute("insert into administrator (email,name, password, confirmPassword, role)"
//         + "values('Mugamba','Bruno', 'katende', 'katende', 'Badman');");
                             
                              
                              try{
//                                  switch(){
//                                  }
                                    Statement St = newConn.createStatement();
//                                     St.execute("insert into administrator (email,name, password, confirmPassword, role)"
//         + "values('Mugamba','Bruno', 'katende', 'katende', 'Badman');");
                St.execute(Sys.insertIntoTable(email, name, role, password, confirmPassword));
                                    
                                     out.println("Clear clear clear ");
                              }
                              catch(SQLException e){
                              }

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Administration tag", ex);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
}
