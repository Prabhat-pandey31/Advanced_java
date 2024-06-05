package Backend;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
	
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.print("i am in doget() method in server");
	System.out.println("i am in doget() method");
}
}
