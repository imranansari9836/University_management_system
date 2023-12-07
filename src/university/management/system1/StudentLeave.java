
package university.management.system1;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*;

public class StudentLeave extends JFrame implements ActionListener{
    Choice crollno, ctime;
    JDateChooser dcdate;
    JButton submit,cancel;
    StudentLeave()
{
    setSize(500,550);
    setLocation(500,100);
    setLayout(null);
    getContentPane().setBackground(Color.white);
    JLabel heading=new JLabel("Apply leave (Student)");
    heading.setBounds(40, 50,300,40);
    heading.setFont(new Font("Tahoma",Font.BOLD,20));
    add(heading);
    //ForDropDown
     JLabel lblrollno=new JLabel("Search by Roll Number");
        lblrollno.setBounds(60,100,200,20);//x=left to right move and y=up to down move 
         lblrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblrollno);//yeh add print karwata hai value ko frame k upar
        //Class for the Drop down creating 
        crollno=new Choice();
        crollno.setBounds(60,130,200,20);
        add(crollno);
        //forn the exception handling
        try{
            Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from student");
           while(rs.next())
           {
               crollno.add(rs.getString("rollno"));
           }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //for datee label
         JLabel lbldate=new JLabel("Date");
        lbldate.setBounds(60,180,200,20);//x=left to right move and y=up to down move 
        lbldate.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbldate);//yeh add print karwata hai value ko frame k upar
        //Calender making
          dcdate=new JDateChooser();
         dcdate.setBounds(60,210,200,25);
        add( dcdate);
        
        JLabel lbltime=new JLabel("Time Duration");
        lbltime.setBounds(60,260,200,20);//x=left to right move and y=up to down move 
         lbltime.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lbltime);//yeh add print karwata hai value ko frame k upar
        
         ctime=new Choice();
         ctime.setBounds(60,290,200,20);
         ctime.add("Full day");
         ctime.add("Half day");
        add( ctime);
        
        //Button for Submit
         submit=new JButton("Submit");
        submit.setBounds(60, 350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
       submit.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(submit);
        
          //Button for cancel
         cancel=new JButton("Cancel");
        cancel.setBounds(200, 350, 125, 25);
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
     cancel.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(cancel);
        
        
    setVisible(true);
    

}
    //Abstract Method 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
            String rollno=crollno.getSelectedItem();
            String date=((JTextField)dcdate.getDateEditor().getUiComponent()).getText();
            String duration=ctime.getSelectedItem();
            
            String query="insert into studentLeave values('"+rollno+"','"+date+"','"+duration+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Leave Confirmed");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else
                {
                    setVisible(false);
                }
    }
    public static void main(String[]args)
    {
        new StudentLeave();
    }
    
}
