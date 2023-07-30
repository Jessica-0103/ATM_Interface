/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;


import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user-db?zeroDateTimeBehavior=convertToNull","root","root");
            s = c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}