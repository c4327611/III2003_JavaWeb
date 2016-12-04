package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/Jeff05")
public class Jeff05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");	
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		out.println(username+"<br>");
		String gender = request.getParameter("gender");
		out.println(gender+"<br>");
		String[] likes = request.getParameterValues("like");
		for (String like:likes){
		out.println(like + "<br>");
		}
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
