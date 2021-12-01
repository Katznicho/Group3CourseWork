/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import org.db.connection.DBConnection;
/**
 *
 * @author user
 */
public class SampleServlet extends HttpServlet {
    
    private DBConnection Conn;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     */
    public void init() throws ServletException{
        Conn =  new DBConnection();
        
        
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SampleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
//             try{
//         Class.forName("com.mysql.jdbc.Driver");
//        out.println("<p>Mysql Driver loaded successfully</p>");
//            try{
//              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","!Log19tan88");
//                   out.println("The connection was a sucess");
//        Statement st = conn.createStatement();
////       st.execute("create table users (id int(11) AUTO_INCREMENT NOT NULL PRIMARY KEY,username VARCHAR(50),lastname VARCHAR(50));");
////             st.execute("insert into users (username,lastname)values('Mugamba','Bruno');");
////st.execute("alter table users ADD password varchar(50)NOT NULL;");
////st.executeUpdate("UPDATE `users` SET `password` = 'mu0' WHERE `users`.`id` = 1;");
//
//  }catch(SQLException e){
//               out.println("<p>Failed to connect due to "+e.getMessage()+"</p>");
//            }
//        }catch(ClassNotFoundException ex){
//            out.println("The error is "+ ex.getMessage());
//        }

     Conn.getConnection();
     
     
     
     out.println("<p>The connection was success</p>");
            out.println("<h1>Servlet SampleServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
