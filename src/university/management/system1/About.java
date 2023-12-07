
package university.management.system1;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
public class About extends JFrame {
    About()
    {
        setSize(700,500);
        setLocation(250,150);
        getContentPane().setBackground(Color.white);
        
        //Photo inserting
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);
        
        setLayout(null);
        
        JLabel heading=new JLabel("<html>University<br/> Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        JLabel name=new JLabel("Developed by Imran Ansari");
        name.setBounds(50, 220, 550, 40);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);
        
        JLabel erno=new JLabel("Enrollment No:1900759");
        erno.setBounds(50, 250, 550, 40);
        erno.setFont(new Font("Tahoma",Font.BOLD,30));
        add(erno);
        
        JLabel contact=new JLabel("Contact me :imranansari9836@gmail.com");
        contact.setBounds(50, 270, 550, 50);
        contact.setFont(new Font("Tahoma",Font.BOLD,20));
        add(contact);
        
        setVisible(true);
    }
    public static void main(String []args)
    {
        new About();
    }
    
}
