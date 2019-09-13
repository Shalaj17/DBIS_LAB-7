 <%@page import="com.mvc.bean.AdvisorBean"%> 
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
          <th><b>Student id</b></th> 
          <th><b>Advisor id</b></th> 
          <th><b>Advisor name</b></th> 
         </tr> 
      
        <% ArrayList<AdvisorBean> std =  (ArrayList<AdvisorBean>)request.getAttribute("data"); 
        if(std.size()>0){   
        for(AdvisorBean s:std){%> 
      
            <tr> 
                <td><%=s.getId()%></td> 
                <td><%=s.getadvisor_id()%></td> 
                <td><%=s.getadvisor_name()%></td> 
            </tr> 
            <%}%>  
            <%}else{%>
            <h2>Student not found</h2>
            <%}%> 
        </table>
 <div style="text-align: right"><a href="Home.jsp">Go Back</a></div>

</body>
</html>

