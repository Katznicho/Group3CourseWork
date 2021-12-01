/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DBConnection {
     private String password = "!Log19tan88";
    private String user  ="root";
    private String jbcdriver = "com.mysql.jdbc.Driver";
    private String jbcUrl = "jdbc:mysql://localhost:3306/servlet";
    

    
    //connection
    public Connection getConnection(){
        Connection connection = null;
        try{
              Class.forName(this.jbcdriver);
              
              try{
//                    java.sql.Connection
                   connection = DriverManager.getConnection(this.jbcUrl,this.user,this.password);
              }
              catch(SQLException e){
                  System.out.println("Failed to connect " +e.getMessage());
              }
        }
        catch(ClassNotFoundException ex){
            System.out.println("The error is " +ex.getMessage()); 
            
        }
        
        return connection;
        
    }

    
    
}
