package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Jeff32")
public class Jeff32 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
	private MyCart myCart;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		out=response.getWriter();
		
		out.println("Jefff32");
		
		int Lottery =(int)(Math.random()*49+1);
		out.print("Lottery"+Lottery);
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		session.setAttribute("name", "JEFF");
		session.setAttribute("lottery", Lottery);
		
		myCart = new MyCart("JEFF");
		session.setAttribute("cart", myCart);
		
		out.print("<a href='Jeff33'>GoTo Jeff33</a>");
		
	}

}
