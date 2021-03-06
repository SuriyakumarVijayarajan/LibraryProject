package com.library.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.impl.UsersDaoImpl;
import com.library.model.Users;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/index.html")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SignUp() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String user_name=request.getParameter("text");
//		String city=request.getParameter("text1");
//		String password=request.getParameter("text2");
//		Long phone=Long.parseLong(request.getParameter("text3"));
//		String email=request.getParameter("text4");
//		
//		System.out.println(user_name+city+password+phone.toString()+email);
//		
//		Users user=new Users(user_name,city,password,phone,email);
//		UsersDaoImpl userDao=new UsersDaoImpl();
//		userDao.insert(user);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_name=request.getParameter("text");
		String city=request.getParameter("text1");
		String password=request.getParameter("text2");
		Long phone=Long.parseLong(request.getParameter("text3"));
		String email=request.getParameter("text4");
		
		System.out.println(user_name+city+password+phone.toString()+email);
		
		Users user=new Users(user_name,city,password,phone,email);
		UsersDaoImpl userDao=new UsersDaoImpl();
		userDao.insert(user);
		
		
		
		
	}

}
