package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;

import com.myweb.board.model.BoardDAO;

public class RegistService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletRequest response) {

		String writer = request.getParameter("bWriter");
		String title = request.getParameter("btitle");
		String content = request.getParameter("bContent");
		
		BoardDAO.getInstance().regist(writer, title, content);
		
	}

}
