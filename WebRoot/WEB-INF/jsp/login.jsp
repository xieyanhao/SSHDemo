<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login_getLogin.do" method="post">
		<table style="margin: 0px auto;margin-top:10%;">
			<tbody>
				<tr>
					<td>用户名：</td>
					<td>
						<input name="user.username" type="text" placeholder="用户名">
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td>
						<input name="user.password" type="text" placeholder="密码">
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit"  value="提交"/>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>