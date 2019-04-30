<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="static/layui/css/layui.css" media="all">
<script src="static/layui/layui.js"></script>
<script src="static/layui/layui.all.js"></script>
<script src="static/bootstrap/js/jquery.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body style="background-image:url(static/img/bg.jpg);background-repeat:no-repeat;" >


	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend align="center">病人就诊信息</legend>
	</fieldset>
	<!-- 
		姓名 性别 年龄 出生日期 
		诊断号
		主诉症状
		临床诊断
		科室
		主治医生
	
	 -->
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">就诊号</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="h_id" id="month"
					lay-verify="title" autocomplete="off" placeholder="自动生成"
					readonly="readonly" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="h_name"
					lay-verify="title" autocomplete="off" placeholder="请输入姓名"
					class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">年龄</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="h_age"
					lay-verify="title" autocomplete="off" placeholder="请输入年龄"
					class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">生日</label>
			<div class="layui-input-inline">
				<input type="text" name="h_birth" id="date" lay-verify="date"
					placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item" pane>
			<label class="layui-form-label">性别</label>
			<div class="layui-input-block">
				<input type="radio" name="h_gender" value="男" title="男"> <input
					type="radio" name="gender" value="女" title="女">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">主诉症状</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" name="h_ask" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">临床诊断</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" name="h_judge" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">就诊科室</label>
			<div class="layui-input-inline">
				<select name="h_dep" lay-verify="required" lay-search="">
					<option value="">直接选择或搜索选择</option>
					<option value="内科">内科</option>
					<option value="外科">外科</option>
					<option value="儿科">儿科</option>
					<option value="妇科">妇科</option>
					<option value="眼科">眼科</option>
					<option value="耳鼻喉科">耳鼻喉科</option>
					<option value="口腔">口腔科</option>
					<option value="皮肤科">皮肤科</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">主治医生</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="h_doctor"
					lay-verify="title" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
	<script>
		var d=new Date();
		var year=d.getFullYear();
		var month=d.getMonth()+1;
		var date=d.getDate();
		var hours=d.getHours();
		var minutes=d.getMinutes();
		var time=year+""+month+""+date+""+hours+""+minutes;
		//页面就诊号自动生成
		var rndnumb = "";
		//产生6位定长的随机数
		for (i = 1; i <= 4; i++) {
			n = Math.floor(Math.random() * 10);
			rndnumb = rndnumb + n;
		}
		document.getElementById("month").value = time+""+rndnumb;

		layui.use('form', function() {
			var form = layui.form;
			//刷新界面 所有元素
			form.render();

		});
		layui.use('laydate', function() {
			var laydate = layui.laydate;
			//执行一个laydate实例
			laydate.render({
				elem : '#date' //指定元素
			});
		});

		//监听提交
		var form=layui.form;
		form.on('submit(demo1)', function(data) {
			var d=data.field;
			console.log(JSON.stringify(d));
			$.ajax({
				url : "/todo/save",
				type : "POST",
				dataType:'json',
				contentType: "application/json; charset=utf-8",
				data : JSON.stringify(d),
				success : function(result) {
				alert(result.msg);
				}
			});
		});
	</script>
</body>
</html>