package com.yc.Shmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@MapperScan("com.yc")
public class ShmarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShmarketApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
}
