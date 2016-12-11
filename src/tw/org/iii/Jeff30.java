package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jeff30")
public class Jeff30 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		out=response.getWriter();
		
		out.println("Main Page");
	}

}
