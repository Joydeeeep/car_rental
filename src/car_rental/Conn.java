/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental;
import java.sql.*;

/**
 *
 * @author joyde
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///car_rent","root","MySQL@413#"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }
}
