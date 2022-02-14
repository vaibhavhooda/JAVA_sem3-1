package week5_assignment2;

import java.io.FileReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class ServletCalc
 */

/*
 * Date - 9 Feb
 * Author - Aayush Rishi
 * Description - servlet to read "area" json file and calculate area and forward using requestDispatcher
 */
public class ServletCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalc() {
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
		JSONParser jsonparser = new JSONParser(); // parse the json file calling jsonparser.

        FileReader reader = new FileReader("/Users/aayushrishi/eclipse-workspace/DAV_week5_assignment2/jsonFiles/area.json"); // load the json file.
		
        Object obj = null;
				try {
					obj = jsonparser.parse(reader);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        JSONObject stdJsonObj = (JSONObject) obj;

        // for extracting data..
        
        String base=(String) stdJsonObj.get("Base");
        int iBase = Integer.parseInt(base);
        String height=(String) stdJsonObj.get("Height");
        int iHeight=Integer.parseInt(height);
        String side=(String) stdJsonObj.get("Side");
        int iSide=Integer.parseInt(side);
        
        double tArea = (iBase * iHeight)/2;
        double sArea = iSide * iSide;
        
        String destination = "area.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination); // create a request
																							// dispatcher object to
																							// area.jsp
		request.setAttribute("tArea", tArea);
		request.setAttribute("sArea", sArea);
		requestDispatcher.forward(request, response);
	}

}
