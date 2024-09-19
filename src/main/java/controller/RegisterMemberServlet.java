package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterMemberServlet
 */
@WebServlet("/registerMember")
public class RegisterMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォームの表示
		request.getRequestDispatcher("/WEB-INF/view/registerMember.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//エリア
		String[] areaList = {"東京都", "国内(東京以外)", "海外"};
		
		// 趣味
		String[] hobbyList = {"料理", "旅行", "スポーツ"};
		
		// 文字化け防止
		request.setCharacterEncoding("UTF-8");
		
		// フォームデータの取得
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String intro = request.getParameter("intro");
		int area = Integer.parseInt(request.getParameter("area"));
		String magazine = request.getParameter("magazine");
		String[] hobbies = request.getParameterValues("hobby");
		String privacy = request.getParameter("privacy");
		
		//趣味を一つの文字列データに変換
		String hobby = "";
		if(hobbies != null) {
			for(String hobbyIndex : hobbies) {
				int i = Integer.parseInt(hobbyIndex);
				hobby += hobbyList[i] + " ";
			}
		}
		
		//個人情報の扱いによって、メッセージを分岐
		String message;
		if(privacy == null) {
			message ="個人情報に関わる機能は利用できません";
		}
		else {
			message = "ご登録ありがとうございました";
		}
		
		//データのチェック(バリデーション)
		//データに問題がなければ、データベースに登録
		
		//完了画面に表示させる内容を準備
		request.setAttribute("name", name + "様");
		request.setAttribute("email", email);
		request.setAttribute("intro", replaceToBr(intro));
		request.setAttribute("area", areaList[area]);
		request.setAttribute("magazine", magazine);
		request.setAttribute("hobby", hobby);
		request.setAttribute("message", message);
		
		//完了画面の表示
		request.getRequestDispatcher("/WEB-INF/view/registerMemberDone.jsp")
				.forward(request, response);
	}
	
	//改行文字「Yn」を＜ｂｒ＞に書き換え
	private String replaceToBr(String text) {
		return text.replaceAll("\n", "<br>");
	}
	
	

}
