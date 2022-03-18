
package database;

import static database.connect_database.setconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class user_ extends connect_database{
    static ResultSet rs = null;
    static PreparedStatement ps = null;
    //...............................//customer date
    static customer cust = new customer();
    
    public static void insert_user()
    {
        try {
            setconnection();
            String sql = "INSERT INTO `user`(`name_of_user`, `user_name`, `password`) VALUES ('"+cust.getName()+"' , '"+cust.getUsername()+"' , '"+cust.getPasseord()+"')";
            PreparedStatement ss = con.prepareStatement(sql);
            ss.execute();
            JOptionPane.showMessageDialog(null," user is Saved");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public static boolean check_login_customer()
    {
        try {
            setconnection();
            Statement s = (Statement) con.createStatement();
            String sql = "select * from user where " + "user_name = '"+cust.getUsername()+"' and password = '"+cust.getPasseord()+"'";
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
    
    public static boolean search()
    {
        try{
            setconnection();
            Statement s = (Statement) con.createStatement();
            String sql = "select * from car where " + "code_car = '"+car.getCode_car()+"' ";
            s.executeQuery(sql);
            while(s.getResultSet().next())
            {
                return true;
            }
            con.close();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    //.........................................................
    //to return data from server and set in user_control to show....
    protected static ResultSet get_data()
    {
        try{
            setconnection();
            ps = con.prepareStatement("SELECT * FROM `car` WHERE code_car = '"+car.getCode_car()+"' ");
            rs=ps.executeQuery();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public static void take_attrute()
    {
        try{
            get_data();
            if(search() == true)
            {
                if(rs.next())
                {
                    car.setModel(rs.getString("model"));
                    car.setPrice(Integer.parseInt(rs.getString("price")));
                    car.setMax_speed(Integer.parseInt(rs.getString("maxspeed")));
                    car.setYear_of_purchase(Integer.parseInt(rs.getString("year_of_purchase")));
                }
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //......................
    public static void user_buy_car(int code , int v , String user)
    {
        try {
            setconnection();
            String sql = "INSERT INTO `buy_car`(`code_car`, `vias_code`, `user_name`) VALUES ('"+code+"' , '"+v+"' , '"+user+"')";
            PreparedStatement ss = con.prepareStatement(sql);
            ss.execute();
            JOptionPane.showMessageDialog(null," car is Saved");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
