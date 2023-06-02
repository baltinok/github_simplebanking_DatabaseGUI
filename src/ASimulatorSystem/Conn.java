package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","şifrem123");    
            s =c.createStatement(); 

          System.out.println("Create database");
            
        }catch(Exception e){ 
            System.out.println(e);
        }  

        //hi
    }  
}  