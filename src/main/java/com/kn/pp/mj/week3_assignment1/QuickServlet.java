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
Description - This is the servlet which helps to send the session, cookie and username (via Request dispatcher) to the details page
	where ask the user to enter there name and marks of 5 subjects to provide the average of 5 subjects to the user and Grade Scheme.
*/
@WebServlet("/QuickServlet")
public class QuickServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 * This is constructor for the QuickServlet class.
	 */
	public QuickServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      This function is used to post data of session and cookie on the details page 
	 *      where the user enters there name and marks of 5 subjects to provide the average of 5 subjects to the user and Grade Scheme.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			String user = null;
			String sessionName = null;
			String cookieName = null;
			
			// fetching session and set it in a variable
			HttpSession session = request.getSession(false);
			sessionName = (String) session.getAttribute("username");
			
			// fetching cookie and set it in a variable
			Cookie ck[] = request.getCookies();
			cookieName = ck[0].getValue();

			user = request.getParameter("username");

			String destination = "details.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination); // create a request dispatcher object to details.jsp 
			request.setAttribute("name", user);
			request.setAttribute("sname", sessionName);
			request.setAttribute("cname", cookieName);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
