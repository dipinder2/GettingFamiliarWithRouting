package com.dipinder.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String index() {
		return "The dojo is awesome";
	}
	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "Burbank Dojo is located "
				+ "in Southern California";
	}
	@RequestMapping("/san-jose")
	public String sj() {
		return "San jose is the HQ";
	}
}
