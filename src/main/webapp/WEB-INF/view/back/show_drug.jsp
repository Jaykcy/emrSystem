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
<script src="static/bootstrap/js/jquery.js"></script>
</head>
<body>
	<div class="searchTable">
		<div class="layui-inline">
			<input class="layui-input" id="dataReload" autocomplete="off">
		</div>
		<button class="layui-btn" data-type="reload">搜索</button>
	</div>
	<table class="layui-hide" id="test" lay-filter="test"></table>

	<script type="text/html" id="barDemo">
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>


	<script src="static/layui/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

	<script>
		layui.use('table', function() {
			var table = layui.table;
			table.render({
				elem : '#test',
				id:'table',
				url : '/selectAllDrug',
				method:"post",
				cellMinWidth : 80 //全局定义常规单元格的最小宽度
				,
				toolbar : '#toolbarDemo',
				title : '用户数据表',
				cols : [ [ {
					type : 'checkbox',
					fixed : 'left'
				}, {
					field : 'drId',
					title : '药品编号',
					width : 180,
					fixed : 'left',
					sort : true
				}, {
					field : 'drName',
					title : '药品名称',
					width : 150,
				}, {
					field : 'drSpec',
					title : '药品规格',
					width : 120,
				}, {
					field : 'drUse',
					title : '用法用量',
					width : 350,
				}, {
					field : 'drBelong',
					title : '所属厂家',
					width : 220
				} ] ],
				page : true
			});
			
			
			$('.searchTable .layui-btn').on('click', function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});
			// 点击获取数据
			
			var active = {
				reload : function() {
					var dataReload = $('#dataReload').val();
					console.log(dataReload);
					var index = layer.msg('查询中，请稍候...', {
						icon : 16,
						time : false,
						shade : 0
					});
					setTimeout(function() {
						table.reload('table', {
							where : {
								'name' : dataReload
							}
						});
						layer.close(index);
					}, 800);

				},
			};

			//头工具栏事件
			table.on('toolbar(test)', function(obj) {
				var checkStatus = table.checkStatus(obj.config.id);
				switch (obj.event) {
				case 'getCheckData':
					var data = checkStatus.data;
					layer.alert(JSON.stringify(data));
					break;
				case 'getCheckLength':
					var data = checkStatus.data;
					layer.msg('选中了：' + data.length + ' 个');
					break;
				case 'isAll':
					layer.msg(checkStatus.isAll ? '全选' : '未全选');
					break;
				}
				;
			});

			//监听行工具事件
			table.on('tool(test)', function(obj) {
				var data = obj.data;
				if (obj.event === 'del') {
					var con;
					con = confirm("确定要删除:" + obj.data.drName + "吗"); //在页面上弹出对话框
					if (con == true)
						//等待补充：发送Ajax请求，删除数据
						alert("删除成功！");
					else
						alert("取消删除!");
					console.log(obj);
				} else if (obj.event === 'edit') {
					layer.prompt({
						formType : 2,
						value : data.email
					}, function(value, index) {
						obj.update({
							email : value
						});
						layer.close(index);
					});
				}
			});
		});
	</script>

</body>
</html>