<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h2>Registration form </h2>
 <form:form action ="/employee/show" modelAttribute="employee"  method="post">
 
     <table>
       <tr>
       <td>Name</td>
       <td><form:input path="empName"/></td>
       </tr>
       
        <tr>
       <td>Address</td>
       <td><form:input path="empAddress"/></td>
       </tr>
     
      <tr>
       <td>Email</td>
       <td><form:input path="empEmail"/></td>
       </tr>
 
       
     </table>
 <input type="submit" value = "Register">
 
 </form:form>



</body>
</html>