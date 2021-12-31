<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.library.connection.*" import ="java.util.List" import ="com.library.test.*" import="java.sql.*" import="com.library.dao.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%BooksDaoImpl book = new BooksDaoImpl();
ResultSet rs = book.showBooks();%>
<th><b>Book</b></th>
<%while(rs.next()) {%>
<table>
<tr>

</tr>
<tr>
<td>Book Name = <%=rs.getString(1)%></td>
<td>  Category = <%=rs.getString(2) %></td>
<td>  Author = <%=rs.getString(3) %></td>
</tr>
</table>
	


<%
}
%>
<a href="user.jsp">User Home</a>




</body>
</html>