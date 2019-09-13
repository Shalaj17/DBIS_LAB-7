package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mvc.bean.StudentBean;
import com.mvc.bean.CourseBean;
import com.mvc.bean.AdvisorBean;
import com.mvc.util.DBConnection;
public class AdvisorDao {
public  ArrayList<AdvisorBean> getAdvisorInformation(AdvisorBean advisorbean)
{
	 ArrayList<AdvisorBean> std = new ArrayList<AdvisorBean>(); 
	String id=advisorbean.getId();
Connection con = null;
Statement statement = null;
ResultSet resultSet = null;
PreparedStatement ps=null;
String student_id="";
String advisor_id="";
String advisor_name="";
try
{
con = DBConnection.createConnection(); //establishing connection
String query = "select s.id as id,a.i_id as advisor_id,i.name as advisor_name from (student s join advisor a on s.id = a.s_id ) join instructor i on i.id = a.i_id  where s.id = ?";
ps = con.prepareStatement(query);
ps.setString(1, id);
resultSet = ps.executeQuery();
while(resultSet.next()) // Until next row is present otherwise it return false
{
student_id = resultSet.getString("id"); //fetch the values present in database
advisor_id = resultSet.getString("advisor_id");
advisor_name= resultSet.getString("advisor_name");
std.add(new AdvisorBean(student_id,advisor_id,advisor_name));
System.out.println(std);
System.out.println(student_id+" "+advisor_id+" "+advisor_name);
}
}
catch(SQLException e)
{
e.printStackTrace();
}
return std;
}
}