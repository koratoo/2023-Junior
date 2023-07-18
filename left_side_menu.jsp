<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	@font-face {
	    font-family: 'HANAMDAUM';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2304-2@1.0/HANAMDAUM.woff2') format('woff2');
	    font-weight: 400;
	    font-style: normal;
	}
	 .member_container {
	  display: flex;
	  height: 100%; 
	} 
	.left-sidemenu>ul>li>a {
	  text-decoration-line: none;
	  color: black;
	}
	.left-sidemenu {
	  font-family: 'HANAMDAUM';
	  width: 20%;
	  height:1080px;
	  background-color: #f1f1f1;
	  font-size: 30px;
	}
	.left-sidemenu>ul{
	   list-style: none;
	}
	.left-sidemenu>ul>li{
	 	padding: 10px;
	} 
	.left-sidemenu>img{
	 	width: 100%;
	}
	.left-sidemenu>ul>li:hover,
	.left-sidemenu>ul>li:hover a {
		cursor: pointer;
		background-color: gray;
		color: white;
	}
</style>
<body>
	<div class="left-sidemenu">
		<img src="/resources/img/logo.jpg" />
		<ul>
			<li><a href="/member/enroll_member"> ■ 사원등록</a></li>
			<li><a href="/member/current_member">■ 사원목록</a></li>
			<li><a href="/project/project_list">■ 프로젝트 목록</a></li>
			<li><a href="/pm/pm_list">■ 프로젝트 투입현황</a>
			<!-- <li><a href="/exit/exit_member">■ 퇴직자현황</a></li> -->
			<!-- <li>■ 예비인력정보</li> -->
			
			<li><a href="/vendor/vendor_list">■ 거래처 목록</a></li> 
			<li><a href="/code/code_list">■ 코드마스터 목록</a></li> 
			<!-- <li>■ 경력 검색</li> -->
		</ul>
	</div>
</body>
</html>
