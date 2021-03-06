<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>西安工业大学校医院电子病历系统</title>
<link rel="stylesheet" href="static/layui/css/layui.css">
<script src="static/bootstrap/js/jquery.js"></script>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo"><img src="static/img/logomax.png">  电子病历系统（EMR）</div>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item">当前登录用户：（自动生成）</li>
				<li class="layui-nav-item"><a href="exit.html">安全退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧垂直导航区域-->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item"><a class="" href="javascript:;">电子病历管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-id="1" data-title="新建电子病历"
									data-url="new_medical_history" class="site-demo-active"
									data-type="tabAdd">新建电子病历</a>
							</dd>
							<dd>
								<a href="javascript:;" data-id="2" data-title="修改电子病历"
									data-url="alter_medical_history" class="site-demo-active"
									data-type="tabAdd">修改电子病历</a>
							</dd>
							<dd>
								<a href="javascript:;" data-id="3" data-title="删除电子病历"
									data-url="del_medical_history" class="site-demo-active"
									data-type="tabAdd">删除电子病历</a>
							</dd>
							<dd>
								<a href="javascript:;" data-id="4" data-title="查看电子病历"
									data-url="show_medical_history" class="site-demo-active"
									data-type="tabAdd">查看电子病历</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">药品管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-id="5" data-title="药品查询"
									data-url="show_drug" class="site-demo-active"
									data-type="tabAdd">药品查询</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">系统管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-id="6" data-title="密码修改"
									data-url="alter_password" class="site-demo-active"
									data-type="tabAdd">密码修改</a>
							</dd>
							
							</li>
				</ul>
			</div>
		</div>

		<!--tab标签-->
		<div class="layui-tab" lay-filter="demo" lay-allowclose="true"
			style="margin-left: 200px;">
			<ul class="layui-tab-title"></ul>
			<div class="layui-tab-content" style="height: 1500px; overflow:auto"></div>
			
		</div>

		<div class="layui-footer" style="text-align: center;">
			版权所属
			© Jaykcy 电子病历系统
		</div>
	</div>
	<script src="static/layui/layui.js"></script>
	<script>
	<!--这里是放置js代码区域-->
		layui.use([ 'element', 'layer', 'jquery' ], function() {
			var element = layui.element;
			// var layer = layui.layer;
			var $ = layui.$;
			// 配置tab实践在下面无法获取到菜单元素
			$('.site-demo-active').on(
					'click',
					function() {
						var dataid = $(this);
						//这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
						if ($(".layui-tab-title li[lay-id]").length <= 0) {
							//如果比零小，则直接打开新的tab项
							active
									.tabAdd(dataid.attr("data-url"), dataid
											.attr("data-id"), dataid
											.attr("data-title"));
						} else {
							//否则判断该tab项是否以及存在
							var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
							$.each($(".layui-tab-title li[lay-id]"),
									function() {
										//如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
										if ($(this).attr("lay-id") == dataid
												.attr("data-id")) {
											isData = true;
										}
									})
							if (isData == false) {
								//标志为false 新增一个tab项
								active.tabAdd(dataid.attr("data-url"), dataid
										.attr("data-id"), dataid
										.attr("data-title"));
							}
						}
						//最后不管是否新增tab，最后都转到要打开的选项页面上
						active.tabChange(dataid.attr("data-id"));
					});

			var active = {
				//在这里给active绑定几项事件，后面可通过active调用这些事件
				tabAdd : function(url, id, name) {
					//新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
					//关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
					element.tabAdd('demo', {
						title : name,
						content : '<iframe data-frameid="' + id
								+ '" scrolling="auto" frameborder="0" src="'
								+ url
								+ '" style="width:100%;height:99%;"></iframe>',
						id : id
					//规定好的id
					})
					FrameWH(); //计算ifram层的大小
				},
				tabChange : function(id) {
					//切换到指定Tab项
					element.tabChange('demo', id); //根据传入的id传入到指定的tab项
				},
				tabDelete : function(id) {
					element.tabDelete("demo", id);//删除
				}
			};
			function FrameWH() {
				var h = $(window).height();
				$("iframe").css("height", 10000 + "px");
			}
		});
	</script>
</body>
</html>