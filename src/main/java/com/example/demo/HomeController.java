package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	// @RequestMapping ParagraphAction defaut retourne get si tu veux post request tzid method = post
	/*	@RequestMapping("/")
		public String greeting() {
			return "Hello , Welcome To spring Boot";
		}
		
		@GetMapping(value="/{name}")
		public String greetingWithName(@PathVariable String name) {
			return "hello " + name ; 
		}
		*/
}
