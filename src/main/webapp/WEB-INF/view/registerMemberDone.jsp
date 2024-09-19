<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>メンバー登録完了</title>
</head>
<body>
<h1>登録完了</h1>
<p>以下の内容で登録しました。</p>
<table border="1">
	<tr>
		<th>お名前</th>
		<td>${name}</td>
	</tr>
	<tr>
		<th>メール</th>
		<td>${email}</td>
	</tr>
	<tr>
		<th>自己紹介</th>
		<td>${intro}</td>
	</tr>
	<tr>
		<th>お住まい</th>
		<td>${area}</td>
	</tr>
	<tr>
		<th>メールマガジン配信希望</th>
		<td>${magazine}</td>
	</tr>
	<tr>
		<th>趣味</th>
		<td>${hobby}</td>
	</tr>
</table>
<p>${message}</p>
<p><a href="">戻る</a>
</body>
</html>