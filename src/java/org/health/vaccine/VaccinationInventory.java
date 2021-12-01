/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.vaccine;

/**
 *
 * @author user
 */
public class VaccinationInventory {
    public int vaccineId;
    public int totalNumber;
    public String type;
    public String status;
    
//    public int getvaccineId(){
//        return this.vaccineId;
//    }
//    public void setVaccineId(int vaccineId){
//        this.vaccineId = vaccineId;
//    }
//    
//CREATE TABLE `vaccines` (
//  `vaccineId` int(11) NOT NULL,
//  `totalNumber` int(11) NOT NULL,
//  `type` varchar(255) NOT NULL,
//  `status` varchar(255) NULL
//) 
    
    public String createDatabase(){
        return "CREATE TABLE `vaccines` (\n" +
"  `vaccineId` int(11) NOT NULL,\n" +
"  `totalNumber` int(11) NOT NULL,\n" +
"  `type` varchar(255) NOT NULL,\n" +
"  `status` varchar(255) NULL\n" +
") ";
    }
    
    public String insertToTable(int totalNumber , String type){
       return "INSERT INTO `vaccines` (`vaccineId`, `totalNumber`, `type`, `status`) VALUES (NULL, '10', '"+totalNumber+"', '"+type+"');";
    }
    
//    public String returnVaccineStatus(int Id){
//        //SELECT `s` FROM `vaccines` WHERE 1
//        return "SELECT status FROM `vaccines` WHERE '"+id+"'";
//    }
    
    
    public String getReports(){
        return "Repors";
    }
    
    public String distributeVaccines(){
        return "Nothing";
    }
    
    
    
    
    
}
