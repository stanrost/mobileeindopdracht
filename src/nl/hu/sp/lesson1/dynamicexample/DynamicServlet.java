package nl.hu.sp.lesson1.dynamicexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class DynamicServlet extends HttpServlet { 
 
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        

        resp.setContentType("text/plain");
        String s = req.getParameter("date");
        
        PrintWriter out = resp.getWriter(); 
		 resp.setContentType("text/html"); 
		 
		 

		 out.println("hoi"); 
				 
				 
	}


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		 resp.setContentType("text/plain");
	        String s = req.getParameter("date");
	        
	        PrintWriter out = resp.getWriter(); 
			 resp.setContentType("text/html"); 
			 
			 

			 out.println("hoi"); 
					 
					 
	}
}