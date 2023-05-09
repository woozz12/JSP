package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;

import com.myweb.board.model.BoardDAO;

public class DeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletRequest response) {

		BoardDAO.getInstance().deleteBoard(Integer.parseInt(request.getParameter("bId")));
		
	}

}
