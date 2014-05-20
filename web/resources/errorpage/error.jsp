<h1 style="color: red; text-align: center;">Server is busy!</h1>

<%@ page isErrorPage="true" import="java.io.*" contentType="text/plain"%>

Message:
<%=exception.getMessage()%>

StackTrace:
<%
	StringWriter stringWriter = new StringWriter();
	PrintWriter printWriter = new PrintWriter(stringWriter);
	exception.printStackTrace(printWriter);
	out.println(stringWriter);
	printWriter.close();
	stringWriter.close();
%>

