<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>testRedirect1</title>

  </head>
  
  <body>
	<s:form action="loginAction">
		<s:textfield name="username" label="用户名"/>  
        <s:password name="password" label="密码"/>  
        <s:submit value="sign  in" />  
        <s:submit action="" value="Cancel" onclick=""/>  
            
    </s:form>
  </body>
</html>
