package com.siggy.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	// 1. board 리스트 보는 화면 = board.jsp
	@Autowired
	private BoardService service;

	@GetMapping("/board")
	public String board(Model model) {
		// 데이터 붙이기 하고자 합니다
		model.addAttribute("name", "1234"); // name value

		// service에서 메소드 불러오겠습니다
		List<BoardDTO> list = service.boardList();

		// !.list.isEmpty()
		if (list.size() > 1) {
			model.addAttribute("list", list);
			return "board";
		} else {
			return "redirect:/";
		}

	}

	/*
	 * for (int i = 0; i < bno.length(); i++) {
	 * System.out.println(Character.isDigit(bno.charAt(i))); }
	 */
	// 2. detail 상세보기 화면 = detail.jsp
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
		String bno = request.getParameter("bno");
		System.out.println(bno);
		try {
			int no = Integer.parseInt(bno);
			System.out.println("숫자");
		} catch (Exception e) {
			System.out.println("숫자 X");
		}

		return "detail";
	}

}
