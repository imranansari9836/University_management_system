 
package university.management.system1;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Project extends JFrame implements ActionListener{ //Class java and Extend with JFrame 
    Project(){ //Constructor 
        setSize(1540,850);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
       Image i2=i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       // image.setBounds(350,0,200,200);
       add(image);
        //Informtion
        JMenuBar mb=new JMenuBar();
        JMenu newInformation=new JMenu("New Information");
        mb.add(newInformation);
        newInformation.setForeground(Color.blue);
        
        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        newInformation.add(facultyInfo); //Add on the facultyInfo
        //Add Teachers on the facultyInfo..................
        
        facultyInfo.addActionListener(this);  
       facultyInfo.setBackground(Color.WHITE);
        //StudentInfo
        JMenuItem StudentInfo=new JMenuItem("New Student Information");
        newInformation.add(StudentInfo); //Add on the facultyInfo
        //Add Student on the facultyInfo................
        
        StudentInfo.addActionListener(this);
        facultyInfo.setBackground(Color.WHITE);
        //Details
        JMenu details=new JMenu("View Detials");
        mb.add(details);
        details.setForeground(Color.red);
        //facultyDetails
        JMenuItem facultyDetails=new JMenuItem("view Faculty Details");
        details.add(facultyDetails); //Add on the facultyInfo
        facultyDetails.addActionListener(this);
        facultyInfo.setBackground(Color.WHITE);
        
        JMenuItem studentDetails=new JMenuItem("view Student Details");
        details.add(studentDetails); //Add on the facultyInfo
        studentDetails.addActionListener(this);
        studentDetails.setBackground(Color.WHITE);
        
        //Leave
        JMenu leave=new JMenu("Apply Leave");
        mb.add(leave);
        leave.setForeground(Color.blue);
        
        JMenuItem facultyLeave=new JMenuItem("Faculty Leave");
        leave.add(facultyLeave); //Add on the facultyInfo
        facultyLeave.addActionListener(this);
        facultyLeave.setBackground(Color.WHITE);
        
        JMenuItem StudentLeave=new JMenuItem("Student Leave");
        leave.add(StudentLeave); //Add on the facultyInfo
        StudentLeave.addActionListener(this);
        StudentLeave.setBackground(Color.WHITE);
        
        //Leave Details
        JMenu leaveDetails=new JMenu("Leave Details");
        mb.add(leaveDetails);
        leaveDetails.setForeground(Color.red);
        
        JMenuItem facultyLeaveDetails=new JMenuItem("Faculty Leave Details");
        leaveDetails.add(facultyLeaveDetails); //Add on the facultyInfo
        facultyLeaveDetails.addActionListener(this);
        facultyLeaveDetails.setBackground(Color.WHITE);
        
        JMenuItem StudentLeaveDetails=new JMenuItem("Student Leave Details");
        leaveDetails.add(StudentLeaveDetails); //Add on the facultyInfo
        StudentLeaveDetails.addActionListener(this);
        StudentLeaveDetails.setBackground(Color.WHITE);
         
        //Exams
        JMenu exam=new JMenu("Examination");
        mb.add(exam);
        exam.setForeground(Color.blue);
        
        JMenuItem examinationdetails=new JMenuItem("Examination Result");
        exam.add(examinationdetails); //Add on the facultyInfo
        examinationdetails.addActionListener(this);
        examinationdetails.setBackground(Color.WHITE);
        
        JMenuItem entermarks=new JMenuItem("Enter Marks");
        exam.add(entermarks); //Add on the facultyInfo
        entermarks.addActionListener(this);
        entermarks.setBackground(Color.WHITE);
       
        //Update Info.
        JMenu updateInfo=new JMenu("Update Details");
        mb.add(updateInfo);
        updateInfo.setForeground(Color.red);
        
        JMenuItem updateFacultyInfo=new JMenuItem("Upadate Faculty Details");
        updateInfo.add(updateFacultyInfo); //Add on the facultyInfo
        updateFacultyInfo.addActionListener(this);
       updateFacultyInfo.setBackground(Color.WHITE);
        
        JMenuItem updateStudentInfo=new JMenuItem("Update Student Detials");
        updateInfo.add(updateStudentInfo); //Add on the facultyInfo
        updateStudentInfo.addActionListener(this);

        //Fee
        JMenu fee=new JMenu("Fee Details");
        mb.add(fee);
        fee.setForeground(Color.blue);
        
        JMenuItem feestructure=new JMenuItem("Fee Structure");
        fee.add(feestructure); //Add on the facultyInfo
        feestructure.addActionListener(this);
        feestructure.setBackground(Color.WHITE);
        
        JMenuItem studentfeeform=new JMenuItem("Student Fee Form");
        fee.add( studentfeeform); //Add on the facultyInfo
        studentfeeform.addActionListener(this);
        studentfeeform.setBackground(Color.WHITE);
        
        
        //Utility
        JMenu utility=new JMenu("Utility");
        mb.add( utility);
        utility.setForeground(Color.red);
        
        JMenuItem Notepad=new JMenuItem("Notepad");
        Notepad.addActionListener(this);
        utility.add( Notepad); //Add on the facultyInfo
        Notepad.setBackground(Color.WHITE);
        
        JMenuItem Calculator=new JMenuItem("Calculator");
        Calculator.addActionListener(this);
        utility.add( Calculator); //Add on the facultyInfo
        Calculator.setBackground(Color.WHITE);
        
        //About
        JMenu about=new JMenu("About");
        mb.add( about);
        about.setForeground(Color.blue );
        
        JMenuItem ab=new JMenuItem("About");
        ab.addActionListener(this);
        about.add( ab); //Add on the facultyInfo
        ab.setBackground(Color.WHITE);
        
         //Exit
        JMenu Exit=new JMenu("Exit");
        mb.add( Exit);
        Exit.setForeground(Color.red );
        
        JMenuItem ex=new JMenuItem("Exit");
        ex.addActionListener(this);
        Exit.add( ex); //Add on the facultyInfo
        ex.setBackground(Color.WHITE);
        
        setJMenuBar(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        if(msg.equals("Exit"))
        {
            setVisible(false);
        }else if(msg.equals("Calculator"))
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Notepad"))
        {
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e)
            {
                
            }
        }
        //AddTeachers and AddStudents on the new faculty information and the new students information
        else if(msg.equals("New Faculty Information"))
                    {
                    new AddTeachers();
                    }
        else if(msg.equals("New Student Information"))
        {
            new AddStudent();
        }else if(msg.equals("view Faculty Details"))
        {
            new TeachersDetails();
        }else if(msg.equals("view Student Details"))
        {
            new StudentDetails();
        }else if(msg.equals("Faculty Leave"))
        {
            new TeacherLeave();
        }else if(msg.equals("Student Leave"))
        {
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details"))
        {
            new TeacherLeaveDetails();
        }else if(msg.equals("Student Leave Details"))
        {
            new StudentLeaveDetails();
        }
        else if(msg.equals("Upadate Faculty Details"))
        {
            new UpdateTeacher();
        }else if(msg.equals("Update Student Detials"))
        {
            new UpdateStudent();
        }else if(msg.equals("Enter Marks"))
        {
            new EnterMarks();
        }else if(msg.equals("Examination Result"))
        {
            new ExaminationResult();
        }else if(msg.equals("Fee Structure"))
        {
            new FeeStructure();
        }else if(msg.equals("About"))
        {
            new About();
        }else if(msg.equals("Student Fee Form"))
        {
            new StudentFeeForm();
        }


    }
 
    
public static void main(String[]args)
{
    new Project(); //Fuction
}
    
}
