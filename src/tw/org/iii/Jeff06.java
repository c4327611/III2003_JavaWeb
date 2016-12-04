package tw.org.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jeff06")
public class Jeff06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");	
		
		PrintWriter out = response.getWriter();
		
		String type = request.getContentType();
		int len = request.getContentLength();
		out.println(type+':'+len);
		
//		BufferedReader reader = request.getReader();
//		String line;int i= 1;
//		while ((line = reader.readLine())!=null){
//			out.print(i++ + ">" +line +"BR>");
//		}
//		reader.close();
		
		InputStream in = request.getInputStream();
		byte[] buf = new byte[len];
		in.read();
		in.close();
	
		String cont = new String(buf);
		out.println(cont);
	}
	private String getFilename(String body){
		int start = body.indexOf("filename=\"");
		String temp = body.substring(start+10);
		String filename = temp.substring(0, temp.indexOf("\""));
		return filename;
	}

}
