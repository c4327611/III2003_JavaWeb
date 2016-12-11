package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Jeff33")
public class Jeff33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
	
	private MyCart myCart;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		out=response.getWriter();
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		Integer Lottery = (Integer)session.getAttribute("lottery");
		myCart = (MyCart)session.getAttribute("cart");
		if (name != null){
			response.sendRedirect("Jeff32");
			return;
		}
		
		out.println("Jefff33");
		out.print(name + ":" + Lottery + "<br>");
		out.println("<a href='Jeff35'>Logout</a>");
		
		
		myCart.addItem("apple", 10);
		myCart.addItem("pen", 20);
		
	}

}
