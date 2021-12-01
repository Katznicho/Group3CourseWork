/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.health;
import java.util.Date;

/**
 *
 * @author user
 */
public class HealthAdministrationModule {
    private int healthCenterId;
    private String healthCenterName;
    private int totalVaccines;
    private int totalPatients;
    private Date receiveDate;
    private Date receivedMonth;
    private int vaccineId;
    
    //create statement
    
//CREATE TABLE `healthcentres` (
//  `healthCenterId` int(11) NOT NULL,
//  `healthCenterName` varchar(255) NOT NULL,
//  `totalPatients` int(11) NOT NULL,
//  `totalVaccines` int(11) NOT NULL,
//  `receiveDate` date NOT NULL,
//  `receiveMonth` date NOT NULL,
//  `vaccineId` int(11) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    //create statement
    
   public String createTable(){
       return "CREATE TABLE `healthcentres` (\n" +
"  `healthCenterId` int(11) NOT NULL,\n" +
"  `healthCenterName` varchar(255) NOT NULL,\n" +
"  `totalPatients` int(11) NOT NULL,\n" +
"  `totalVaccines` int(11) NOT NULL,\n" +
"  `receiveDate` date NOT NULL,\n" +
"  `receiveMonth` date NOT NULL,\n" +
"  `vaccineId` int(11) NOT NULL\n" +
")";
   }
   
   public String insertIntoTable(){
       
       return "INSERT INTO `healthcentres` (`healthCenterId`, `healthCenterName`, `totalPatients`, `totalVaccines`, `receiveDate`, `receiveMonth`, `vaccineId`) VALUES (NULL, 'Kawempe', '10', '11', TIMESTAMP('2021-12-17'), TIMESTAMP('2021-12-01'), '1');";
   }
   
   public String UpdateTable(int id, String updateFields[]){
       return "UPDATE `healthcentres` SET `totalPatients` = '12' WHERE `healthcentres`.`healthCenterId` = '"+id+"';";
   }
   
   public String generateReport(String HealthCenterName){
       return "generate Report";
   }
   
   
   
   
     
     
    
    
    
    
}
