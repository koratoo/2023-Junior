<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원화면</title>

<style>
	.main {
	  flex-grow: 1;
	  padding: 20px; /* main 내용을 적절히 여백을 주기 위해 패딩 값을 조정할 수 있습니다. */
	  background-color: white;
	}
	table{
		border-collapse: collapse;
		width:100%;
	}
	
	tr,td,th{
		 padding: 10px;
		 border: 2px solid black;
  		 text-align: center;
	}
	th{
		background-color: darkgray;
	}
	.search{
		 float: right;
		 margin:10px;
	}
	#search_member{
		height: 30px;
		width: 250px;
	}
	select{
		height: 30px;
		width: 80px;
		text-align:center;
	}
</style>
</head>
<body>
<div class="container">
	<%@ include file= "./left_side_menu.jsp"%>
	<div class="main">
		<h2>사원 조회 페이지</h2>
		<div class="search">
			<select name="">
				<option value="전체">전체</option>
			</select>
			<input type="text" id="search_member"/>
		</div>
		<div class="table">
			<table>
				<tr>
					<th>체크</th>
					<th>이름</th>
					<th>주민번호</th>
					<th>성별</th>
					<th>등급</th>
					<th>재직상태</th>
					<th>근무정보</th>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>홍길동</td>
					<td>123456-123456</td>
					<td>남</td>
					<td>중급</td>
					<td>재직중</td>
					<td>근무중</td>
				</tr>
			</table>
		</div>		
	
	</div>
</div>
</body>
</html>