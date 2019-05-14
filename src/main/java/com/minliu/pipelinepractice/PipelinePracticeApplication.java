package com.minliu.pipelinepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class PipelinePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelinePracticeApplication.class, args);
	}

	@GetMapping("/hello")
	public Map sayHello(){
		Map map = new HashMap();
		map.put("info", "Hello");
		return map;
	}

}
