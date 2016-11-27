package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class jeff02
 */
@WebServlet("/jeff03")
public class jeff03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public jeff03() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	//re
	int x,y,op,result;
	int remainder=0; //餘數初始設定為0
	try{
		x = Integer.parseInt(request.getParameter("x"));
		op = Integer.parseInt(request.getParameter("op"));
		y = Integer.parseInt(request.getParameter("y"));
	}catch (Exception ne){
		x=0;y=0;op=1;
	}
	switch(op){
	default:
	case 1 : result = x + y;break;
	case 2 : result = x - y;break;
	case 3 : result = x * y;break;
	case 4 : result = x / y;remainder=x%y;break;
	}
	
	//out
	PrintWriter out = response.getWriter();
	response.setContentType("text/html;charset=UTF-8");
	out.println("<form>");
	out.println("<input type='text' name='x' value='"+x+"' />  ");
	out.println("<select name='op'>");
	out.println("<option value=1>+</option>");
	out.println("<option value=2>-</option>");
	out.println("<option value=3>x</option>");
	out.println("<option value=4>/</option>");
	out.println("<select>");
	out.println("<input type='text' name='y' value='"+y+"' />");
	out.println("<input type='submit' value='=' />");
	if(remainder!=0){
	out.print("<span>"+result+"......"+remainder+"</span>");
	}else{out.print("<span>"+result+"</span>");
	}
	out.println("</form>");
	out.flush();
	out.close();
}
}
	
	

	
	
