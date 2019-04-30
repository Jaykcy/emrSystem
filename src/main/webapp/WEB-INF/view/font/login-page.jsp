<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>员工登录系统</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/now-ui-kit.css?v=1.1.0" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="assets/css/demo.css" rel="stylesheet" />
    <!-- Canonical SEO -->
    <link rel="canonical" href="" />
    <!--  Social tags      -->
    <meta name="keywords" content="">
    <meta name="description" content="">
    <style type="text/css">
			.code {
				font-family: Arial;
				font-style: italic;
				font-weight: bold;
				border: 0;
				letter-spacing: 3px;
				color: blue;
			}
		</style>
	<script type="text/javascript" src="static/js/checkCode.js"></script>
	<script src="static/bootstrap/js/jquery.js"></script>
    
</head>

<body class="login-page sidebar-collapse">
    <!-- Navbar -->
    
    <!-- End Navbar -->
    <div class="page-header" filter-color="orange">
        <div class="page-header-image" style="background-image:url(assets/img/login.jpg)"></div>
        <div class="container">
            <div class="col-md-4 content-center">
                <div class="card card-login card-plain">
                    <form class="form" method="" action="">
                        <div class="header header-primary text-center">
                            <div class="logo-container">
                                <img src="assets/img/now-logo.png" alt="">
                            </div>
                        </div>
                        <div class="content">
                            <div class="input-group form-group-no-border input-lg">
                                <span class="input-group-addon">
                                    <i class="now-ui-icons users_circle-08"></i>
                                </span>
                                <input type="text" class="form-control" name="username" placeholder="用户名"><span id="trueCode"></span>
                            </div>
                            <div class="input-group form-group-no-border input-lg">
                                <span class="input-group-addon">
                                    <i class="now-ui-icons text_caps-small"></i>
                                </span>
                                <input type="text" name="password" placeholder="密码" class="form-control" />
                            </div>
                        </div>
						<div class="content">
						<select class="form-control" name="role">
							<option value="" selected style="background-color:#F5F5F5; color:Black">请选择角色</option>
							<option style="background-color:#F5F5F5; color:Black">医生</option>
							<option style="background-color:#F5F5F5; color:Black">护士</option>
  							<option style="background-color:#F5F5F5; color:Black">管理员</option>
						</select>
						</div>
						<div class="content">&nbsp;</div>
						<div class="content">&nbsp;</div>
						<div class="content">&nbsp;</div>
						<div class="input-group form-group-no-border input-lg">
                                <input type="text" id="input" placeholder="验证码" name="checkcode"  /> <input type="button"
								id="checkCode" class="code" onclick="createCode()" /> <a
								href="#" onclick="createCode()">看不清楚</a><br> <input
								type="button" value="验证" onclick="validate()" />
                        </div>
						<div class="footer text-center">
                            <a href="javascript:;" id="submit" class="btn btn-primary btn-round btn-lg btn-block">Get Started</a>
                        </div>
                        
                        
                    </form>
                </div>
            </div>
        </div>
        
    </div>
</body>
<script>
$("#submit").click(function(){
	  var formStr=$("form").serialize();
	  params = decodeURIComponent(formStr,true);
	  alert(params);
	  console.log(params);
	  $.ajax({
          'type':'post',
          'url':'/login',
          'data':formStr,
          success:function(msg){
              alert(msg);
          }
      })
	});
</script>
<!--   Core JS Files   -->
<script src="assets/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="assets/js/plugins/bootstrap-switch.js"></script>
<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
<script src="assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
<!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->
<script src="assets/js/plugins/bootstrap-datepicker.js" type="text/javascript"></script>
<!-- Share Library etc -->
<script src="assets/js/plugins/jquery.sharrre.js" type="text/javascript"></script>
<!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->
<script src="assets/js/now-ui-kit.js?v=1.1.0" type="text/javascript"></script>

</html>