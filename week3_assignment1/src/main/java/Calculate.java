

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		
		String grade = "a";
		double grade_point = 0.0;
		
		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		int mScore = Integer.parseInt(request.getParameter("maths"));
		int eScore = Integer.parseInt(request.getParameter("english"));
		int hScore = Integer.parseInt(request.getParameter("hindi"));
		int pScore = Integer.parseInt(request.getParameter("physics"));
		int cScore = Integer.parseInt(request.getParameter("chemistry"));
		
		int avg = (mScore + eScore + hScore + pScore + cScore)/5;
		
		if(avg >= 94)
		{
			grade = "A+";
			grade_point = 4.0;
		}
		else if(avg >= 87 && avg <= 93)
		{
			grade = "A";
			grade_point = 3.7;
		}
		else if(avg >= 80 && avg <= 86)
		{
			grade = "A-";
			grade_point = 3.5;
		}
		else if(avg >= 77 && avg <= 79)
		{
			grade = "B+";
			grade_point = 3.2;
		}
		else if(avg >= 73 && avg <= 76)
		{
			grade = "B";
			grade_point = 3.0;
		}
		else if(avg >= 70 && avg <= 72)
		{
			grade = "B-";
			grade_point = 2.7;
		}
		else if(avg >= 67 && avg <= 69)
		{
			grade = "C+";
			grade_point = 2.3;
		}
		else if(avg >= 63 && avg <= 66)
		{
			grade = "C";
			grade_point = 2.0;
		}
		else if(avg >= 60 && avg <= 62)
		{
			grade = "C-";
			grade_point = 1.7;
		}
		else if(avg >= 50 && avg <= 59)
		{
			grade = "D";
			grade_point = 1.0;
		}
		else if(avg >= 0 && avg <= 49)
		{
			grade = "F";
			grade_point = 0.0;
		}

		
		response.sendRedirect("final.jsp?average=<avg>");
        
        /*out.println("Average is: " + avg);
        out.println("<br><br>Your grade is: " + grade);
        out.println("<br><br>Your grade point is: " + grade_point);*/
		
		
		doGet(request, response);
	}

}
