
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class set_panel extends abs_fun{
    
    @Override
    public void panel(int i , int ii , JPanel p1 , JFrame f)
    {
        p1.setLayout(null);
        p1.setBackground(Color.yellow);
        p1.setVisible(true);
        p1.setSize(i, ii);
        f.add(p1);
    }
    
    @Override
    public void jlable(String name , int i , int ii ,int w , int h , int size_text , JLabel l, JPanel p)
    {
        l.setText(name);
        l.setBounds(i, ii, w, h);
        l.setVisible(true);
        l.setFont(new Font("", Font.BOLD, size_text));
        p.add(l);
    }
    
    @Override
    public void create_button(String name , int i , int ii ,int w , int h , int size_text , JButton b, JPanel p)
    {
        b.setText(name);
        b.setVisible(true); 
        b.setBounds(i, ii, w, h);
        b.setBackground(Color.CYAN);
        b.setFont(new Font("", Font.BOLD, size_text));
        p.add(b);
    }
    
    public void create_button(String name , int i , int ii ,int w , int h , int size_text , JButton b, JLabel l)
    {
        b.setText(name);
        b.setVisible(true); 
        b.setBounds(i, ii, w, h);
        b.setBackground(Color.CYAN);
        b.setFont(new Font("", Font.BOLD, size_text));
        l.add(b);
    }
    
    @Override
    public void create_jtextf( int i , int ii ,int w , int h , int size_text , JTextField t, JPanel p)
    {
        t.setBounds(i, ii, w, h);
        t.setFont(new Font("", Font.BOLD, size_text));
        p.add(t);
    }
    
    public void create_jtextf( int i , int ii ,int w , int h , int size_text , JTextField t, JLabel l)
    {
        t.setBounds(i, ii, w, h);
        t.setFont(new Font("", Font.BOLD, size_text));
        l.add(t);
    }
    
    @Override
    public void create_jtextpass(int i , int ii ,int w , int h , int size_text , JPasswordField pf, JPanel p)
    {
        pf.setBounds(i, ii, w, h);
        pf.setFont(new Font("", Font.BOLD, size_text));
        p.add(pf);
    }
    
    public void background_photo (JPanel p )
    {
        ImageIcon img=new ImageIcon("startbackground.jpeg");
        JLabel background1 =new JLabel("",img,JLabel.CENTER);
        background1.setBounds(0,0,1200, 700);
        p.add(background1);
    }
}
