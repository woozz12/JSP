<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% int i = 5; %>

	<p>
		<%= 10 * 4 %> <br> <!-- out.print(10 * 4);  -->
		<%=5.55 + 3 %> <br>
		<%= "�ȳ��ϼ���!" %> <br>
		<%= i %> 
	</p>
	
	<hr>
	
	<!-- 
		el�� �������� Ư�� ���� ǥ���ϱ� ���� ����Դϴ�.
		el�� ���� �����͸� ǥ���� �� ��ũ��Ʋ������ �ۼ��� ������ ����
		el�� ������ �� �� �����ϴ�.
		el�� �����ϴ� ������ jsp ���� ��ü �����Դϴ�. (request, session)
	  -->
	
	
	
	<p>
		${10 * 4 } <br>
		${5.55 + 3 } <br>
		${'�ȳ�' } <br>
		${i}
	
	</p>
	
	
	
</body>
</html>
























































