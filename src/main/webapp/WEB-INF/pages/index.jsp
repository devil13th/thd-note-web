<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>1234</title>
<link rel='stylesheet'  href="<%=request.getContextPath() %>/webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>

<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath() %>/webjars/jquery/3.3.1-1/jquery.min.js"></script>

<script>
function test01(){
	var url = "http://127.0.0.1:8080/thd-note-web/rest/t01?username=devil13th&password=123456"
	//var url = "http://127.0.0.1:8080/thd-note-web/rest/t02?username=devil13th&password=123456"
	fetch(url,{
		method:"GET",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/x-www-form-urlencoded', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}


function test03a(){
	var url = "http://127.0.0.1:8080/thd-note-web/rest/t03?username=devil13th&password=123456"
	//var url = "http://127.0.0.1:8080/thd-note-web/rest/t02?username=devil13th&password=123456"
	fetch(url,{
		method:"GET",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/x-www-form-urlencoded', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}


function test03b(){
	var url = "http://127.0.0.1:8080/thd-note-web/rest/t03"
	//var url = "http://127.0.0.1:8080/thd-note-web/rest/t02?username=devil13th&password=123456"
	fetch(url,{
		method:"POST",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/x-www-form-urlencoded', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	    body:"username=devil13th&password=123456"
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}

function test04(){
	var url = "http://127.0.0.1:8080/thd-note-web/rest/t04/devil13th/123456"
	//var url = "http://127.0.0.1:8080/thd-note-web/rest/t02?username=devil13th&password=123456"
	fetch(url,{
		method:"GET",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/x-www-form-urlencoded', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}

function test05(){
	var param = {
		username:"devil13th",
		password:"123456"
	}
	
	var url = "http://127.0.0.1:8080/thd-note-web/rest/t05"
	fetch(url,{
		method:"POST",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/json', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	    body:JSON.stringify(param)
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}



function postData(){
	
	var param = {
		a:1,
		b:2,
		c:3
	}
	
	fetch("http://127.0.0.1:8080/thd-note-web/note/queryNote?x=2",{
		method:"POST",
		headers: new Headers({
		  'Accept': 'application/json', // 通过头指定，获取的数据类型是JSON
	      'Content-Type': 'application/x-www-form-urlencoded', // 指定提交方式为表单提交
	      'customData':"devil13th"
	    }),
	    body:'name=admin&passwor=admin123&a=5'
	    //body:JSON.stringify(param)
	}).then(function(res){
		console.log(res);
		return res.text()
	}).then(function(res){
		console.log(res);
		//alert(res)
	})
}


</script>
</head>
<body>
<div id="a">[${name}]</div>
<button onclick="test01()">test01</button>
<button onclick="test03a()">test03a</button>
<button onclick="test03b()">test03b</button>
<button onclick="test04()">test04</button>

<button onclick="test05()">test05</button>


<button onclick="getData()">getData</button>

<button onclick="postData()">postData</button>

<form method="post" action="http://127.0.0.1:8080/thd-note-web/note/queryNote">
<input type="text" name="a"/><br/>
<input type="text" name="b"/><br/>
<input type="submit" value="smt"/>
</form>
</body>
</html>