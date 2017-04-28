<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
		var path = "<%=request.getContextPath() %>";
    	function showPage(number){
    		window.location.href=path+"/hsq/city/list.html?pageNo="+number;
		}
		var InterValObj; //timer变量，控制时间 
		var count = 120; //间隔函数，1秒执行  
		var curCount;//当前剩余秒数  
		var code = ""; //验证码
		var codeLength = 6;//验证码长度 
		function send(){
			curCount = count;
			// 产生验证码  
            for ( var i = 0; i < codeLength; i++) {  
                code += parseInt(Math.random() * 9).toString();  
            } 
            // 设置button效果，开始计时  
            $("#btnSendCode").attr("disabled", "true");  
            $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
            InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器，1秒执行一次  
            // 向后台发送处理数据  
            $.ajax({  
                type: "POST", // 用POST方式传输  
                dataType: "JSON", // 数据格式:JSON  
                url: path+"/hsq/city/send.html", // 目标地址  
                data: {"code":code},  
                success: function (data){   
                      
                }  
            });
		}
		//timer处理函数  
		function SetRemainTime() {  
    		if (curCount == 0) {                  
       			window.clearInterval(InterValObj);// 停止计时器  
        		$("#btnSendCode").removeAttr("disabled");// 启用按钮  
        		$("#btnSendCode").val("重新发送验证码");  
        		code = ""; // 清除验证码。如果不清除，过时间后，输入收到的验证码依然有效  
    		}else {  
        		curCount--;  
        		$("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
    	}  
}  
  	</script>
</head>
<body>
	<input onclick="send()" id="btnSendCode" value = "获取验证码"/>
	<input type="text" id = "code" value="">
	<input type="hidden" name="pageNo" id="pageNo" value="">
	<table class="add_content add_cityMerchant">
		<tr>
			<th>账号</th>
			<th>姓名</th>
			<th>公司名称</th>
			<th>类型</th>
		</tr>
		<c:forEach items="${citys}" var="item">
			<tr>
				<td>${item.linkTel}</td>
				<td>${item.linkMan }</td>
				<td>${item.cityMerchantName}</td>
				<td><c:forEach items="${typeNames }" var="name">
                    		${name.dictCodeValue==item.level?name.dictCodeName:"" }
                    	</c:forEach></td>
			</tr>
		</c:forEach>
	</table>
	<jsp:include page="../include/pages_new.jsp"></jsp:include>
</body>
</html>