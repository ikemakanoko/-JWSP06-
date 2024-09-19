<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<title>商品の選択</title>
</head>
<body>
<h1>商品の選択</h1>
<ul>
	<li><a href="itemDetail?id=0">りんご</a></li>
	<li><a href="itemDetail?id=1">みかん</a></li>
	<li><a href="itemDetail?id=2">ぶどう</a></li>
</ul>

<h2>フォームによる選択</h2>
<form action="itemDetail">
	<select name="id">
		<option value="0">りんご</option>
		<option value="1">みかん</option>
		<option value="2">ぶどう</option>
	</select>
	<input type="submit">
</form>
</body>
</html>