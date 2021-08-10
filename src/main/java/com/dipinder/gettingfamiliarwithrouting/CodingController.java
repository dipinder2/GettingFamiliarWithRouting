package com.dipinder.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String index() {
		return "Hello coding dojo!";
	}
	@RequestMapping(value="/python",method=RequestMethod.GET)
	public String python() {
		return "Hello python";
	}
	@RequestMapping(value="java",method=RequestMethod.GET)
	public String java() {
		return "Hello java";
	}
}
