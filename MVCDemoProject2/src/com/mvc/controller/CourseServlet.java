package com.mvc.controller;


 import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
import com.mvc.bean.LoginBean;
import com.mvc.bean.StudentBean;
import com.mvc.bean.CourseBean;
import com.mvc.bean.AdvisorBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.StudentDao;
import com.mvc.dao.CourseDao;
import com.mvc.dao.AdvisorDao;
 
public class CourseServlet extends HttpServlet {
 
public CourseServlet() {
 }
 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
//Here username and password are the names which I have given in the input box in Login.jsp page. Here I am retrieving the values entered by the user and keeping in instance variables for further use.
 
String id = request.getParameter("id");
System.out.println(id);
CourseBean courseBean=new CourseBean();
courseBean.setId(id);

 CourseDao courseDao=new CourseDao();

 ArrayList<CourseBean> std=courseDao.getCourseInformation(courseBean);
 request.setAttribute("data", std); 

   RequestDispatcher rd =  request.getRequestDispatcher("Course.jsp"); 
    rd.forward(request, response); 

 }
 
}