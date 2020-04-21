package com.todoapp.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3001")
public class helloworldController {
	
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "Hello world";
	}
	
	@RequestMapping("/helloworld/{name}")
	public String helloworldVariable(@PathVariable String name ) {
		return " hello world" +" "+ name;
	}
	

}
