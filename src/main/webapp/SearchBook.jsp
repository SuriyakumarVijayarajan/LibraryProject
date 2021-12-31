<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.library.connection.*" import ="java.util.List" import ="com.library.test.*" import="java.sql.*" import="com.library.dao.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label >Search By Author Name</label>
<input type="text" name="author">
<label >Search By Category Name</label>
<input type="text" name="category">
<h3>Author is request.getSession().getAttribute("author")</h3>
<%BooksDaoImpl book = new BooksDaoImpl();
SearchBook sOb=new SearchBook();


%>
<th><b>Book</b></th>

<table>
<tr>

</tr>
<tr>
<td>Book Name = <%=%></td>
</tr>
</table>


</body>
</html>