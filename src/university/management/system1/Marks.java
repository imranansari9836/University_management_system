

package university.management.system1;

import java.awt.*;//Color and font
import javax.swing.*;//JFrame
import java.sql.*;
import java.awt.event.*;
public class Marks extends JFrame implements ActionListener {
    String rollno;
    JButton cancel;
    Marks(String rollno)
    {
        this.rollno=rollno;
        
        //Frame
        setSize(500,600);
        setLocation(500,100);
        //HEading
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading=new JLabel("Madhyanchal Professional University");
        heading.setBounds(90, 10, 500, 30);
        heading.setFont(new Font("serif",Font.ITALIC,20));
        add(heading);
        
        JLabel sheading=new JLabel("Result of Examination 2022");
        sheading.setBounds(120, 50, 500, 20);
        sheading.setFont(new Font("serif",Font.ITALIC,20));
        add(sheading);
        
        JLabel lblrollno=new JLabel("Roll Number"+rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollno);
        
        JLabel lblsemester=new JLabel("Result of Examination 2022");
       lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("serif",Font.PLAIN,20));
        add(lblsemester);
        //Subject
         
        JLabel sub1=new JLabel();
       sub1.setBounds(100, 200, 500, 20);
       sub1.setFont(new Font("serif",Font.PLAIN,20));
        add(sub1);
        
          
        JLabel sub2=new JLabel();
       sub2.setBounds(100, 230, 500, 20);
      sub2.setFont(new Font("serif",Font.PLAIN,20));
        add(sub2);
        
          
        JLabel sub3=new JLabel();
      sub3.setBounds(100, 260, 500, 20);
       sub3.setFont(new Font("serif",Font.PLAIN,20));
        add(sub3);
        
          
        JLabel sub4=new JLabel();
       sub4.setBounds(100, 290, 500, 20);
       sub4.setFont(new Font("serif",Font.PLAIN,20));
        add(sub4);
        
          
        JLabel sub5=new JLabel();
       sub5.setBounds(100, 320, 500, 20);
       sub5.setFont(new Font("serif",Font.PLAIN,20));
        add(sub5);
        //Data base me se values nikalna
        try{
            Conn c=new Conn();
            ResultSet rs1=c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
            while(rs1.next())
            {
                sub1.setText(rs1.getString("Subject1"));
                sub2.setText(rs1.getString("Subject2"));
                sub3.setText(rs1.getString("Subject3"));
                sub4.setText(rs1.getString("Subject4"));
                sub5.setText(rs1.getString("Subject5"));
            }
             ResultSet rs2=c.s.executeQuery("select * from marks where rollno='"+rollno+"'");
            while(rs2.next())
            {
                sub1.setText(sub1.getText()+"-----"+rs2.getString("marks1"));
                sub2.setText(sub2.getText()+"-----"+rs2.getString("marks2"));
                sub3.setText(sub3.getText()+"-----"+rs2.getString("marks3"));
                sub4.setText(sub4.getText()+"-----"+rs2.getString("marks4"));
                sub5.setText(sub5.getText()+"-----"+rs2.getString("marks5"));
                lblsemester.setText("Semester "+rs2.getString("semester"));
            }
            
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        
         //Button for cancel
         cancel=new JButton("Back");
         cancel.setBounds(250, 400, 150, 25);
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
         cancel.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(cancel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    public static void main(String []args)
    {
        new Marks("");
        
    }
    
}
