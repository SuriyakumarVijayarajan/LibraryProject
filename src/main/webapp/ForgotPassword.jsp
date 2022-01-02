<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="forgotpass" method="post">
<label for="User Name">User Name</label>
    <input type="text" id = "uname" name="uname" pattern="[A-Za-z]{3,}" required><br><br>
    <label for= "password">Enter New Password</label>
    <input type="password" id="password" name="password" pattern="^(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,16}$" required><br><br>
    <button type="submit">Log In</button>
    </form>
</body>
</html>