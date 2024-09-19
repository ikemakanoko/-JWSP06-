<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<title>メンバー登録</title>
 <link rel="stylesheet" href="">

</head>
<body>
<h1>メンバー登録フォーム</h1>
<form action="" method="post">
	<p>お名前：<input type="text" name="name"></p>
	<p>メール：<input type="email" name="email"></p>
	<p>自己紹介<br>
	<textarea name="intro" cols="30" rows="10"></textarea></p>
	<p>お住まい：
	<select name="area">
		<option value="0">東京都内に在住</option>
		<option value="1">東京都以外に在住</option>
		<option value="2">海外に在住</option>
	</select>
	</p>
	<p>メールマガジン:
	<label>
		<input type="radio" name="magazine" value="Yes" checked>希望する
	</label>
	<label>
		<input type="radio" name="magazine" value="No">希望しない
	</label>
	</p>
	<p>趣味：
	<label>
		<input type="checkbox" name="hobby" value="0">料理
	</label>
	<label>
		<input type="checkbox" name="hobby" value="1">旅行
	</label>
	<label>
		<input type="checkbox" name="hobby" value="2">スポーツ
	</label>
	</p>
	<p>個人情報の扱い：
		<label>
			<input type="checkbox" name="privacy">同意する
		</label>
	</p>
	<input type="submit">
</form>
</body>
</html>