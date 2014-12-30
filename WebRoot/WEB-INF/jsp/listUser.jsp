<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>用户列表</title>
<script type="text/javascript">
function edit(Id)
{
	location.href="login_edit.do?id=" + Id;
}
</script>
</head>
	<body>
		<div style="width: 40%; padding: 30px 0;margin: 0px auto;">
			<div>
			<table class="table"  id="search">
				<tr>
					<td width="15%">
						<input type="button" value="添加" onclick="add()" />
					</td>
				</tr>
			</table>
			<br>
		 	</div>
			<table border="1">
				<tr>
					<th width="15%" align="center">用户名</th>
					<th width="15%" align="center">密码</th>
					<th width="15%" align="center">邮箱</th>
					<th width="15%" align="center">操作</th>
				</tr>
				<c:forEach items="${list}" var="user" begin="0" end="10">
					<tr>
						<td align="center">
							${user.username}
						</td>
						<td align="center">
							${user.password}
						</td>
						<td align="center">
							${user.email}
						</td>
						<td align="center">
							<input type="button" value="修改" onclick="edit(${user.id})">
							<input type="button" value="删除" >
						</td>
					</tr>
				</c:forEach>
			</table>		 	
		</div>
	</body>
</html>
