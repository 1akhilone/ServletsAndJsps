import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class GetStudInfo extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		String rollNumber = req.getParameter("rollNo");
		
		StudInfo sInfo = new StudInfo(rollNumber);
		String dept = sInfo.getDepartment();
		
		out.println("<html><head></head><body>"+
					"<h2> Your Department is" + dept +"</h2></body></html>");
	}
}