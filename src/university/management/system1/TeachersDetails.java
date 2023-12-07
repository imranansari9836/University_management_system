package university.management.system1;

import javax.swing.*;//For the JFrame
import java.awt.*;//Color awt package k andar aata hai
import java.sql.*;//ResultSet hota hai es packagage me 
import net.proteanit.sql.DbUtils;//values inserting on the table 
import java.awt.event.*;
public class TeachersDetails extends JFrame implements ActionListener {//Click Event on the   JButton search,print,update,add,cancel;//For making button to use this 
       
   //ddropDwon
    Choice crempid;//Class variable declear
    JTable table;
    JButton search,print,update,add,cancel;//For making button to use this 
    

    TeachersDetails()//Constructor
    
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading=new JLabel("Search by Employee Id");
        heading.setBounds(40,20,150,20);//x=left to right move and y=up to down move 
        add(heading);//yeh add print karwata hai value ko frame k upar
        //Class for the Drop down creating 
        crempid=new Choice();
        crempid.setBounds(200,20,150,20);
        add(crempid);
        //forn the exception handling
        try{
            Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from teacher");
           while(rs.next())
           {
               crempid.add(rs.getString("empId"));
           }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        //Creating new table 
        table =new JTable();//class object
          try{
            Conn c=new Conn();
           ResultSet rs= c.s.executeQuery("select * from teacher");
          table.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        //Button
        //Search
        search=new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);//Click on the search and use too
        add(search);
        
        //print
        print=new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
        //add
        add=new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);
        
        //update
       update=new JButton("Update");
       update.setBounds(320, 70, 80, 20);
       update.addActionListener(this);
        add( update);
        
        
        //cancel
       cancel=new JButton("Cancel");
       cancel.setBounds(420, 70, 80, 20);
       cancel.addActionListener(this);
        add( cancel);
        
        //For creatin frame 
        setSize(900,700);//kitna size hai 
        setLocation(300,50);//Kaha se frame kholna hai
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)//Overriding function
    {
        if(ae.getSource()==search)
        {
            String query="select * from teacher where rollno='"+crempid.getSelectedItem()+"'";
            try{
                Conn c=new Conn();
               ResultSet rs= c.s.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()==print)
        {
            try{
                table.print();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()==add)
        {
            setVisible(false);
            new AddTeachers();
        }else if(ae.getSource()==update)
        {
            setVisible(false);
            new UpdateTeacher();
           
        } else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
        
    }
    public static void main(String[]args )
    {
        new TeachersDetails();//Class object
    }
    
}
