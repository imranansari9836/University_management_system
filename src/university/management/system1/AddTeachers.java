
package university.management.system1;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeachers extends JFrame implements ActionListener{
    JTextField tfname,tffname,tffaddress,tffnumber, tffemail,tfflblxr,tfflblxii,tffAadhar;//Add label for text field Add label for text field
    JLabel lebelempid; 
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    
    //For roll NUmber random number generated to use this random class(Object).
    
    Random ran=new Random(); 
    long first4=Math.abs((ran.nextLong()%9000L)+1000L);//Without the Math.abs to generate the negative number only 
    
    
    AddTeachers()
    {
        //Frame making 
        setSize(900,700);
      //  setLocation(350,50);//left to 350 and up to  down 50
        
        setLayout(null);
      //  setVisible(true);//Frame open to create also the setVisible (true).
        
        JLabel heading=new JLabel("New Teachers Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        //Name
        JLabel name=new JLabel("Name");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);//200+150
        add(tfname);//add to execute and run  the program
        
         //father name
        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(500, 150, 200, 30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);
        
        tffname=new JTextField();
        tffname.setBounds(700,150,150,30);
        add(tffname);//add to execute and run  the program
        
         //Employee id
        JLabel roll=new JLabel("Employee id");
        roll.setBounds(50, 200, 200, 30);
        roll.setFont(new Font("serif",Font.BOLD,20));
        add(roll);
        
        lebelempid=new JLabel("1122"+first4);
       lebelempid.setBounds(200, 200, 200, 30);
        lebelempid.setFont(new Font("serif",Font.BOLD,20));
        add(lebelempid);
        
        //Date of birth
        JLabel date=new JLabel("Date of Births");
        date.setBounds(500, 200, 200, 30);
        date.setFont(new Font("serif",Font.BOLD,20));
        add(date);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(700,200,150,30);
        add(dcdob);
        
        //Address
        JLabel address=new JLabel("Address");
        address.setBounds(50, 250, 200, 30);
        address.setFont(new Font("serif",Font.BOLD,20));
        add(address);
        
        tffaddress=new JTextField();
        tffaddress.setBounds(200,250,150,30);
        add(tffaddress);//add to execute and run  the program
        
        //Phone 
        JLabel number=new JLabel("Number");
        number.setBounds(500, 250, 200, 30);
        number.setFont(new Font("serif",Font.BOLD,20));
        add(number);
        
        tffnumber=new JTextField();
        tffnumber.setBounds(700,250,150,30);
        add(tffnumber);//add to execute and run  the program
        
        //Email
        JLabel email=new JLabel("Email");
        email.setBounds(50, 300, 200, 30);
        email.setFont(new Font("serif",Font.BOLD,20));
        add(email);
        
        tffemail=new JTextField();
        tffemail.setBounds(200,300,150,30);
        add( tffemail);//add to execute and run  the program
        
        //10thPErcentage
        JLabel lblx=new JLabel("Class X(%)");
        lblx.setBounds(500, 300, 200, 30);
         lblx.setFont(new Font("serif",Font.BOLD,20));
        add( lblx);
        
        tfflblxr=new JTextField();
        tfflblxr.setBounds(700,300,150,30);
        add( tfflblxr);//add to execute and run  the program
        
        //!2th Percentage
        JLabel lblxii=new JLabel("Class XII(%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
        tfflblxii=new JTextField();
        tfflblxii.setBounds(200,350,150,30);
        add(tfflblxii);//add to execute and run  the program
        
         //AdharNumber
        JLabel Aadhar=new JLabel("Aadhar Number");
         Aadhar.setBounds(500, 350, 200, 30);
          Aadhar.setFont(new Font("serif",Font.BOLD,20));
        add(  Aadhar);
        
        tffAadhar=new JTextField();
        tffAadhar.setBounds(700,350,150,30);
        add( tffAadhar);//add to execute and run  the program
        //Course
         JLabel lblcousre=new JLabel("Qualification");
         lblcousre.setBounds(50, 400, 200, 30);
         lblcousre.setFont(new Font("serif",Font.BOLD,20));
         add(  lblcousre);
        
        //DropDownBox
        String course[]={"B.tech","BBA","BCA","MSC","M.Tech","PHD","B.Pharma","M.Pharma"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200, 400, 150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        //Branch
         JLabel branch=new JLabel("Department");
        branch.setBounds(500, 400, 200, 30);
        branch.setFont(new Font("serif",Font.BOLD,20));
         add(  branch);
        
        //DropDownBox
        String branch1[]={"CSE","EE","EC","CIVIL","ME"};
        cbbranch=new JComboBox(branch1);
        cbbranch.setBounds(700, 400, 150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        //Button for Submit
         submit=new JButton("Submit");
        submit.setBounds(200, 500, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
       submit.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(submit);
        
          //Button for cancel
         cancel=new JButton("Cancel");
        cancel.setBounds(400, 500, 100, 25);
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
     cancel.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(cancel);
        //Below always SetVisible
        setVisible(true);//Frame open to create also the setVisible (true).
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==submit)  
      {
          //value take from the Form table on the this given formate 
          String name =tfname.getText();
          String fname=tffname.getText();
          String rollno=lebelempid.getText();
          String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
          String address= tffaddress.getText();
          String phone=tffnumber.getText();
          String email=tffemail.getText();
          String x=tfflblxr.getText();
          String xii=tfflblxii.getText();
          String aadhar= tffAadhar.getText();
          String course=(String)cbcourse.getSelectedItem();
          String branch=(String)cbbranch.getSelectedItem();
          //Error Handling
          try{
              //Varchar return always ''single inverted ,
              String query="insert into teacher values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
              Conn con=new Conn();
              con.s.executeUpdate(query);
              //For popup"Invalid password and user-JOptionPane 
             JOptionPane.showMessageDialog(null,"Teachers Details Inserted Successfully!");
             setVisible(false);
                   
                      
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          
      }else
      {
       setVisible(false);
      }
    }
    public static void main(String []args)
    {
        new AddTeachers();
    }
}
