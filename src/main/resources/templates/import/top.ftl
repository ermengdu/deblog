<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="./img/bitbug_favicon.ico" type="image/x-icon">
    <link rel="icon" href="./img/bitbug_favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/css/zui.min.css">
    <script src="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/lib/jquery/jquery.js"></script>
    <script src="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/js/zui.min.js"></script>
    <title>deblog</title>
</head>
<body>

<div class="container"/>
<nav class="navbar" role="navigation">
    <div class="container-fluid">
        <!-- 导航头部 -->
        <div class="navbar-header">
            <!-- 移动设备上的导航切换按钮 -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-example">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!-- 品牌名称或logo -->
            <a class="navbar-brand" href="your/nice/url">首页</a>
        </div>
        <!-- 导航项目 -->
        <div class="collapse navbar-collapse navbar-collapse-example">
            <!-- 一般导航项目 -->
            <ul class="nav navbar-nav">
                <li class="active"><a href="/deblog/index">基础数据</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">用户管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/deblog/user/list">用户列表</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">文章管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/deblog/article/list">文章列表</a></li>
                    </ul>
                </li>
                <li class="active"><a href="/deblog/link">友情链接</a></li>
                <li class="active"><a href="/deblog/ad">广告管理</a></li>
            </ul>
        </div><!-- END .navbar-collapse -->
    </div>
</nav>
