 <%@page import="com.mvc.bean.CourseBean"%> 
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
</head>
<body>
 <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Course id</b></th> 
          <th><b>Course Name</b></th> 
          <th><b>Grade</b></th> 
         </tr> 
      
        <% ArrayList<CourseBean> std =  (ArrayList<CourseBean>)request.getAttribute("data"); 
        if(std.size()>0){
        for(CourseBean s:std){%> 
      
            <tr> 
                <td><%=s.getcourse_id()%></td> 
                <td><%=s.getcourse_name()%></td> 
                <td><%=s.getgrade()%></td> 
            </tr> 
            <%}%>  
            <%}else{%>
            <h2>Student not found</h2>
            <%}%> 
        </table>
 <div style="text-align: right"><a href="Home.jsp">Go Back</a></div>

</body>
</html>

