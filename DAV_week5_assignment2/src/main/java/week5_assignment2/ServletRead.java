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
 * Servlet implementation class ServletRead
 */

/*
 * Date - 9 Feb
 * Author - Aayush Rishi
 * Description - servlet to read "student" json file and display data and forward using requestDispatcher
 */
public class ServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRead() {
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
		JSONParser jsonparser = new JSONParser(); // parse the json file calling jsonparser.

		FileReader reader = new FileReader(
				"/Users/aayushrishi/eclipse-workspace/DAV_week5_assignment2/jsonFiles/student.json"); // load the json
																										// file.

		Object obj = null;
		try {
			obj = jsonparser.parse(reader);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject stdJsonObj = (JSONObject) obj;

		// for extracting data..

		String fname = (String) stdJsonObj.get("firstName");
		String lname = (String) stdJsonObj.get("lastName");
		String contact = (String) stdJsonObj.get("Contact");

		JSONArray arrayAddress = (JSONArray) stdJsonObj.get("address");
		for (int i = 0; i < arrayAddress.size(); i++) {
			JSONObject address = (JSONObject) arrayAddress.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("province");

			request.setAttribute("street", street);
			request.setAttribute("city", city);
			request.setAttribute("state", state);
		}

		JSONArray arrayScore = (JSONArray) stdJsonObj.get("scores");
		for (int i = 0; i < arrayScore.size(); i++) {
			JSONObject scores = (JSONObject) arrayScore.get(i);
			String maths = (String) scores.get("Maths");
			String physics = (String) scores.get("Physics");
			String chemistry = (String) scores.get("Chemistry");
			String english = (String) scores.get("English");
			String computer = (String) scores.get("Computer");

			request.setAttribute("mScore", maths);
			request.setAttribute("pScore", physics);
			request.setAttribute("cScore", chemistry);
			request.setAttribute("eScore", english);
			request.setAttribute("comScore", computer);
		}

		String destination = "results.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination); // create a request
																							// dispatcher object to
																							// results.jsp
		request.setAttribute("fName", fname);
		request.setAttribute("lName", lname);
		request.setAttribute("contact", contact);
		requestDispatcher.forward(request, response);
	}

}
