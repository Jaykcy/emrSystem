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
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
<link rel="stylesheet" href="static/layui/css/layui.css" media="all">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

</head>
<body>
	<div class="row">
		<div class="col-md-8">
			<div class="layui-carousel" id="test10">
				<div carousel-item="">
					<div>
						<img src="static/img/1.jpg">
					</div>
					<div>
						<img src="static/img/2.jpg">
					</div>
					<div>
						<img src="static/img/3.jpg">
					</div>
					<div>
						<img src="static/img/4.jpg">
					</div>
					<div>
						<img src="static/img/5.jpg">
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<a href="login-page" class="btn btn-primary btn-lg active"
				role="button">员工登录</a> <a href="record"
				class="btn btn-success btn-lg active" role="button">就诊记录</a> <a
				href="#" class="btn btn-info btn-lg active" role="button">公
				&nbsp;&nbsp;&nbsp;&nbsp;告</a>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<script src="static/layui/layui.js" charset="utf-8"></script>
	<script>
		layui.use([ 'carousel', 'form' ],
				function() {
					var carousel = layui.carousel, form = layui.form;

					//常规轮播
					carousel.render({
						elem : '#test1',
						arrow : 'always'
					});

					//改变下时间间隔、动画类型、高度
					carousel.render({
						elem : '#test2',
						interval : 300,
						anim : 'fade',
						height : '120px'
					});

					//设定各种参数
					var ins3 = carousel.render({
						elem : '#test3'
					});
					//图片轮播
					carousel.render({
						elem : '#test10',
						width : '1365px',
						height : '600px',
						interval : 3000
					});

					//事件
					carousel.on('change(test4)', function(res) {
						console.log(res)
					});

					var $ = layui.$, active = {
						set : function(othis) {
							var THIS = 'layui-bg-normal', key = othis
									.data('key'), options = {};

							othis.css('background-color', '#5FB878').siblings()
									.removeAttr('style');
							options[key] = othis.data('value');
							ins3.reload(options);
						}
					};

					//监听开关
					form.on('switch(autoplay)', function() {
						ins3.reload({
							autoplay : this.checked
						});
					});

					$('.demoSet').on('keyup', function() {
						var value = this.value, options = {};
						if (!/^\d+$/.test(value))
							return;

						options[this.name] = value;
						ins3.reload(options);
					});

					//其它示例
					$('.demoTest .layui-btn').on('click', function() {
						var othis = $(this), type = othis.data('type');
						active[type] ? active[type].call(this, othis) : '';
					});
				});
	</script>

</body>
</html>