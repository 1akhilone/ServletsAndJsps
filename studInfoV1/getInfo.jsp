<!doctype html>
<html>
	<head>
	</head>
	<body>
		<%@page import="java.util.*" %>
		
		
		<%
			String rollNumber = request.getParameter("rollNo");
			StringTokenizer strTok = new StringTokenizer(rollNumber,"-");
		
			int[] tokenarr = new int[4];
			int i=0;
			
			String dept = "";
			
			while(strTok.hasMoreTokens()){
				tokenarr[i] = Integer.parseInt(strTok.nextToken());
				i++;
			}
			
			switch(tokenarr[2]){
				case 737: dept="IT";
						  break;
				case 736: dept="ME";
						  break;
				case 735: dept="CSE";
						  break;
				default: dept="Enter Correct Roll Number";
			}
		%>
		<h1> Your Department is <%= dept %> </h1>
	</body>
</html>