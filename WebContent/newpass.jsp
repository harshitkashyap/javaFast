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
        
        <label for="inputEmail" class="sr-only">new password</label><br>
        <input  id="inputEmail" class="form-control" placeholder="password" required autofocus name="pass1"><br>
        <label for="inputPassword" class="sr-only">re-enter password</label><br>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required name="pass2">
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        
        <% if(request.getParameter("nomatch")!=null) {%>
  <h2 class="form-signin-heading">Password did not match</h2>
  
  
  <%} %>
      </form>
      

</body>
</html>