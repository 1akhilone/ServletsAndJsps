import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class GreetServlet extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		Date date = new Date();
		out.println("<html>"+
					"<head><title> Greetings...</title></head>"+
					"<body>"+
					"<h1> Welcome..Today is"+
					date + "<h1>"+
					"</body>"+
					"</html>");
	}
}