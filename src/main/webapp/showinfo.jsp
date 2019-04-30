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
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
	<form class="layui-form" action="">
		<div class="layui-form-item">
			<label class="layui-form-label">就诊号</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" id="month"
					lay-verify="title" autocomplete="off" placeholder="自动生成"
					readonly="readonly" class="layui-input">
			</div>
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="title1"
					lay-verify="title" autocomplete="off" placeholder="请输入姓名"
					class="layui-input">
			</div>
			<label class="layui-form-label">年龄</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="title2"
					lay-verify="title" autocomplete="off" placeholder="请输入年龄"
					class="layui-input">
			</div>
			<label class="layui-form-label">生日</label>
			<div class="layui-input-inline">
				<input disabled="disabled"  type="text" name="date" id="date" lay-verify="date"
					placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item" pane>
			<label class="layui-form-label">性别</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男"> <input
					type="radio" name="sex" value="女" title="女">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">主诉症状</label>
			<div class="layui-input-block">
				<textarea disabled="disabled"  placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">临床诊断</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">就诊科室</label>
			<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="">
					<option value="">直接选择或搜索选择</option>
					<option value="1">内科</option>
					<option value="2">外科</option>
					<option value="3">儿科</option>
					<option value="4">妇科</option>
					<option value="5">眼科</option>
					<option value="6">耳鼻喉科</option>
					<option value="7">口腔科</option>
					<option value="8">皮肤科</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">主治医生</label>
			<div class="layui-input-block">
				<input type="text" style="width: 200px;" name="title"
					lay-verify="title" autocomplete="off" class="layui-input">
			</div>
		</div>
	</form>
</body>
</html>