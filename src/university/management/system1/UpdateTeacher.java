package university.management.system1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateTeacher extends JFrame implements ActionListener{
    JTextField tfcourse,tffnumber,tffaddress ,tfbranch,tffemail;//Add label for text field Add label for text field
    JLabel  lebelempid; 
   // JDateChooser dcdob;
    //JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    Choice cempid;
    
    //For roll NUmber random number generated to use this random class(Object)
    
    UpdateTeacher()
    {
        //Frame making 
        setSize(900,700);
        setLocation(350,50);//left to 350 and up to  down 50
        
        setLayout(null);
      //  setVisible(true);//Frame open to create also the setVisible (true).
        
        JLabel heading=new JLabel("Update Teacher Details");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("serif",Font.ITALIC,35));
        add(heading);
         
        JLabel lblrollnumber=new JLabel("Select Employee Id ");
        lblrollnumber.setBounds(50,100,200,20);//x=left to right move and y=up to down move 
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);//yeh add print karwata hai value ko frame k upar
        //Class for the Drop down creating 
        cempid=new Choice();
        cempid.setBounds(250,100,200,20);
        add(cempid);
        //forn the exception handling
        try{
            Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from teacher");
           while(rs.next())
           {
               cempid.add(rs.getString("empid"));//sql se data uthana hai to use karte hai
           }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //Name
        JLabel name=new JLabel("Name");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);
        
       JLabel labelname=new JLabel();
       labelname.setBounds(200,150,150,30);//200+150
       labelname.setFont(new Font("serif",Font.BOLD,20));
        add(labelname);//add to execute and run  the program
        
         //father name
        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(500, 150, 200, 30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(700,150,150,30);
        labelfname.setFont(new Font("serif",Font.BOLD,20));
        add(labelfname);//add to execute and run  the program
        
         //Roll Number
        JLabel roll=new JLabel("Employee Id");
        roll.setBounds(50, 200, 200, 30);
        roll.setFont(new Font("serif",Font.BOLD,20));
        add(roll);
        
        lebelempid=new JLabel();
        lebelempid.setBounds(200, 200, 200, 30);
        lebelempid.setFont(new Font("serif",Font.BOLD,20));
        add( lebelempid);
        
        //Date of birth
        JLabel date=new JLabel("Date of Birth");
        date.setBounds(500, 200, 200, 30);
        date.setFont(new Font("serif",Font.BOLD,20));
        add(date);
        
        JLabel labeldoc =new JLabel();
        labeldoc.setBounds(700,200,150,30);
        labeldoc.setFont(new Font("serif",Font.BOLD,20));
        add(labeldoc);
        
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
        JLabel email=new JLabel("Email Id");
        email.setBounds(50, 300, 200, 30);
        email.setFont(new Font("serif",Font.BOLD,20));
        add(email);
        
        tffemail=new JTextField();
        tffemail.setBounds(200,300,150,30);
        add( tffemail);//add to execute and run  the program
        
        //10thPErcentage
        JLabel lblx=new JLabel("Class X(%)");
        lblx.setBounds(500, 300, 150, 30);
         lblx.setFont(new Font("serif",Font.BOLD,20));
        add( lblx);
        
        JLabel labelx=new JLabel();
        labelx.setBounds(700,300,150,30);
        labelx.setFont(new Font("serif",Font.BOLD,20));
        add( labelx);//add to execute and run  the program
        
        //!2th Percentage
        JLabel lblxii=new JLabel("Class XII(%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
        JLabel labelxii=new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("serif",Font.BOLD,20));
        add(labelxii);//add to execute and run  the program
        
         //AdharNumber
        JLabel Aadhar=new JLabel("Aadhar Number");
        Aadhar.setBounds(500, 350, 200, 30);
        Aadhar.setFont(new Font("serif",Font.BOLD,20));
        add(  Aadhar);
        
       JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(700,350,150,30);
       labelaadhar.setFont(new Font("serif",Font.BOLD,20));
        add( labelaadhar);//add to execute and run  the program
        //Course
         JLabel lblcousre=new JLabel("Education");
         lblcousre.setBounds(50, 400, 200, 30);
         lblcousre.setFont(new Font("serif",Font.BOLD,20));
         add(  lblcousre);
        
        //DropDownBox
                     
        tfcourse=new JTextField();
        tfcourse.setBounds(200, 400, 150,30);
        add(tfcourse);
        
        //Branch
         JLabel branch=new JLabel("Department");
        branch.setBounds(500, 400, 200, 30);
        branch.setFont(new Font("serif",Font.BOLD,20));
         add(  branch);
        
        //DropDownBox
      
        tfbranch=new JTextField();
        tfbranch.setBounds(700, 400, 150,30);
        add(tfbranch);
        
        try{
            Conn c=new Conn();
            String query="select * from teacher where empid='"+cempid.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                lebelempid.setText(rs.getString("empid"));
                labeldoc.setText(rs.getString("dob"));
                tffaddress.setText(rs.getString("address"));
                tffnumber.setText(rs.getString("phone"));
                tffemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                tfcourse.setText(rs.getString("education"));
                tfbranch.setText(rs.getString("department"));
                
            }
                    
         
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //Roll number se jo select hoga uska data aane ka tarika hai
        cempid.addItemListener(new ItemListener(){
        
                    public void itemStateChanged(ItemEvent ie)
                    {
                        try{
            Conn c=new Conn();
            String query="select * from teacher where empid='"+cempid.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                lebelempid.setText(rs.getString("empid"));
                labeldoc.setText(rs.getString("dob"));
                tffaddress.setText(rs.getString("address"));
                tffnumber.setText(rs.getString("phone"));
                tffemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                tfcourse.setText(rs.getString("education"));
                tfbranch.setText(rs.getString("department"));
                
            }
                    
         
        }catch(Exception e)
        {
            e.printStackTrace();
        }
                    }
        });
                
        //Button for Submit
         submit=new JButton("Update");
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
          //value take from the From table on the this given formate         
          String empid=lebelempid.getText();
          String address= tffaddress.getText();
          String phone=tffnumber.getText();
          String email=tffemail.getText();
          String course=tfcourse.getText();
          String branch=tfbranch.getText();
          //Error Handling
          try{
              //Varchar return always ''single inverted ,
              String query="update teacher set address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+course+"',department='"+branch+"'where empid='"+empid+"'";
              Conn con=new Conn();
              con.s.executeUpdate(query);
              //For popup"Invalid password and user-JOptionPane 
             JOptionPane.showMessageDialog(null,"Teacher Details Updated Successfully!");
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
        new UpdateTeacher();
    }
}
