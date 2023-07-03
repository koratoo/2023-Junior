<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<style>

	@font-face {
	    font-family: 'HANAMDAUM';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2304-2@1.0/HANAMDAUM.woff2') format('woff2');
	    font-weight: 400;
	    font-style: normal;
	}
	body {
	  height: 800px;
	  margin: 10px;
	  padding: 0;
	  
	}
	.container {
	  display: flex;
	  height: 100%; 
	}
	a {
	  text-decoration-line: none;
	  color:black;
	  width:100%;
	}
	.left-sidemenu {
	  font-family: 'HANAMDAUM';
	  width: 20%;
	  height: 100%; 
	  background-color: #f1f1f1;
	  font-size: 20px;
	}
	ul{
	   list-style:none;
	 }
	 li{
	 	padding : 10px;
	 	
	 }
	 
	 img{
	 	width:100%
	 }
	 a:hover ,li:hover{
	 	cursor:pointer;
	 	background-color: gray;
	 	color:white;
	 }
	 li:hover a {
	  color: white; /* hover 시 링크 색상 */
	}
</style>
</head>
<body>
	<div class="left-sidemenu">
		<img src="../img/logo.jpg" />
		<ul>
			<li>■ 기본정보</li>
			<li><a href="current_member.jsp">■ 직원명부</a></li>
			<li><a href="quit_member.jsp">■ 퇴직자현황</a></li>
			<li>■ 예비인력정보</li>
			
			<li>■ 거래처 정보</li>
			<li>진행 프로젝트 현황</li>
			<li>■ 경력 검색</li>
		</ul>
	</div>
</body>
</html>