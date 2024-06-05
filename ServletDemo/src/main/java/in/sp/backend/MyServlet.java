package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitform")
public class MyServlet extends HttpServlet {
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String mySearch = request.getParameter("search");
	// response.sendRedirect("https://www.google.com");
	response.sendRedirect("https://www.google.com/search?q=" +mySearch);
	
}
}
