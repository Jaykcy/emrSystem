<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="static/bootstrap/js/jquery.js"></script>
<script src="static/bootstrap/js/bootstrap.min.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="static/layui/css/layui.css" media="all">
<script src="static/layui/layui.js"></script>
<script src="static/layui/layui.all.js"></script>

</head>
<body background="static/img/bg2.jpg" opacity:0.5>

	<form action="login.html" align="center" method="post">
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<h3>
			请输入要查询患者的就诊号和姓名 <span class="glyphicon glyphicon-pencil"
				aria-hidden="true"></span>
		</h3>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group"></div>
		<div class="form-group">
			<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
			就诊号：<input type="text" style="width: 300px; height: 50px;" id="i_num">
		</div>
		<div class="form-group">&nbsp;</div>
		<div class="form-group">
			<span class="glyphicon glyphicon-user" aria-hidden="true"></span> 姓
			&nbsp;&nbsp;名：<input type="text" style="width: 300px; height: 50px;"
				id="i_name">
		</div>
		<div>&nbsp;</div>
		<div>
			<button type="button" class="btn btn-primary btn-lg"
				data-toggle="modal" id="select">查询</button>
		</div>
	</form>
	<script type="text/javascript">
		$("#select").click(function() {//给保存按钮绑定点击事件
			var num = $("#i_num").val();//获取就诊号输入框的值
			var name = $("#i_name").val();//获取姓名输入框的值
			if (num == '') {//进行值的判断
				layer.alert('就诊号不能为空！！');
			} else if (name == '') {
				layer.alert('姓名不能为空！！');
			} else {
				selectsomeInfo();
			}
		})
		function selectsomeInfo() {
			layer.load(1, {
				shade : false
			});
			setTimeout(function() {
				layer.closeAll('loading');
			}, 1000);
			$("#num").val(1);
			$('#myModal').modal('show');
		}
	</script>
	<!-- 查询结果模态框 -->
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 align="center" class="modal-title" id="myModalLabel">
						<font color="#FF0000"><span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span><span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span><span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>查询到该患者就诊信息如下<span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span><span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span><span
							class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span></font>
					</h4>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;就诊科室：<span>内科</span></div>  
					<div class="col-xs-6 col-md-4">主治医生：<span>XXX</span></div>
					<div class="col-xs-6 col-md-4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;就诊时间：6567</div>
				</div>
				<hr>
				<div class="modal-body">
					<form class="layui-form" action="">
						<div class="form-group">
							<label for="exampleInputName2">就诊号</label> <input type="text"
								class="form-control" id="num">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">患者姓名</label> <input type="text"
								class="form-control" id="name">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">患者年龄</label> <input type="text"
								class="form-control" id="age">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">就诊时间</label> <input type="text"
								class="form-control" id="date">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">性别</label> <input type="text"
								class="form-control" id="sexs">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">主诉症状</label>
							<textarea class="form-control" rows="3" id="ask"></textarea>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">临床诊断</label>
							<textarea class="form-control" rows="3" id="judge"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-off" aria-hidden="true"></span>
					</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>