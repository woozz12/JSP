<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p>
		요청 처리 과정에서 에러가 발생했습니다. <br>
		빠른 시간 내에 문제를 해결하겠습니다. <br>
		잠시만 기다려 주세요.
	</p>
	
	<p>
		에러 원인: <%=exception.getMessage() %>
	</p>
	
	




</body>
</html>