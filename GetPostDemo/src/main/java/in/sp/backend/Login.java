package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = (String) request.getParameter("name");
		String mypass = (String) request.getParameter("pass");
		
		if(myemail.equals("prabhat@123") && mypass.equals("prajwal@123")) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
	}

}
