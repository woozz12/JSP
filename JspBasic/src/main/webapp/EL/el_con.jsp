<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
  <%--   <%
    	String name = request.getParameter("name");
    	String nick = request.getParameter("nick");
    %>
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%-- <p>
	# �̸�: <%=name %> <br>
	# ����: <%=nick %>
	
</p> --%>
	
	<p>
		# �̸�: ${param.name } <br>
		# ����: ${param.nick }
	</p>
	
	<%
		session.setAttribute("data1", "hello!");
		application.setAttribute("data2", "bye");
		session.setAttribute("data2", "�̸��� ������ �ٸ� ������");
	%>

	<a href="el_result.jsp">����, ���ø����̼� �����͸� ȭ�鿡 ����ϱ�</a>

</body>
</html>