<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bit Soccer</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>

<h2><a id="2_p" href="#">2. 포지션 종류 보기</a></h2>

<!-->팀아이디로 해당 팀의 포지션별 선수 검색기능 예) </!-->
<h2>팀아이디와 포지션 입력하면 해당팀의 아이디와 포지션에 해당하는 선수를 찾아준다.</h2>
<form id="4_f" action="<%=request.getContextPath()%>/player.do">
팀아이디 <input type="text" name="teamId" /><br>
포지션<input type="text" name="position" />
<input type="hidden" name="action" value="find" />
<input type="hidden" name="page" value="4_find_by_teamid_position" />
<input type="submit" id="btn" value="전송" />
</form>

<!-->5.이름의 성과 키, 팀아이디를 넣고 해당 팀의 선수 정보를 받아오기  </!-->
<h2>이름의 성과 키, 팀아이디를 넣고 해당 팀의 선수 정보를 받아오기</h2>
<form id="5_f" action="<%=request.getContextPath()%>/player.do">
팀아이디 : <input type="text" name="teamId" /><br /> 
키 : <input type="text" name="height" /><br />
성 : <input type="text" name="playerName" /><br />
<input type="hidden" name="action" value="findbyheightnameplayerinfo"/>
<input type="hidden" name="page" value="5_find_by_height_weight_name"/>
<input type="submit" id="btn" value="전송"/>
</form>

</div>

<script>
$('#2_p').click(function(){
	alert('버튼클릭!!');
	location.assign('<%=request.getContextPath()%>/player.do?action=position&page=2_positions');
});

$('#4_f').submit(function(){
	alert('선수검색 결과화면으로 이동');
});

$('#5_f').submit(function(){
	alert('키와 성으로 선수검색 결과화면으로 이동');
});

</script>

</body>
</html>