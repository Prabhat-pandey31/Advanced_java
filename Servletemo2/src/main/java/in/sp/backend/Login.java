package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail =request.getParameter("email");
		String mypass =request.getParameter("pass");
		PrintWriter out = response.getWriter();
		
		if(myemail.equals("prabhat@123") && mypass.equals("xyz")) {
			// request.setAttribute("name_key", "prabhat pandey");
			HttpSession session = request.getSession();
			session.setAttribute("name_key","prabhatpandey");
			RequestDispatcher rd =request.getRequestDispatcher("/Profile.jsp");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.print("email id and password didnot match");
			RequestDispatcher rd =request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
