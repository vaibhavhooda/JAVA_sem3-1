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
	 * @author vaibhavhooda
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      This function is fetching marks from the post request and then it is 
	 *      performing some calculations on the marks & then redirecting to the CalculateAvg
	 *      file. 
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

		// Calculating sum of all marks
		int sum = mScore + eScore + hScore + pScore + cScore;
		
		// Calculating maximum marks
		int max = 0;
		if( mScore > max )
		{
			max = mScore;
		}
		if( eScore > max )
		{
			max = eScore;
		}
		if( hScore > max )
		{
			max = hScore;
		}
		if( pScore > max )
		{
			max = pScore;
		}
		if( cScore > max )
		{
			max = cScore;
		}
		
		//Calculating minimum marks
		int min = Integer.MAX_VALUE;
		if( mScore < min )
		{
			min = mScore;
		}
		if( eScore < min )
		{
			min = eScore;
		}
		if( hScore < min )
		{
			min = hScore;
		}
		if( pScore < min )
		{
			min = pScore;
		}
		if( cScore < min )
		{
			min = cScore;
		}
		

		response.sendRedirect("CalculateAvg?sum=" + sum + "&max=" + max + "&min=" + min);
	}

}
