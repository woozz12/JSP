package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;

import com.myweb.board.model.BoardDAO;

public class UpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletRequest response) {

		int bId = Integer.parseInt(request.getParameter("bId"));
        String bTitle = request.getParameter("bTitle");
        String bContent = request.getParameter("bContent");

        BoardDAO.getInstance().updateBoard(bTitle, bContent, bId);
		
	}

}
