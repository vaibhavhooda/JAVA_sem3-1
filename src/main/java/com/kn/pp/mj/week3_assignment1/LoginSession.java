package com.kn.pp.mj.week3_assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* Date - 25 Jan
Author - Aayush Rishi
Description - servlet to verify password and post welcome using session
*/
@WebServlet("/LoginSession")
public class LoginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userN = request.getParameter("username");

		String passW = request.getParameter("password");

		if (passW.equals("rishi")) {

			out.println("<br>Welcome, " + userN);

			HttpSession session = request.getSession();
			session.setAttribute("username", userN);

			out.print("<a href='QuickServlet'> visit </a>");
			out.close();
		} else {
			out.print("Sorry, Username or Password Error!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);

		}

		doGet(request, response);
	}

}
