package com.myweb.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletRequest response) {
		
		String category = request.getParameter("category");
		String keyword = request.getParameter("search");
		List<BoardVO> list = BoardDAO.getInstance().searchBoard(keyword, category);
		
		if(list.size() == 0) {
			response.setContentType("text/html; charset=UTF-8");
			 htmlCode = "<script>\r\n"
                     + "                alert('비밀번호가 정상적으로 변경되었습니다.');\r\n"
                     + "                location.href='/MyWeb/myPage.user';\r\n"
                     + "                </script>";
             out.print(htmlCode);
             out.flush();
             return;
		} catch (Exception e) {
		} 
		
		
		request.setAttribute("boardList", list);
		
	}

}
