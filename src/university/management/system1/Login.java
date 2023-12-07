
package university.management.system1;
//import java.awt.Color;
//import java.awt.Image;  
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class Login extends JFrame implements ActionListener { 
    JButton login,cancel;
    JTextField tfusername,tfpassword;
    Login()//Constructor
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel lblusername=new JLabel("Username:"); //funtion
        lblusername.setBounds(40, 20, 100,20);
        add(lblusername);
       
        tfusername=new JTextField();
        tfusername.setBounds(150,20,150,20);
        add(tfusername );
       
        
        JLabel lblpassword=new JLabel("Password:"); //funtion
        lblpassword.setBounds(40, 70, 100,20);
         add(lblpassword );
        
         tfpassword=new JPasswordField();
        tfpassword.setBounds(150,70,150,20);
        add(tfpassword );
        
        
        login=new JButton("Login");
        login.setBounds(40, 120, 110, 25);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(login);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(180, 120, 110, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
       // cancel.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(cancel);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
                            
    }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==login){
         String username=tfusername.getText();
         String password=tfpassword.getText();
         //Mysql query
         String query = "select * from login where username='"+username+"'and password='"+password+"'"; 
         //Error Handling me use hota hai try ur catch
         try{
             Conn c=new Conn();
             //Executing msql query
            ResultSet rs=c.s.executeQuery(query);//on sql package
            if(rs.next())
            {
                setVisible(false);
                //Goes to next project........... Below
                new Project();
            }else
            {
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
                
            }
         }catch(Exception e)
         {
             e.printStackTrace();//Print ho raha hai
         }
                 
   }else if(ae.getSource()==cancel){
       setVisible(false);
   }
   }
    public static void main(String[]args)
    {
        new Login();
     
}
}
