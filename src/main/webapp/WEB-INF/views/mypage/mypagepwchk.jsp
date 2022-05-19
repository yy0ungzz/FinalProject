<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:import url="/WEB-INF/views/layout/header.jsp" />
<c:import url="/WEB-INF/views/layout/mypageheader.jsp" />

<style>

input {
	border: 2px solid #DDD;
	text-align: center;
	border-radius: 5px;
}

button {

	border-radius: 5px;
	background-color : #183F7B;
	color: #fff; 
	width: 63px;
	height: 28px;
	border: 0px solid #538fd9;
	font-size: 15px;
	font-weight: bold;

}

p {

	text-align: center;
	margin-bottom: 70px;
}

.pwform {

	text-align: center;
}

.all {

    border: 3px solid #183F7B;
    width: 549px;
    height: 308px;
    border-radius: 15px;
    padding-top: 42px;
    margin: 0 auto;
    margin-top: 13%;

}


</style>




<!-- <div class="container"> -->
<div class="right">
	<div class="all">
	<p style="font-size: 17px; font-weight: bold;">개인정보 확인 및 수정을 위한 비밀번호 확인이 필요합니다.</p>
	
	<div class="pwform">
	<form action="/mypage/mypagepwchk" method="post">
	<div>
		<div style="display: inline; margin-right: 20px;">
			<label for="pw" style="margin-bottom: 20px; font-size: 18px; font-weight: bold; ">비밀번호</label>
		</div>
		<div style="display: inline;">
			<input type="password" name="pw" id="pw" style="height: 30px;" placeholder="비밀번호를 입력해주세요"/>
		</div>
	</div>
	
<br><br><br>
<div style="text-align: center; ">
<button>확인</button>
</div>
</form>
</div> <!-- .pwform -->
</div><!-- .all -->
</div><!-- right -->
</div><!-- .container end -->

<br><br><br><br><br><br>
<c:import url="/WEB-INF/views/layout/footer.jsp" />