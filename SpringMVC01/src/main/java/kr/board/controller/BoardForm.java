package kr.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;
import kr.board.mapper.BoardMapper;

@Controller	// Controller가 되기 위해 어노테이션으로 명시
public class BoardForm {
	
	@Autowired
	private BoardMapper mapper;
	
	// 게시판 전체조회 기능 - boardList.do
	@RequestMapping("/boardList.do") // 아래 메소드와 url을 연경
	public String boardList(Model model) {
		System.out.println("게시판 전체조회 기능");
		
		ArrayList<Board> list = mapper.boardList();
		
		
		
		// `list`를 "boardList"라는 이름으로 모델에 추가
		model.addAttribute("list",list);
		
		
		// Forward 이동방식
		return "boardList"; // WEB-INF/views/boardList.jsp
	}
	

}
