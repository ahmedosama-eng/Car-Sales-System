
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public abstract class abs_fun {
    public void panel(int i , int ii , JPanel p1 , JFrame f){}
    
    public void jlable(String name , int i , int ii ,int w , int h , int size_text , JLabel l, JPanel p){}
    
    public void create_button(String name , int i , int ii ,int w , int h , int size_text , JButton b, JPanel p){}
    
    public void create_jtextf( int i , int ii ,int w , int h , int size_text , JTextField t, JPanel p){}
    
    public void create_jtextpass(int i , int ii ,int w , int h , int size_text , JPasswordField pf, JPanel p){}
    
}
