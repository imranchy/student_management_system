
package Logins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DatabaseConnector {
    Statement stm;
    ResultSet rs;
    Connection con;
    public  DatabaseConnector() throws ClassNotFoundException, SQLException
    {
      Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","");
         stm = con.createStatement();
    }
    
    //These are the queries for students_info;
    public String insert(int ID, String F_Name, String L_Name, String Course_Unit_and_Title, String Teacher) throws SQLException
    {
        String sql;
        sql ="INSERT INTO students_info(`ID`, `F_Name`, `L_Name`, `Course_Unit_and_Title`, `Teacher`) "+"VALUES (?,?,?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setInt(1, ID);
        pt.setString(2, F_Name);
        pt.setString(3, L_Name);
        pt.setString(4, Course_Unit_and_Title);
        pt.setString(5, Teacher);
        pt.execute();
      
        return "successfull";
    }
    
            public String update(int ID, String F_Name, String L_Name, String Course_Unit_and_Title, String Teacher) throws SQLException
    {
        String sql;
        sql = "UPDATE students_info set F_Name= '" + F_Name + "', L_Name = '" + L_Name + "', Course_Unit_and_Title='"+ Course_Unit_and_Title+"' WHERE ID=" + ID;  
        PreparedStatement pt = con.prepareStatement(sql);
        pt.execute();
      
        return "successfull";
    }
            
         public String delete(int ID, String F_Name, String L_Name, String Course_Unit_and_Title, String Teacher) throws SQLException
         {
                String sql;
                sql = "DELETE FROM students_info WHERE ID="+ID;
                PreparedStatement pt = con.prepareStatement(sql);
                pt.execute();
                return "successfull";
            }
         
            public List<String> searchByStudentId(int stdid) {
        List<String> stdInfo = new ArrayList<String>();
      
        try{
        String sql;
        sql = "SELECT * FROM students_info WHERE id="+stdid;
        PreparedStatement pt = con.prepareStatement(sql);
        ResultSet rs = pt.executeQuery();
        
        if(rs.next()){
            stdInfo.add(rs.getString("ID"));
            stdInfo.add(rs.getString("F_Name"));
            stdInfo.add(rs.getString("L_Name"));
            stdInfo.add(rs.getString("Course_Unit_and_Title"));
            stdInfo.add(rs.getString("Teacher"));
            
            
        }
        pt.execute();
        }catch(Exception e){
            
            
        }

        return stdInfo;
    }

         
     
       
        public String update(String tid, String Name, String Email, String Tele_No, String Course_Unit_and_Title) throws SQLException
        {
            String sql;
            sql = "UPDATE teachers_info SET tid = "+tid+"Name="+ Name+" Email = "+Email+" Tele_No="+Tele_No+"Course_Unit_and_Title= "+Course_Unit_and_Title+"WHERE tid="+tid;
             PreparedStatement pt = con.prepareStatement(sql);
             pt.execute();
             return "successfull";
        }
        
          public String delete(String tid, String Name, String Email, String Tele_No, String Course_Unit_and_Title) throws SQLException
          {
              String sql;
              sql = "DELETE FROM teachers_info WHERE tid ="+tid;
             PreparedStatement pt = con.prepareStatement(sql);
             pt.execute();
             return "successfull";
          }
          
 
          //These queries are for course_info;        
            public String insert(String cid, String Course_Name, String Course_Unit_and_Title) throws SQLException
    {
        String sql;
        sql ="INSERT INTO course_info(`cid`, `Course_Name`, `Course_Unit_and_Title`) "+"VALUES (?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, cid);
        pt.setString(2, Course_Name);
        pt.setString(3, Course_Unit_and_Title);
        pt.execute();
        
        return "successfull";
    }
            
                   public String delete(String cid, String Course_Name, String Course_Unit_and_Title) throws SQLException
    {
        String sql;
        sql ="DELETE FROM course_info WHERE cid = "+cid;
        PreparedStatement pt = con.prepareStatement(sql);
        pt.execute();
        
        return "successfull";
    }
                   
         public String update(String cid, String Course_Name, String Course_Unit_and_Title) throws SQLException
    {
        String sql;
            sql = "UPDATE course_info SET cid = "+cid+"Course_Name ="+Course_Name+"Course_Unit_and_Title= "+Course_Unit_and_Title+"WHERE cid="+cid;
             PreparedStatement pt = con.prepareStatement(sql);
             pt.execute();
             return "successfull";
    }
         

    
} 

