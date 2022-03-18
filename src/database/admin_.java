
package database;

import static database.connect_database.setconnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class admin_ extends connect_database{
    static String sql;
    static car ca = new car();
    //................................//
    public static boolean check_login(String user_name , String pass)
    {
        try {
            setconnection();
            Statement s = (Statement) con.createStatement();
            sql = "select * from employee where " + "user_name = '"+user_name+"' and password = '"+pass+"'";
            s.executeQuery(sql);
            while(s.getResultSet().next())
            {
                //this means that admin enter data correct...
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    //................................//
    public static boolean insert_car()
    {
        try {
            setconnection();
            sql = "INSERT INTO `car`(`model`, `code_car`, `price`, `year_of_purchase`, `maxspeed`) VALUES"
                + "('"+car.getModel()+"' , '"+car.getCode_car()+"' , '"+car.getPrice()+"' , '"+car.getYear_of_purchase()+"' , '"+car.getMax_speed()+"')";
            PreparedStatement ss = con.prepareStatement(sql);
            ss.execute();
            JOptionPane.showMessageDialog(null," Car is Saved");
            con.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
    
    //...............................//
    public static boolean update()
    {
            try{
            setconnection();
            Statement st = con.createStatement();
            sql = "UPDATE `car` SET `model`= '"+car.getModel()+"' ,`price`='"+car.getPrice()+"' ,`year_of_purchase`='"+car.getYear_of_purchase()+"'"
                    + ",`maxspeed`='"+car.getMax_speed()+"' WHERE code_car = '"+car.getCode_car()+"' ";
            st.executeUpdate(sql);
           con.close();
           System.out.println("car is ubdated");
            return true;
        }catch(SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
    //................//
    public static boolean delete()
    { 
        try{
            setconnection();
            Statement st = con.createStatement();
            sql = "delete from car where code_car = '"+car.getCode_car()+"' ";
            st.execute(sql);
            while(st.getResultSet().next())
            {
                //this means that admin enter data correct...
                return true;
            }
            con.close();
            System.out.println("car  is deleted");
        }catch(Exception ex)
        {
            System.out.println("car  is n't found");
        }
        return false;
    }
}
