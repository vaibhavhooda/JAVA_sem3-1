package com.kn.pp.mj.week3_assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Calculate
 */

/*
 * Date - 27 Jan Author - Aayush Rishi Description - servlet to calculate Sum
 * and forward using sendRedirect
 */

@WebServlet("/Calculate")
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculate() {
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

		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		int mScore = Integer.parseInt(request.getParameter("maths"));
		int eScore = Integer.parseInt(request.getParameter("english"));
		int hScore = Integer.parseInt(request.getParameter("hindi"));
		int pScore = Integer.parseInt(request.getParameter("physics"));
		int cScore = Integer.parseInt(request.getParameter("chemistry"));

		int sum = mScore + eScore + hScore + pScore + cScore;

		response.sendRedirect("CalculateAvg?sum=" + sum);

		doGet(request, response);
	}

}
