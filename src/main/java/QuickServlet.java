

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QuickServlet
 */
@WebServlet("/QuickServlet")
public class QuickServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuickServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    
	    //session code
	    /*HttpSession session = request.getSession(false);
	    String user = (String) session.getAttribute("username");
	    out.print("Hello "+ user);
	    out.close();*/
	    
	    //cookie code
	    /*Cookie ck[]=request.getCookies();
	    
	    out.print("Hello "+ ck[0].getValue()); //fethcing values from cookie
	    out.close();*/
	          
	    //request code
	    String n=request.getParameter("username");  
	    out.print("Welcome "+n); 
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
