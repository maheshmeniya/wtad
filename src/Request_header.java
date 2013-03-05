
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.util.*;

/**
* Servlet Showing Request Headers of user request
* Showing usage of getHeaderNames() of HttpServletRequest class	
* @author Your Name
* @version 1.0   -- not require 
*/
public final class Request_header extends HttpServlet
{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Servlet Showing Request Headers of user request";
		out.printn("<HTML><HEAD><TITLE>" + title + "</TITLE></HEAD>");
		out.println("<BODY BGCOLOR=\"#FDF5E6\"><H1 ALIGN=\"CENTER\">" + title + "</H1>");
		out.println("<B>Request Method: </B>"+request.getMethod()+"</BR>");
		out.println("<B>Request URI: </B>" + request.getRequestURI() + "</BR>");
		out.println("<B>Request Protocol: </B>"+ request.getProtocol() + "</BR></BR>");
		out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">");
		out.println("<TR BGCOLOR=\"#FFAD00\"><TH>Header Name<TH>Header Value");
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) 
		{
			String headerName = (String)headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE></BODY></HTML>");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}


