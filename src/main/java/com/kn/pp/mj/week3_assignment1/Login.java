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
Description - It accepts username and password and does validation here in this Servlet and forwards response to another 
			  Servlet (QuickServlet) (Using RequestDispatcher, Sessions and Cookies).
*/

@WebServlet("/Login")
public class Login extends HttpServlet {

	/**
	 * @see HttpServlet#HttpServlet() This is constructor for the login class.
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) This function is executed when the post request is sent from
	 *      the index page for submitting username and password. This function adds
	 *      first validates the password and then stores the username to a Session,
	 *      Cookie and sends data via RequestDispatcher to another Servlet called
	 *      QuickServlet if the validation of password holds true.
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html"); // set response content type

		String userN = request.getParameter("username"); // get username from the request

		String passW = request.getParameter("password"); // get password from the request

		if (passW.equals("rishi")) {

			HttpSession session = request.getSession(); // create a session object
			session.setAttribute("username", userN); // set username to session

			Cookie ck = new Cookie("username", userN); // create cookie object
			response.addCookie(ck); // add value to cookie

			RequestDispatcher rd = request.getRequestDispatcher("QuickServlet"); // create a request dispatcher object
																					// to another servlet
			rd.forward(request, response); // forward the request and response to another servlet
		} else {
			PrintWriter out = response.getWriter(); // create a printwriter object
			out.print("Sorry, Username or Password Error!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);

		}
	}

}
