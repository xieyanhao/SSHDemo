<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div style="padding: 30px 0;">
			<form action="<%=request.getContextPath()%>/login_update.do" method="post">
				<table>
					<tr>
						<td><span class="">用户名：</span></td>
						<td>
							<input name="user.username" type="text" value="${user.username}" placeholder="用户名">
							<input name="user.id" type="hidden" value="${user.id}">
						</td>
					</tr>
					<tr>
						<td><span class="">密码：</span></td>
						<td>
							<input name="user.password" type="text" value="${user.password}" placeholder="密码">
						</td>
					</tr>
					<tr>
						<td><span class="">email：</span></td>
						<td>
							<input name="user.email" type="text" value="${user.email}" placeholder="邮箱">
						</td>
					</tr>

					<tr>
						<td><input type="submit" value="保存" style="float: right" /></td>
						<td><input type="reset" class="button2" /></td>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html>