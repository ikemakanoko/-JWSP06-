<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>リクエストテスト</title>
</head>
<body>
	<h1>通常のリンク</h1>
	<a href="result">リンク</a>

	<h1>送信ボタン(get)</h1>
	<form action="result" method="get">
		<input type="submit">
	</form>

	<h1>送信ボタン(post)</h1>
	<form action="result" method="post">
		<input type="submit">
</form>
</body>
</html>