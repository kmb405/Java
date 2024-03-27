package com.codingdojo.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
	@RequestMapping("")
    public String index(@RequestParam(value="name", required=false) String searchQuery,
    					@RequestParam(value="last_name", required=false) String secondQuery,
    					@RequestParam(value="times", required=false) int thirdQuery) {
		if (searchQuery == null) {
			return "Hello Human";
		} else if (secondQuery == null) {
			return "Hello " + searchQuery;
		} else if (thirdQuery == 0){
			return "Hello " + searchQuery + " " + secondQuery;
		} else {
			String phrase = "Hello " + searchQuery + " ";
			return phrase.repeat(thirdQuery);
		}
	}
}
