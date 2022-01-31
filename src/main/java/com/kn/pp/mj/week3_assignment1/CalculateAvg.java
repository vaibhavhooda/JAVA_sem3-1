package com.kn.pp.mj.week3_assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Date - 27 Jan
Author - Aayush Rishi
Description - servlet to calculate average, grade, gradepoint and send to jsp
*/

@WebServlet("/CalculateAvg")
public class CalculateAvg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculateAvg() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) This function is calculating the grades on the basis of the
	 *      avg passed, then it sets the request object with the results and send it
	 *      to final.jsp page.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sum = Integer.parseInt(request.getParameter("sum"));
		int max = Integer.parseInt(request.getParameter("max"));
		int min = Integer.parseInt(request.getParameter("min"));

		double avg = 0;
		String grade = "a";
		double grade_point = 0.0;

		avg = sum / 5;

		if (avg >= 94) {
			grade = "A+";
			grade_point = 4.0;
		} else if (avg >= 87 && avg <= 93) {
			grade = "A";
			grade_point = 3.7;
		} else if (avg >= 80 && avg <= 86) {
			grade = "A-";
			grade_point = 3.5;
		} else if (avg >= 77 && avg <= 79) {
			grade = "B+";
			grade_point = 3.2;
		} else if (avg >= 73 && avg <= 76) {
			grade = "B";
			grade_point = 3.0;
		} else if (avg >= 70 && avg <= 72) {
			grade = "B-";
			grade_point = 2.7;
		} else if (avg >= 67 && avg <= 69) {
			grade = "C+";
			grade_point = 2.3;
		} else if (avg >= 63 && avg <= 66) {
			grade = "C";
			grade_point = 2.0;
		} else if (avg >= 60 && avg <= 62) {
			grade = "C-";
			grade_point = 1.7;
		} else if (avg >= 50 && avg <= 59) {
			grade = "D";
			grade_point = 1.0;
		} else if (avg >= 0 && avg <= 49) {
			grade = "F";
			grade_point = 0.0;
		}

		request.setAttribute("avg", avg);
		request.setAttribute("max", max);
		request.setAttribute("min", min);
		request.setAttribute("grade", grade);
		request.setAttribute("grade_point", grade_point);
		RequestDispatcher rd = request.getRequestDispatcher("final.jsp");
		rd.forward(request, response);
	}

}
