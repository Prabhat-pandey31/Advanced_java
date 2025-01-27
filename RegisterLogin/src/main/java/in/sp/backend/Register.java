package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve form data
		PrintWriter out = resp.getWriter();
         String myname =req.getParameter("name");
         String myemail = req.getParameter("email");
         String mypass = req.getParameter("pass");
         String mygender = req.getParameter("gender");
         String mycity = req.getParameter("city");
         
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/yt_learning", "root", "Welcome@2024");
        	 PreparedStatement ps =con.prepareStatement("insert into register values(?,?,?,?,?)");
        	 ps.setString(1, myname);
        	 ps.setString(2, myemail);
        	 ps.setString(3, mypass);
        	 ps.setString(4, mygender);
        	 ps.setString(5, mycity);
        	 int count = ps.executeUpdate();
        	 
        	 if(count> 0) {
        		 resp.setContentType("text/html");
        		 out.print("<h3 style = 'color:green'> user registered successfully");
        		 RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        		 rd.include(req, resp);
        	 }else {
        		 resp.setContentType("text/html");
        		 out.print("<h3 style = 'color:'> user  not registered due to some error");
        		 RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        		 rd.include(req, resp);
        	 }
        	 
         }catch(Exception e) {
        	 e.printStackTrace();
        	 resp.setContentType("text/html");
    		 out.print("<h3 style = 'color:'>"+e.getMessage() );
    		 RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
    		 rd.include(req, resp);
         }
    }
}

