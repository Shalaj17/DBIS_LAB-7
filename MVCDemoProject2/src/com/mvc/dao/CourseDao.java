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
public class CourseDao {
public  ArrayList<CourseBean> getCourseInformation(CourseBean coursebean)
{
	 ArrayList<CourseBean> std = new ArrayList<CourseBean>(); 
	String id=coursebean.getId();
Connection con = null;
Statement statement = null;
ResultSet resultSet = null;
PreparedStatement ps=null;
String student_id="";
String course_id="";
String course_name="";
String grade="";
try
{
con = DBConnection.createConnection(); //establishing connection
String query = "select id,course_id,title as course_name,grade from (course natural join takes) where id = ?";
ps = con.prepareStatement(query);
ps.setString(1, id);
resultSet = ps.executeQuery();
while(resultSet.next()) // Until next row is present otherwise it return false
{
student_id = resultSet.getString("id"); //fetch the values present in database
course_id = resultSet.getString("course_id");
course_name= resultSet.getString("course_name");
grade= resultSet.getString("grade");
std.add(new CourseBean(student_id,course_id,course_name,grade));
System.out.println(std);
System.out.println(student_id+" "+course_id+" "+course_name+" "+grade);
}
}
catch(SQLException e)
{
e.printStackTrace();
}
return std;
}
}