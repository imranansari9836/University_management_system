
package university.management.system1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class FeeStructure extends JFrame {
    FeeStructure()
    {
        setSize(1000,700);
        setLocation(250,40);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading=new JLabel("Fee Structure");
        heading.setBounds(50, 10, 400, 30);
        //heading.setFont(new Font("Tahoma",Font.BOLD,30));
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        JTable table =new JTable();
        
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 60, 1000, 700);
        add(jsp);
        
        try{
            Conn c=new Conn();
            
            ResultSet rs=c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new FeeStructure();
    }
    
}
