<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑住户反馈</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>住户反馈管理</span></li>
								<li class="breadcrumb-item active"><span>编辑住户反馈</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">住户反馈信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>反馈编号</label>
										<input id="fankuibianhao" name="fankuibianhao" class="form-control" value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>住户账号</label>
										<input id="zhuhuzhanghao" name="zhuhuzhanghao" class="form-control" placeholder="住户账号">
									</div>
									<div class="form-group col-md-6">
										<label>住户姓名</label>
										<input id="zhuhuxingming" name="zhuhuxingming" class="form-control" placeholder="住户姓名">
									</div>
									<div class="form-group col-md-6">
										<label>联系电话</label>
										<input id="lianxidianhua" name="lianxidianhua" class="form-control" placeholder="联系电话">
									</div>
									<div class="form-group col-md-6">
										<label>附件</label>
										<div>
										<div class="upload">选择文件<input name="file" type="file" class="form-control-file" id="fujianupload"></div>
										<label id="fujianFileName"></label>
										<input name="fujian" id="fujian-input" type="hidden">
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>反馈原因</label>
										<textarea name="fankuiyuanyin" class="form-control" id="fankuiyuanyin" rows="3"></textarea>
									</div>
									<div class="form-group col-md-6">
										<label>反馈时间</label>
										<div id="fankuishijianDate" class="input-append date form_datetime">
											<input id="fankuishijian-input" name="fankuishijian" size="15" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>反馈类型</label>
										<select id="fankuileixingSelect" name="fankuileixing" class="form-control">
												<option value=""></option>
												<option class="fankuileixingOption" value="住户意见">
													住户意见
												</option>
												<option class="fankuileixingOption" value="住户投诉">
													住户投诉
												</option>
												<option class="fankuileixingOption" value="其他">
													其他
												</option>
										</select>	
									</div>	
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "zhuhufankui";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};


			function fankuibianhaoUuid(){
				if($("#fankuibianhao").val() == null || $("#fankuibianhao").val() == "null" || $("#fankuibianhao").val() == ""){
					$("#fankuibianhao").attr("value",Math.round(new Date().getTime()/1000));
				}
			}				

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "zhuhufankui/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
			$('#fujianupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {							
					document.getElementById('fujian-input').setAttribute('value',baseUrl+'file/download?fileName='+data.result.file);
					if(document.getElementById('fujianFileName') != null){
						document.getElementById('fujianFileName').innerHTML = "上传成功!";
					}		
					$("#fujianImg").attr("src",data.result.file);												
				}
			});
		}  

		// 表单提交
		function submit() {
			if(validform() ==true && compare() == true){
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				httpJson("zhuhufankui/"+urlParam,"POST",data,(res)=>{
					if(res.code == 0){
						window.sessionStorage.removeItem('id');
						let flag = true;
						if(flag){
							alert(successMes);
						}
						if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
							window.sessionStorage.removeItem('onlyme');
							window.location.href="${pageContext.request.contextPath}/index.jsp";
						}else{
							window.location.href="list.jsp";
						}
						
					}
				});
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    zhuhuzhanghao: {
					},
				    zhuhuxingming: {
					},
				    lianxidianhua: {
					},
				    fujian: {
					},
				    fankuiyuanyin: {
					},
				    fankuishijian: {
					},
				    fankuileixing: {
					},
				},
				messages: {
					zhuhuzhanghao: {
					},
					zhuhuxingming: {
					},
					lianxidianhua: {
					},
					fujian: {
					},
					fankuiyuanyin: {
					},
					fankuishijian: {
					},
					fankuileixing: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("zhuhufankui/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												//注册表单验证
						$(validform());	
					}
				});
			}else{
				fankuibianhaoUuid();

		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#fankuishijianDate").datetimepicker({ 
				minView: "month",
				autoclose: true,
				format:'yyyy-mm-dd',
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
		}		
		function calculationSE(colName){
			//单列求和接口
			http("zhuhufankui"+colName,"GET",{
				tableName: "zhuhufankui",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){

				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						if(res.data !=null && res.data.zhuhuzhanghao != null && res.data.zhuhuzhanghao != ''){
							$('#zhuhuzhanghao').val(res.data.zhuhuzhanghao)
						}
						if(res.data !=null && res.data.zhuhuxingming != null && res.data.zhuhuxingming != ''){
							$('#zhuhuxingming').val(res.data.zhuhuxingming)
						}
						if(res.data !=null && res.data.lianxidianhua != null && res.data.lianxidianhua != ''){
							$('#lianxidianhua').val(res.data.lianxidianhua)
						}
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#fankuibianhao").val(ruleForm.fankuibianhao);	
			$("#zhuhuzhanghao").val(ruleForm.zhuhuzhanghao);	
			$("#zhuhuxingming").val(ruleForm.zhuhuxingming);	
			$("#lianxidianhua").val(ruleForm.lianxidianhua);	
			$("#fujian-input").val(ruleForm.fujian);
			$("#fujianFileName").html(ruleForm.fujian);
			$("#fankuiyuanyin").val(ruleForm.fankuiyuanyin);
			$("#fankuishijian-input").val(ruleForm.fankuishijian);
			var fankuileixingOptions = document.getElementsByClassName("fankuileixingOption");
			for(var fankuileixingCount = 0; fankuileixingCount < fankuileixingOptions.length;fankuileixingCount++){
				if(fankuileixingOptions[fankuileixingCount].getAttribute('value') == ruleForm.fankuileixing){
					fankuileixingOptions[fankuileixingCount].setAttribute('selected','selected');
				}
			}
		}		
		//图片显示
		function showImg(){
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.fankuibianhao != null && res.data.fankuibianhao != ''){

					$("#fankuibianhao").val(res.data.fankuibianhao);
					}
					if(res.data != null && res.data != '' && res.data.zhuhuzhanghao != null && res.data.zhuhuzhanghao != ''){

					$("#zhuhuzhanghao").val(res.data.zhuhuzhanghao);
					}
					if(res.data != null && res.data != '' && res.data.zhuhuxingming != null && res.data.zhuhuxingming != ''){

					$("#zhuhuxingming").val(res.data.zhuhuxingming);
					}
					if(res.data != null && res.data != '' && res.data.lianxidianhua != null && res.data.lianxidianhua != ''){

					$("#lianxidianhua").val(res.data.lianxidianhua);
					}
					if(res.data != null && res.data != '' && res.data.fujian != null && res.data.fujian != ''){

					$("#fujian-input").val(res.data.fujian);
					$('#fujianFileName').val(res.data.fujian)
					}
					if(res.data != null && res.data != '' && res.data.fankuiyuanyin != null && res.data.fankuiyuanyin != ''){

					$("#fankuiyuanyin").val(res.data.fankuiyuanyin);
					}
					if(res.data != null && res.data != '' && res.data.fankuishijian != null && res.data.fankuishijian != ''){

					$("#fankuishijian-input").val(res.data.fankuishijian);
					$('#fankuishijianFileName').val(res.data.fankuishijian)
					}
					if(res.data != null && res.data != '' && res.data.fankuileixing != null && res.data.fankuileixing != ''){

					var fankuileixingOptions = document.getElementsByClassName("fankuileixingOption");
						for(var fankuileixingCount = 0; fankuileixingCount < fankuileixingOptions.length;fankuileixingCount++){
							if(fankuileixingOptions[fankuileixingCount].getAttribute('value') == res.data.fankuileixing){
								fankuileixingOptions[fankuileixingCount].setAttribute('selected','selected');
							}
						}
					}
				}
			});  
            }
            window.sessionStorage.removeItem('crossTableName');
			window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			readonly();
		});		

		function readonly(){
			if(window.sessionStorage.getItem('role') != '管理员'){
				$('#jifen').attr('readonly','readonly');
				$('#money').attr('readonly','readonly');
			}
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(largerVal<=smallerVal){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
