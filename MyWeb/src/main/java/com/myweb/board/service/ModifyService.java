package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class ModifyService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletRequest response) {
		int bId = Integer.parseInt(request.getParameter("bId"));
        BoardVO vo = BoardDAO.getInstance().contentBoard(bId);
        request.setAttribute("article", vo);
		
		
		
	}

}
