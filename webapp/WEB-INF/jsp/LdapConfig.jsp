<%--
  Created by IntelliJ IDEA.
  User: wejeh
  Date: 2017/5/19
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>LDAP服务器配置</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <!--
    Visual Admin Template
    http://www.templatemo.com/preview/templatemo_455_visual_admin
    -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
    <link href="user_manage/css/font-awesome.min.css" rel="stylesheet">
    <link href="user_manage/css/bootstrap.min.css" rel="stylesheet">
    <link href="user_manage/css/templatemo-style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="light-gray-bg">
<div class="templatemo-content-widget templatemo-login-widget white-bg">
    <header class="text-center">
        <div class="square"></div>
        <img src="user_manage/images/logo.png">
    </header>
    <form action="ldapconfig.spring" class="templatemo-login-form">
        <!--LDAP IP-->
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon">LDAP主机<i></i></div>
                <input type="text" Name="Ldap_IP" class="form-control" placeholder="192.168.0.1">
            </div>
        </div>
        <!--LDAP PORT-->
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon">LDAP端口<i></i></div>
                <input type="text" Name="Ldap_Port" class="form-control" placeholder="389">
            </div>
        </div>
        <!--LDAP DNS-->
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon">LDAP DNS<i></i></div>
                <input type="text" Name="Ldap_Dns" class="form-control" placeholder="dc=example,dc=com">
            </div>
        </div>
        <!--LDAP ADMIN-->
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>
                <input type="text" Name="Ldap_Admin" class="form-control" placeholder="admin">
            </div>
        </div>
        <!--LDAP ADMINPWD-->
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>
                <input type="password" Name="Ldap_Admin_Pwd" class="form-control" placeholder="******">
            </div>
        </div>
        <!--
          <div class="form-group">
            <div class="checkbox squaredTwo">
                <input type="checkbox" id="c1" name="cc" />
                <label for="c1"><span></span>Remember me</label>
            </div>
        </div>
        -->
        <div class="form-group">
            <button type="submit" class="templatemo-blue-button width-100">保存配置</button>
        </div>
    </form>
</div>
<div class="templatemo-content-widget templatemo-login-widget templatemo-register-widget white-bg">
    <p>不知道这是干啥？<strong><a href="#" class="blue-text">查看LDAP配置说明</a></strong></p>
</div>
</body>
</html>
