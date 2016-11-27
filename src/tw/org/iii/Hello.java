package tw.org.iii;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
//    @Override
//	public void init() throws ServletException {
//		System.out.println("init()");
//		super.init();
//	}
    
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    	System.out.println("service()");
    	
    	try{
    	HttpServletRequest req = (HttpServletRequest)request;
    	String method = req.getMethod();
    	System.out.println(method);
    	}catch(ClassCastException ce){
    		System.out.println(ce.toString());
    	}
    	
    	//super.service(arg0, arg1);
//no.01    	
//    String key1 = request.getParameter("key1");
//    System.out.println("key1"+key1);
//    String key2 = request.getParameter("key2");
//    System.out.println("key2"+key2);

//no.02
    Enumeration<String> ps = request.getParameterNames();
    while(ps.hasMoreElements()){
    	String item = ps.nextElement();
    	String value = request.getParameter(item);
    	System.out.println(item+"=>"+value);}
    }
    

	public Hello() {
        //super();
    	System.out.println("doHello()");
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		//doGet(request, response);
	}

}
