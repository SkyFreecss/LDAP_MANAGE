<%--
  Created by IntelliJ IDEA.
  User: wejeh
  Date: 2017/5/16
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>LDAP管理系统主页</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--
    OneTel Template
    http://www.templatemo.com/tm-468-onetel
    -->
    <!-- stylesheet css -->
    <link rel="stylesheet" href="home/css/bootstrap.min.css">
    <link rel="stylesheet" href="home/css/font-awesome.min.css">
    <link rel="stylesheet" href="home/css/nivo-lightbox.css">
    <link rel="stylesheet" href="home/css/nivo_themes/default/default.css">
    <link rel="stylesheet" href="home/css/templatemo-style.css">
    <!-- google web font css -->
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>

</head>
<body>

<!-- navigation -->
<script type="text/javascript" count="200" zindex="-2" opacity="0.7" src="<%=request.getContextPath()%>/canvas-nest/canvas-nest.js"></script>
<div class="container">
    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
                <span class="icon icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand"><img src="home/images/logo.png" class="img-responsive" alt="logo"></a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.html" class="active">主页</a></li>
                <li><a href="about.html">关于我们</a></li>
                <li><a href="portfolio.html">文件夹</a></li>
                <li><a href="contact.html">联系</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- home section -->
<div id="home">
    <div class="container">
        <div class="row">
            <div class="col-md-5 col-sm-3"></div>
            <div class="col-md-7 col-sm-9">
                <!--<h3>欢迎使用！</h3>
                <h1>Onetel Design Studio(SkyFreecss modify)</h1>
                -->
            </div>
        </div>
    </div>
</div>

<!-- divider section -->
<div class="divider">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-6">
                <div class="divider-wrapper divider-one">
                    <i class="fa fa-laptop"></i>
                    <h2>密码修改</h2>
                    <p></p>
                </div>
            </div>
            <div class="col-md-4 col-sm-6">
                <div class="divider-wrapper divider-two">
                    <i class="fa fa-mobile"></i>
                    <h2>用户管理</h2>
                    <p></p>
                </div>
            </div>
            <div class="col-md-4 col-sm-12">
                <div class="divider-wrapper divider-three">
                    <i class="fa fa-life-ring"></i>
                    <h2>签到</h2>
                    <p></p>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- about section -->
<div id="about">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-12">
                <img src="home/images/about-img.jpg" class="img-responsive" alt="about img">
            </div>
            <div class="col-md-6 col-sm-12 about-des">
                <h2>什么是LDAP？</h2>
                <p></p>
                <p></p>
                <a href="#" class="btn btn-default">了解更多</a>
            </div>
        </div>
    </div>
</div>

<!-- portfolio section -->
<div id="portfolio">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-2 col-md-8 col-sm-12">
                <h2>其它项目</h2>
                <p></p>
            </div>
        </div>

        <div class="row mt30">

            <div class="col-md-4 col-sm-4 col-xs-6">
                <a href="home/images/portfolio-img1.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img1.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-6">
                <a href="home/images/portfolio-img2.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img2.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-6">
                <a href="home/images/portfolio-img3.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img3.jpg" alt="portfolio img"></a>
            </div>

            <div class="col-md-3 col-sm-6 col-xs-6">
                <a href="home/images/portfolio-img4.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img4.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-3 col-sm-6 col-xs-6">
                <a href="home/images/portfolio-img5.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img5.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-3 col-sm-6 col-xs-6">
                <a href="home/images/portfolio-img6.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img6.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-3 col-sm-6 col-xs-12">
                <a href="home/images/portfolio-img7.jpg" data-lightbox-gallery="portfolio-gallery"><img src="home/images/portfolio-img7.jpg" alt="portfolio img"></a>
            </div>
            <div class="col-md-12 col-sm-12">
                <a rel="nofollow" href="#" class="btn btn-default">查看更多</a>
            </div>
        </div>
    </div>
</div>

<!-- footer section -->
<footer>
    <div class="container">
        <div class="row">

            <div class="col-md-5 col-sm-4">
                <img src="home/images/logo.png" class="img-responsive" alt="logo">
                <p>页面基于 Bootstrap v3.3.5 HTML5 制作
                    <a rel="nofollow" href="#" target="_parent">SkyFreecss</a> 主页.
                </p>
                <p><i class="fa fa-phone"></i>18672980500</p>
                <p><i class="fa fa-envelope-o"></i> weje.h@qq.com</p>
                <p><i class="fa fa-globe"></i>###</p>
            </div>

            <div class="col-md-3 col-sm-4">
                <h3>用户链接</h3>
                <p><a href="#">HTML5</a></p>
                <p><a href="#">CSS3 Tricks</a></p>
                <p><a href="#">博客</a></p>
                <p><a href="#">Animations</a></p>
            </div>

            <div class="col-md-4 col-sm-4 newsletter">
                <h3>新邮件</h3>
                <p></p>
                <div class="input-group">
                    <form action="#" method="post">
                        <input name="email" type="email" placeholder="Enter your email" class="form-control" autorequired>
                        <button type="submit" name="submit" class="btn email">提交</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</footer>

<!-- copyright section -->
<div class="copyright">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <p>Copyright © 2017 SkyFreecss</p>
            </div>
            <!--
            <div class="col-md-6 col-sm-6">
                <ul class="social-icons">
                    <li><a href="#" class="fa fa-facebook"></a></li>
                    <li><a href="#" class="fa fa-twitter"></a></li>
                    <li><a href="#" class="fa fa-dribbble"></a></li>
                    <li><a href="#" class="fa fa-pinterest"></a></li>
                    <li><a href="#" class="fa fa-behance"></a></li>
                    <li><a href="#" class="fa fa-envelope-o"></a></li>
                </ul>
            </div>
            -->
            <!-- JiaThis Button BEGIN -->
            <div class="jiathis_style_32x32">
                <a class="jiathis_button_qzone"></a>
                <a class="jiathis_button_tsina"></a>
                <a class="jiathis_button_tqq"></a>
                <a class="jiathis_button_weixin"></a>
                <a class="jiathis_button_renren"></a>
                <a href="http://www.jiathis.com/share" class="jiathis jiathis_txt jtico jtico_jiathis" target="_blank"></a>
                <a class="jiathis_counter_style"></a>
            </div>
            <script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
            <!-- JiaThis Button END -->
        </div>
    </div>
</div>


<!-- javascript js -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/nivo-lightbox.min.js"></script>
<script src="js/custom.js"></script>

</body>
</html>