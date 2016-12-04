package tw.org.iii;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jeff12")
public class Jeff12 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		// 0. prepare
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		if (x == null) x = "0";
		if (y == null) y = "0";
		
		// 1. Model
		Jeff13 jeff = new Jeff13();
		String res = jeff.cal(x, y);
		//HashMap<String,String> res2 = jeff.cal(request);
		System.out.println(x + "+" + y + "=" + res);

		// 2. forward => View
		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("res", res);
		request.getRequestDispatcher("Jeff14")
		.forward(request, response);
	}

}
