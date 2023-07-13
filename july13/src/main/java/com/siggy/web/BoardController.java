package com.siggy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	//사용자가 /board 라고 호출하면 동작할 메소드를 만들겠습니다.
	//post로 들어오면 동작 안함
	//post로도 들어오게 하고 싶으면 method삭제 -> value도 지워도됨 -> Request를 GET,POST로 
	
	//@RequestMapping(value = "/board", method = RequestMethod.GET)
	@GetMapping("/board")
	public String board() {
		return "board";
		
	}
	
	
	
//	@PostMapping("/board")

}
