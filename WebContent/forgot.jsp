<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container" id="focus">

      <form class="form-signin" action="User.zs" style="background:white;">
        <h2 class="form-signin-heading">RESET PASSWORD</h2>
        
        <label for="inputEmail" class="sr-only">Email address</label><br>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus name="vemail"><br>
        
        <label for="inputEmail" class="sr-only">ENTER NAME</label><br>
        <input class="form-control" placeholder="ENTER NAME" required autofocus name="vname"><br>
        
         <label for="inputEmail" class="sr-only">ENTER CITY</label><br>
        <input class="form-control" placeholder="ENTER CITY" required autofocus name="vcity"><br>
        
         <label for="inputEmail" class="sr-only">ENTER CONTACT</label><br>
        <input class="form-control" placeholder="PHONE NUMBER" required autofocus name="vphone"><br>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">CHANGE PASSWORD</button>
      </form>
      
      <% if(request.getParameter("invalid")!=null) {%>
  <h2 class="form-signin-heading">you entered invalid details</h2>
  
  <%} %>
      
      </div>

</body>
</html>