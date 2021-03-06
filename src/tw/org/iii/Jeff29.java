package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Jeff29")
public class Jeff29 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		out=response.getWriter();
		
		// Check Cookie First
		Cookie[] cookies = request.getCookies();
		if (cookies != null){
			HashMap<String,String> mapCookies = new HashMap<>();
			for (Cookie cookie: cookies){
				String name = cookie.getName();
				String value = cookie.getValue();
				mapCookies.put(name, value);
			}
			if (mapCookies.containsKey("account") &&
					mapCookies.containsKey("passwd")){
				String account = mapCookies.get("account");
				String passwd = mapCookies.get("passwd");
				if (account.equals("org") && passwd.equals("321")){
					// forward
					request.getRequestDispatcher("Jeff30")
					.forward(request, response);
					
				}
			}
			
		}

		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		if (account != null){
			String auto = request.getParameter("auto");
			// check account / passowrd
			if (account.equals("iii") && passwd.equals("123")){
				// Login OK
				if (auto != null && auto.equals("true")){
					// addCookie
					Cookie accoutCookie = new Cookie("account", account);
					accoutCookie.setMaxAge(7*24*60*60);
					Cookie passwdCookie = new Cookie("passwd", passwd);
					passwdCookie.setMaxAge(7*24*60*60);
					response.addCookie(accoutCookie);
					response.addCookie(passwdCookie);
				
				}
				// forward
				request.getRequestDispatcher("Jeff30")
				.forward(request, response);
			}
		}
		
		
		outHTML();
		
	}
	private void outHTML(){
		out.print("<form>");
		out.print("Account:<input type='text' name='account'/><br>");
		out.print("Passeord:<input type='text' name='passwd'/><br>");
		out.print("<input type='checkbox' name='auto' value='true'/>Auto<br>");
		out.println("<input type='submit' value='Login'>");
		out.print("</form>");
		
	}

}
