<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script>
function addItem(){
	let todo = document.getElementById("item");
	let list = document.getElementById("todolist");
	let listitem = document.createElement("li");
	listitem.className
	= "d-flex list-group-item list-group-item-action list-group-item-warning";
	let xbtn = document.createElement("button");
	
	xbtn.className="btn-close	ms-auto";
	
	xbtn.onclick=function(e){
		let pnode = e.target.parentNode;
		list.removeChild(pnode);
	}
	listitem.innerText = todo.value;
	listitem.appendChild(xbtn);
	list.appendChild(listitem);
	
	todo.value="";
	todo.focus();
	
}
</script>

</head>
<body>
	<div class="container bg-warning shadow mx-auto mt-5 p-5 w-75">
		<h2>My ToDo App</h2>
		<hr>
		<div class="input-group">
			<input id="item" class="form-control" type="text"
				placeholder="할일을 입력하세요.">
			<button type="button" class="btn btn-primary" onclick="addItem()">할일추가
			</button>
		</div>
		<hr>
		<ul id="todolist" class="list-group"></ul>
	</div>
</body>
</html>