package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/itemDetail")
public class ItemDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] details = {
			"りんご: 青森県産。300円",
			"みかん: 和歌山県産。480円",
			"ぶどう: 山梨県産。680円"
	};
	
		String stringId = request.getParameter("id");
		int id = Integer.parseInt(stringId);
		
		request.setAttribute("detail", details[id]);
		
		request.getRequestDispatcher("/WEB-INF/view/itemDetail.jsp")
		.forward(request, response);
	}

}
