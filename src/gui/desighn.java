
package gui;

import database.admin_;
import database.car;
import database.customer;
import database.user_;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class desighn  extends set_panel implements ActionListener {
    JFrame f = new JFrame();
    admin_ con = new admin_();
    user_ con_data = new user_();
    
    String filepath;
    Color c;
    static int x;
    
    //admin
    JPanel start = new JPanel();
    JPanel admin_login = new JPanel();
    JPanel admin_control = new JPanel();
    JPanel admin_add_car = new JPanel();
    JPanel admin_delete_car = new JPanel();
    JPanel admin_update_car = new JPanel();
    JPanel l_set_color = new JPanel();
    //customer
    JPanel cust_login = new JPanel();
    JPanel cust_register = new JPanel();
    JPanel cust_services = new JPanel();
    JPanel cust_search_car = new JPanel();
    JPanel cust_buy_car = new JPanel();
    JPanel show_data = new JPanel();
    JPanel cust_confirm_buy_car = new JPanel();
    
    //admin
    JButton btn_admin = new JButton(); 
    JButton btn_user = new JButton(); 
    JButton btn_login = new JButton();
    JButton btn_add_car = new JButton(); 
    JButton btn_add_data = new JButton();
    JButton btn_delete_car = new JButton(); 
    JButton btn_update_car = new JButton();
    JButton btn_cho_color = new JButton();
    JButton btn_delete_data = new JButton();
    JButton btn_update = new JButton();
    //customer
    JButton btn_cust_login = new JButton();
    JButton btn_cust_register = new JButton();
    JButton btn_creg_data = new JButton();
    JButton btn_search_car = new JButton();
    JButton btn_buy_car = new JButton();
    JButton search_cust_car = new JButton();
    JButton btns_back = new JButton();
    JButton btn_b1 = new JButton();
    JButton btn_b2 = new JButton();
    JButton btn_b3 = new JButton();
    JButton btn_b4 = new JButton();
    JButton btn_b5 = new JButton();
    JButton btn_b6 = new JButton();
    JButton btn_b7 = new JButton();
    JButton btn_b8 = new JButton();
    JButton btn_b9 = new JButton();
    JButton confirme_buy_car = new JButton();
    JButton confirme_finaly_buy_car = new JButton();
    //admin
    JLabel l = new JLabel();
    JLabel l_user = new JLabel();
    JLabel l_pass = new JLabel();
    JLabel l_model = new JLabel();
    JLabel l_code = new JLabel();
    JLabel l_year = new JLabel();
    JLabel l_max = new JLabel(); 
    JLabel l_price = new JLabel();
    JLabel l_delete_car = new JLabel();
    
    //customer
    JLabel l_cust_usern = new JLabel();
    JLabel l_cust_passn = new JLabel();
    JLabel l_cust_name = new JLabel();
    JLabel l_cust_reg_user = new JLabel();
    JLabel l_cust_reg_pass = new JLabel();
    JLabel cust_search_car_code = new JLabel();
    JLabel s_mo = new JLabel();
    JLabel s_p = new JLabel();
    JLabel s_c = new JLabel();
    JLabel s_m = new JLabel();
    JLabel s_y = new JLabel();
    JLabel l_user_buy_cust_car = new JLabel();
    JLabel l_visa_buy_cust_car = new JLabel();
    //admin
    JTextField f_login_admin = new JTextField();
    JPasswordField p_login_admin = new JPasswordField();
    JTextField f_model = new JTextField();
    JTextField f_code = new JTextField();
    JTextField f_year = new JTextField();
    JTextField f_max = new JTextField();
    JTextField f_price = new JTextField();
    JTextField f_delete = new JTextField();
    //customer
    JTextField f_reg_custn = new JTextField();
    JTextField f_reg_custu = new JTextField();
    JPasswordField p_reg_custp = new JPasswordField();
    JTextField f_login_custu = new JTextField();
    JPasswordField p_login_custp = new JPasswordField();
    JTextField search_with_code = new JTextField();
    JTextField f_visa_buy_cust_car = new JTextField();
    JPasswordField p_visa_buy_cust_car = new JPasswordField();
    
    public desighn()
    {
        f.setTitle("Cars Sales System");
        f.setSize(1200, 700);
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        start_page();
    }

    public void start_page() {
        start.setLayout(null);
        start.setBackground(Color.yellow);
        start.setVisible(true);
        f.add(start);
        
        jlable("Cars Sales System", 450, 30 , 350, 50, 30 , l , start);
        create_button("Admin", 430, 250, 300, 40, 30, btn_admin, start);
        create_button("Customer", 430, 350, 300, 40, 30, btn_user, start);
        
        btn_admin.addActionListener(this);
        btn_user.addActionListener(this); 
    }
    //................................// admin method
    public void login_page() {
        admin_login.setLayout(null);
        admin_login.setBackground(Color.GRAY);
        admin_login.setVisible(true);
        f.add(admin_login);
        
        jlable("Admin Login", 500, 30 , 350, 50, 30 , l , admin_login);
        jlable("User name", 100, 150 , 250, 50, 30 , l_user , admin_login);
        jlable("Password", 100, 250 , 250, 50, 30 , l_pass , admin_login);
        create_button("Login", 420, 450, 300, 40, 30, btn_login, admin_login);
        create_jtextf(400 , 150, 300, 40, 25, f_login_admin , admin_login);
        create_jtextpass(400, 250, 300, 40, 25, p_login_admin, admin_login);
        create_button("Back", 20, 600, 200, 50, 30, btn_b8, admin_login);
        
        btn_b8.addActionListener(this);
        btn_login.addActionListener(this);
    }

    public void control_system() {
        
        admin_control.setLayout(null);
        admin_control.setBackground(Color.GRAY);
        admin_control.setVisible(true);
        f.add(admin_control);
        
        jlable("Control The System", 440, 30 , 350, 50, 30 , l , admin_control);
        create_button("Add Car", 420, 250, 300, 40, 30, btn_add_car, admin_control);
        create_button("Delete Car", 420, 350, 300, 40, 30, btn_delete_car, admin_control);
        create_button("Update Car Date", 420, 450, 300, 40, 30, btn_update_car, admin_control);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b1, admin_control);
        btn_b1.addActionListener(this); 
        btn_add_car.addActionListener( this);
        btn_delete_car.addActionListener( this);
        btn_update_car.addActionListener( this); 
    }

    public void add_car() {
        admin_add_car.setLayout(null);
        admin_add_car.setBackground(Color.GRAY);
        admin_add_car.setVisible(true);
        f.add(admin_add_car);
        
        jlable("ADD CAR TO SYSTEM", 410, 30 , 350, 50, 30 , l , admin_add_car);
        jlable("Model", 30, 150 , 250, 50, 30 , l_model , admin_add_car);
        jlable("Code Car", 650, 150 , 250, 50, 30 , l_code , admin_add_car);
        jlable("Year Of Purchase", 30, 250 , 300, 50, 30 , l_year , admin_add_car);
        jlable("Max speed", 650, 250 , 250, 50, 30 , l_max , admin_add_car);
        jlable("Price", 30, 340 , 250, 50, 30 , l_price , admin_add_car);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b2, admin_add_car);
        
        l_set_color.setBounds(400, 440, 70, 40);
        admin_add_car.add(l_set_color);
        
        create_jtextf(340, 150, 200, 40, 25, f_model, admin_add_car);
        create_jtextf(950, 150 , 200, 40, 25, f_code, admin_add_car);
        create_jtextf(340, 250, 200, 40, 25, f_year, admin_add_car);
        create_jtextf(950, 250 , 200, 40, 25, f_max, admin_add_car);
        create_jtextf(340, 340, 200, 40, 25, f_price, admin_add_car);
        
        create_button("Choose Color" , 30, 440, 350, 40, 30, btn_cho_color, admin_add_car);
        create_button("Add Car To The System", 380,590 , 400 , 50, 30, btn_add_data, admin_add_car);
        
        btn_b2.addActionListener(this); 
        btn_cho_color.addActionListener( this);
        btn_add_data.addActionListener( this);
        
    }

    public void delete_car() {
        admin_delete_car.setLayout(null);
        admin_delete_car.setBackground(Color.GRAY);
        admin_delete_car.setVisible(true);
        f.add(admin_delete_car);
        
        jlable("ADD CAR TO SYSTEM", 410, 30 , 350, 50, 30 , l , admin_delete_car);
        jlable("Code Car",250, 300, 150, 40, 30, l_delete_car, admin_delete_car);
        create_jtextf(420, 300, 250, 40, 30, f_delete, admin_delete_car);
        create_button("Delete", 450, 450, 200, 40, 40, btn_delete_data, admin_delete_car);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b3, admin_delete_car);
        
        btn_delete_data.addActionListener(this); 
        btn_b3.addActionListener(this); 
    }
   
    public void set_to_update()
    {
        admin_update_car.setLayout(null);
        admin_update_car.setBackground(Color.GRAY);
        admin_update_car.setVisible(true);
        f.add(admin_update_car);
        
        jlable("ADD CAR TO SYSTEM", 410, 30 , 350, 50, 30 , l , admin_delete_car);
        jlable("Model", 30, 150 , 250, 50, 30 , l_model , admin_update_car);
        jlable("Code Car", 650, 150 , 250, 50, 30 , l_code , admin_update_car);
        jlable("Year Of Purchase", 30, 250 , 300, 50, 30 , l_year , admin_update_car);
        jlable("Max speed", 650, 250 , 250, 50, 30 , l_max , admin_update_car);
        jlable("Price", 30, 340 , 250, 50, 30 , l_price , admin_update_car);
        
        create_jtextf(340, 150, 200, 40, 25, f_model, admin_update_car);
        create_jtextf(950, 150 , 200, 40, 25, f_code, admin_update_car);
        create_jtextf(340, 250, 200, 40, 25, f_year, admin_update_car);
        create_jtextf(950, 250 , 200, 40, 25, f_max, admin_update_car);
        create_jtextf(340, 340, 200, 40, 25, f_price, admin_update_car);
        
        create_button("Choose Color" , 30, 440, 350, 40, 30, btn_cho_color, admin_update_car);
        create_button("Add Car To The System", 380,590 , 400 , 50, 30, btn_update, admin_update_car);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b4, admin_update_car);
        
        l_set_color.setBounds(400, 440, 70, 40);
        admin_update_car.add(l_set_color);
        
        btn_cho_color.addActionListener((ActionListener) this);
        btn_update.addActionListener((ActionListener) this); 
        btn_b4.addActionListener(this); 
    }
    
    //.................................// customer
    public void method_cust_login()
    {
        cust_login.setLayout(null);
        cust_login.setBackground(Color.GRAY);
        cust_login.setVisible(true);
        f.add(cust_login);
        
        jlable("Login To System" , 410, 30 , 350, 50, 30 , l , cust_login);
        jlable("User name", 100, 150 , 250, 50, 30 , l_cust_usern , cust_login);
        jlable("Password", 100, 250 , 250, 50, 30 , l_cust_passn , cust_login);
        
        create_button("Login", 420, 450, 300, 40, 30, btn_cust_login, cust_login);
        create_button("Register", 420, 550, 300, 40, 30, btn_cust_register, cust_login);
        
        create_jtextf(400 , 150, 300, 40, 25, f_login_custu , cust_login);
        create_jtextpass(400, 250, 300, 40, 25,p_login_custp , cust_login);
        
        btn_cust_login.addActionListener(this); 
        btn_cust_register.addActionListener(this); 
        
    }
    public void custmoer_register()
    {
        cust_register.setLayout(null);
        cust_register.setBackground(Color.GRAY);
        cust_register.setVisible(true);
        f.add(cust_register);
        
        jlable("Registration" , 410, 30 , 350, 50, 40 , l , cust_register);
        jlable("Name", 100, 150 , 250, 50, 30 , l_cust_name , cust_register);
        jlable("User name", 100, 250 , 250, 50, 30 , l_cust_reg_user , cust_register);
        jlable("Password", 100, 350 , 250, 50, 30 , l_cust_reg_pass , cust_register);
        
        create_button("Register", 420, 550, 300, 40, 30, btn_creg_data, cust_register);
        create_jtextf(400 , 150, 300, 40, 25, f_reg_custn , cust_register);
        create_jtextf(400 , 250, 300, 40, 25, f_reg_custu , cust_register);
        create_jtextpass(400, 350, 300, 40, 25,p_reg_custp , cust_register);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b9, cust_register);
        btn_b9.addActionListener(this);
        btn_creg_data.addActionListener(this); 
    }
    public void services()
    {
        cust_services.setLayout(null);
        cust_services.setBackground(Color.GRAY);
        cust_services.setVisible(true);
        f.add(cust_services);
        
        jlable("Registration" , 470, 30 , 350, 50, 40 , l , cust_services);
        create_button("Search about car", 415, 300, 350, 40, 30, btn_search_car , cust_services);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b5, cust_services);
        
        btn_b5.addActionListener(this);
        btn_search_car.addActionListener(this);
    }
    public void search_car()
    {
        cust_search_car.setLayout(null);
        cust_search_car.setBackground(Color.RED);
        cust_search_car.setVisible(true);
        f.add(cust_search_car);
        
        jlable("Search Car" , 500, 10 , 350, 50, 30 , l , cust_search_car);
        jlable("ENTER CAR CODE", 80, 80, 350, 50, 30, cust_search_car_code, cust_search_car);
        
        create_jtextf(400, 80, 200, 40, 25, search_with_code, cust_search_car);
        create_button("SEARCH", 720, 80, 300, 40, 30, search_cust_car , cust_search_car);
         
        search_cust_car.addActionListener(this);
    }
    public void show_car()
    {
        jlable("Model", 30, 230 , 250, 50, 30 , l_model , cust_search_car);
        jlable("KIA", 350, 230, 250, 50, 25, s_mo, cust_search_car);
        jlable("Year Of Purchase", 30, 300 , 300, 50, 30 , l_year , cust_search_car);
        jlable("2020", 350, 300, 250, 50, 25, s_y, cust_search_car);
        jlable("Max speed", 30, 400 , 250, 50, 30 , l_max , cust_search_car);
        jlable("450", 350, 400, 250, 50, 25, s_m, cust_search_car);
        jlable("Price", 30, 500 , 250, 50, 30 , l_price , cust_search_car);
        jlable("5000000", 350, 500, 250, 50, 25, s_p, cust_search_car);
        
        create_button("Back", 20, 600, 200, 50, 30, btns_back, cust_search_car);
         create_button("confirme buing the car", 500,600 , 400 , 50, 30 , confirme_buy_car,  cust_search_car);
        //take_attripute : to show data and set into Jlable.. 
        user_.take_attrute();
        
        btns_back.addActionListener(this);
        confirme_buy_car.addActionListener(this);
    }
   
    public void confirme_order()
    {
    
        cust_confirm_buy_car.setLayout(null);
        cust_confirm_buy_car.setBackground(Color.PINK);
        cust_confirm_buy_car.setVisible(true);
        f.add(cust_confirm_buy_car);
        
        jlable("Buy Car" , 500, 30 , 350, 50, 40 , l , cust_confirm_buy_car);     
        jlable("Username", 200, 250 , 250, 50, 30 , l_user_buy_cust_car , cust_confirm_buy_car);     
        jlable("VISA ssn", 200, 350 , 250, 50, 30 , l_visa_buy_cust_car , cust_confirm_buy_car);        
        create_button("CONFIRM BUING", 420, 550, 300, 40, 30,confirme_finaly_buy_car, cust_confirm_buy_car);
        create_jtextpass(500, 350, 300, 40, 25,p_visa_buy_cust_car ,cust_confirm_buy_car);
        create_jtextf(500, 250, 300, 40, 25,f_visa_buy_cust_car ,cust_confirm_buy_car);
        
        create_button("Back", 20, 600, 200, 50, 30, btn_b7, cust_confirm_buy_car);
        btn_b7.addActionListener(this);
        confirme_finaly_buy_car.addActionListener(this);
    
    }
    //................//
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn_admin)
        {
            start.setVisible(false);
            login_page();
        }
        else if(ae.getSource() == btn_login)
        {
            //to check login data .... 
            if(admin_.check_login(f_login_admin.getText() , p_login_admin.getText())== true)
            {
                admin_login.setVisible(false);
                control_system();
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Invalid in your username or password");
                f_login_admin.setText("");
                p_login_admin.setText("");
            }
        }
        else if(ae.getSource() == btn_add_car)
        {
            admin_control.setVisible(false);
            add_car();
        }
        
        else if(ae.getSource() == btn_cho_color)
        {
            c = JColorChooser.showDialog(f, " ", Color.yellow);
            l_set_color.setBackground(c); 
            x = c.hashCode();
        }
        else if(ae.getSource() == btn_add_data)
        {
            car.setModel(f_model.getText());
            car.setCode_car(Integer.parseInt(f_code.getText()));
            car.setPrice(Integer.parseInt(f_price.getText()));
            car.setYear_of_purchase(Integer.parseInt(f_year.getText()));
            car.setMax_speed(Integer.parseInt(f_max.getText()));
            
            admin_.insert_car();
            
            admin_add_car.setVisible(false);
            admin_update_car.setVisible(false);
            control_system();
            car.display();
        }
        else if(ae.getSource() == btn_delete_car)
        {
            admin_control.setVisible(false);
            delete_car();
        }
        //..............//.............
        else if(ae.getSource() == btn_delete_data)
        {
            car.setCode_car(Integer.parseInt(f_delete.getText())); 
            if(admin_.delete()==true){ 
                admin_delete_car.setVisible(false);
                control_system();
               // JOptionPane.showMessageDialog(null, "Car is Deleted");
            }else{
                //JOptionPane.showMessageDialog(null , "Code Car Is Not Exist");
                System.out.println("car  isn,t found");
            }
        }
        else if(ae.getSource() == btn_update_car)
        {
            admin_control.setVisible(false);
            set_to_update();
        }
        else if(ae.getSource() == btn_update)
        {
       
            car.setCode_car(Integer.parseInt(f_code.getText()));
            car.setModel(f_model.getText());
            car.setPrice(Integer.parseInt(f_price.getText()));
            car.setYear_of_purchase(Integer.parseInt(f_year.getText()));
            car.setMax_speed(Integer.parseInt(f_max.getText()));
                
            if(admin_.update()==true){
                //JOptionPane.showMessageDialog(null, "Car is update");
                admin_update_car.setVisible(false);
                control_system();
                car.display();
            }else{
                JOptionPane.showMessageDialog(null, "Code is not exist");
            }
        }
        //.....................//.................ccustomer
        else if(ae.getSource() == btn_user)
        {
            start.setVisible(false);
            method_cust_login();
        }
        else if(ae.getSource() == btn_cust_login)
        {
            //to check login data for customer .... 
            customer cust = new customer();
            cust.setUsername(f_login_custu.getText());
            cust.setPasseord(p_login_custp.getText());
            if(user_.check_login_customer()== true)
            {
                cust_login.setVisible(false);
                services();
            }
            else
            {
                JOptionPane.showMessageDialog(null , "Invalid in your username or password");
                f_login_custu.setText("");
                p_login_custp.setText("");
            }
        }
        else if(ae.getSource() == btn_cust_register)
        {
            cust_login.setVisible(false);
            custmoer_register();
        }
        else if(ae.getSource() == btn_creg_data)
        {
            customer cu = new customer();
            cu.setName(f_reg_custn.getText());
            cu.setUsername(f_reg_custu.getText());
            cu.setPasseord(p_reg_custp.getText());
            user_.insert_user();
            cust_register.setVisible(false);
            method_cust_login();
        }
        else if(ae.getSource() == btn_search_car)
        {
            cust_services.setVisible(false); 
            search_car();
        }
        else if(ae.getSource() == search_cust_car)
        {
            car.setCode_car(Integer.parseInt(search_with_code.getText()));
            //x = Integer.parseInt(l_code.getText());
            if(user_.search() == true)
            {
                show_car();
                s_mo.setText(car.getModel());
                s_m.setText(String.valueOf(car.getMax_speed()));
                s_y.setText(String.valueOf(car.getYear_of_purchase()));
                s_p.setText(String.valueOf(car.getPrice()));
            }
            else
                JOptionPane.showMessageDialog(null, "Code is not exist");
        }
        
        else if(ae.getSource() == btns_back)
        {
            cust_search_car.setVisible(false);
            services();
        }
        ////////////////
        else if(ae.getSource() == confirme_buy_car)
        {
            x = Integer.parseInt(search_with_code.getText());
            cust_search_car.setVisible(false);
            confirme_order();
        }
        else if(ae.getSource() == confirme_finaly_buy_car)
        {
            user_.user_buy_car(x , Integer.parseInt(p_visa_buy_cust_car.getText()) , f_visa_buy_cust_car.getText());
            cust_confirm_buy_car.setVisible(false);
            services();
        }
        else if(ae.getSource() == btn_b1)
        {
            admin_control.setVisible(false);
            start_page();
        }
        else if(ae.getSource() == btn_b2)
        {
            admin_add_car.setVisible(false);
            control_system();
        }
        else if(ae.getSource() == btn_b3)
        {
            admin_delete_car.setVisible(false);
            control_system();
        }
        else if(ae.getSource() == btn_b4)
        {
            admin_update_car.setVisible(false);
            control_system();
        }
        else if(ae.getSource() == btn_b5)
        {
            cust_services.setVisible(false);
            start_page();
        }
        else if(ae.getSource() == btn_b6)
        {
            cust_buy_car.setVisible(false);
            services();
        }
        else if(ae.getSource() == btn_b7)
        {
            cust_confirm_buy_car.setVisible(false); 
            services();
        }
        else if(ae.getSource() == btn_b8)
        {
            admin_login.setVisible(false);
            start_page();
        }
        else if(ae.getSource() == btn_b9)
        {
            cust_register.setVisible(false);
            start_page();
        }
    }
}