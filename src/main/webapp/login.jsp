<%--
  Created by IntelliJ IDEA.
  User: wejeh
  Date: 2017/5/15
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path=request.getContextPath();
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<!-- Head -->
<head>

    <title>LDAP管理系统</title>

    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="Techno Login Form Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Meta-Tags -->

    <!-- Custom-Style-Sheet -->
    <!-- Index-Page-CSS --> <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
    <!-- //Custom-Style-Sheet -->

    <!-- Fonts -->
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" type="text/css" media="all">
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Montserrat:400,700"			   type="text/css" media="all">
    <!-- //Fonts -->
    <script src="jQuery/jquery-3.2.0.min.js"></script>
    <script language="javascript">
        function login(loginform){//传入表单数
            /*
            if(loginform.username.value==""){//验证用户名是否为空
                alert("请输入用户名！");
                loginform.username.focus();
                return false;
            }
            if(loginform.password.value==""){//验证密码是否为空
                alert("请输入密码！");
                loginform.password.focus();
                return false;
            }
            */
            var param = ""
        }
    </script>
</head>
<!-- //Head -->



<!-- Body -->
<body>
<!--canvas-nest.js 超炫酷的开源插件-->
<script type="text/javascript" count="200" zindex="-2" opacity="0.7" src="<%=request.getContextPath()%>/canvas-nest/canvas-nest.js"></script>
<h1>LDAP登陆</h1>

<div class="containerw3layouts-agileits">

    <div class="w3imageaits">
        <img src="<%=request.getContextPath()%>/images/web.jpg" alt="">
    </div>

    <div class="aitsloginwthree w3layouts agileits">
        <h2>进入LDAP管理系统</h2>
        <form action="ldaplogin.spring" method="post" name="loginform" id="loginform">
            <input type="text" Name="username" placeholder="用户名" required="">
            <input type="password" Name="password" placeholder="密码" required="">
            <ul class="tick w3layouts agileinfo">
                <li>
                    <a href=<c:url value="/goldapconfig" />>初次使用请配置LDAP</a>
                </li>
                <li>
                    <a href="#">忘记密码?</a>
                </li>
            </ul>
            <div class="send-button wthree agileits">
                <input type="submit" value="登陆" id="L_submit">
            </div>
        </form>
    </div>

    <div class="clear"></div>

</div>

<div class="w3lsfooteragileits">
    <p> &copy; 2017 LDAP Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com" target="=_blank">SkyFreecss</a></p>
</div>



</body>
<!-- //Body -->



</html>