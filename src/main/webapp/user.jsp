<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
    <meta charset="utf-8">
    <meta name="viewport" content="width-device-width, inital-scale=1">
    <head>
      <style>
        #admin1,li{
          float: left;
        }
        ul,a{
          float: left;
          font-style: normal;
          font-variant: small-caps;
          text-decoration: none;
          text-decoration-line: none;
        }
      </style>
        
    </head>
    <body>
      <div class="main-header">
        <div class="container">
          <h1 class="lead text-center">
            Welcome to Library Management System!   User
          </h1>
        </div>
      </div id="admin1">
      <ul type="none">
            <li>
              <a href="searchBook.jsp">Search Books</a>
            </li>
            <li>
              <a href="showBook.jsp">View Books</a>
            </li>
            <li>
              <a href="/admin/addadmin">Add Supplier Details</a>
            </li>
            <li>
              <a href="/querybooks"> Add Book Issue Details</a>
            </li>
            <li>
              <a href="/borrowbook">Add Fine Details</a>
            </li>
            <li>
              <a href="/returnbook">Add User</a>
            </li>
            <li>
              <a href="">View Fine History</a>
            </li>
        </ul>
        </nav>
        </div>
      </header>
      
      
    </body>
</html>
