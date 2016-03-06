package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
  @ResponseBody
  String home() {
         return "Hello Spring!";
  }

	@RequestMapping("/people")
	@ResponseBody
	String people(){
		return "[{\"name\": \"teddy\"}]";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
}
