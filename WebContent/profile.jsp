<%@page import="lti.zombie.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="banner.jsp"/>

	<

	<table border="2">
		<tr>
			<th colspan="2">Your Professional Details</th>
		</tr>

		<tr>
			<td> Name </td>
			<td>${User.name}</td>
		</tr>


		<tr>
			<td>Current Location</td>
			<td>${User.location}</td>
		</tr>

		<tr>
			<td>Primary Skill</td>
			<td>${User.skill}</td>
		</tr>


		<tr>
			<td>Salary</td>
			<td>${User.expSal}</td>
		</tr>
	</table>
	
	<a href="Daemon.job"> Job Recommendations</a>
	
	 <form action="Daemon.job">
	 based skills<select name="skill">
	 
	 	<%String[] skills={"java","bigdata","web"};
	 		for(String kill:skills){%>
	 	<option value="<%=kill %>"><%=kill %></option>
	 <%} %>
	 
	 </select>
	 <input type="submit" value="Search Job">
	 
	 </form>
	


</body>
</html>