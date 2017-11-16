<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
	<form action="testAdd.do" method="post">
		<table align="center">
			<tr>
				<td>用户号：</td>
				<td><input type="text" id="name" name="name"/></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>男<input type="radio" id="man" name="sex" value="1" checked="checked"/>女<input type="radio" id="woman" name="sex" value="0"/></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" id="age" name="age"/></td>
			</tr>
			<tr>
				<td>推荐编码</td>
				<td><input type="text" id="age" name="age"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>