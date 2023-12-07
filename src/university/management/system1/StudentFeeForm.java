
package university.management.system1;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class StudentFeeForm extends JFrame implements ActionListener{
    
   Choice crollno;
   JComboBox cbcourse,cbbranch,cbsemester;
   JLabel labeltotal;
   JButton update,pay,back;
    StudentFeeForm(){
        setSize(900,500);
        setLocation(300,100);
        setLayout(null);
        //Photo inserting
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,50,500,300);
        add(image);
        
         JLabel lblrollnumber=new JLabel("Select Roll Number");
        lblrollnumber.setBounds(20,60,180,20);//x=left to right move and y=up to down move 
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);//yeh add print karwata hai value ko frame k upar
        //Class for the Drop down creating 
        crollno=new Choice();
        crollno.setBounds(200,60,150,16);
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
        //Name
        JLabel name=new JLabel("Name");
        name.setBounds(20, 100, 150, 20);
        name.setFont(new Font("Tahoma",Font.BOLD,16));
        add(name);
        
       JLabel labelname=new JLabel();
       labelname.setBounds(200,100,150,20);//200+150
       labelname.setFont(new Font("Tahoma",Font.BOLD,16));
        add(labelname);//add to execute and run  the program
        
         //father name
        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(20, 140, 150, 20);
        fname.setFont(new Font("Tahoma",Font.BOLD,16));
        add(fname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(200,140,150,20);
        labelfname.setFont(new Font("Tahoma",Font.BOLD,16));
        add(labelfname);//add to execute and run  the program
        
        try{
            Conn c=new Conn();
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
            }
                    
         
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        //Roll number se jo select hoga uska data aane ka tarika hai
        crollno.addItemListener(new ItemListener(){
        
                    public void itemStateChanged(ItemEvent ie)
                    {
                        try{
            Conn c=new Conn();
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));               
                
            }
                    
         
        }catch(Exception e)
        {
            e.printStackTrace();
        }
                    }
        });
        
        //Course
         JLabel lblcousre=new JLabel("Course");
         lblcousre.setBounds(20, 180, 150, 20);
         lblcousre.setFont(new Font("serif",Font.BOLD,20));
         add(  lblcousre);
        
        //DropDownBox
        String course[]={"B.Tech","BSC","BCA","M.Tech","MSC","MCA","BCOM","MCOM"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200, 180, 150,20);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        //Branch
         JLabel branch=new JLabel("Branch");
        branch.setBounds(20, 220, 250, 20);
        branch.setFont(new Font("serif",Font.BOLD,20));
         add(  branch);
        
        //DropDownBox
        String branch1[]={"CSE","EE","EC","CIVIL","ME"};
        cbbranch=new JComboBox(branch1);
        cbbranch.setBounds(200, 220, 150,20);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        JLabel lblsemester=new JLabel("Semester");
        lblsemester.setBounds(20,260,150,20);//x=left to right move and y=up to down move 
        lblsemester.setFont(new Font("serif",Font.BOLD,20));
        add(lblsemester);
        
        
        String semester[]={"Semester1","Semester2","Semester3","Semester4","Semester5","Semester6","Semester7","Semester8"};
        
        cbsemester=new JComboBox(semester);
        cbsemester.setBounds(200, 260, 150,20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
         JLabel lbltotal=new JLabel("Total pay");
       lbltotal.setBounds(20, 300, 150, 20);
       lbltotal.setFont(new Font("serif",Font.BOLD,20));
        add(lbltotal);
        
          
      
        labeltotal=new JLabel();
        labeltotal.setBounds(200, 300, 150, 20);
        labeltotal.setFont(new Font("serif",Font.BOLD,16));
        add(labeltotal);
        
        //Button for Submit
         update=new JButton("Update");
         update.setBounds(10, 380, 100, 25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add( update);
        
          //Button for cancel
         pay=new JButton("Pay Fee");
         pay.setBounds(150, 380, 100, 25);
         pay.setBackground(Color.BLACK);
         pay.setForeground(Color.WHITE);
         pay.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(pay);
        
         //Button for cancel
         back=new JButton("Back");
         back.setBounds(270, 380, 100, 25);
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
        back.addActionListener(this); //Button click
       // login.setFont(new Font("Tahoma ",Font.BOLD,16));
        add(back);
        //..................
        setVisible(true);
    }
    //Function overriding 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==update)
        {
            String course=(String)cbcourse.getSelectedItem();
            String semester=(String)cbsemester.getSelectedItem();
            try{
                Conn c=new  Conn();
                ResultSet rs=c.s.executeQuery("select * from fee where course='"+course+"'");
                while(rs.next())
                {
                    labeltotal.setText(rs.getString(semester));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==pay)
                {
                  String rollno=crollno.getSelectedItem();
                  String course=(String)cbcourse.getSelectedItem();
                  String semester=(String)cbsemester.getSelectedItem();
                  String branch=(String)cbbranch.getSelectedItem();
                  String total=labeltotal.getText();
                  try{
                Conn c=new Conn();
                String query="insert into collegefee values('"+rollno+"','"+course+"','"+branch+"','"+semester+"','"+total+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "College Fee Submitted Successfully");
                setVisible(true);
            }catch (Exception e){
                e.printStackTrace();
            }
                  
                }
        else{
            setVisible(false);
        }
    }
    public static void main(String [] args)
    {
    new StudentFeeForm();
    }
}
