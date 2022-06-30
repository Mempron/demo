package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@SpringBootApplication
@RestController
public class DemoApplication {

	private Integer id = 1;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ok")
	public String ok() {
		return "OK!";
	}


	@RequestMapping(value = "/createPerson", consumes = "application/json", method = {RequestMethod.PUT,RequestMethod.POST})
	public Person createPerson(@RequestBody Map<String, Object> payload) throws InterruptedException {

		Person person = new Person(id, (String) payload.get("name"), (int) payload.get("salary"));
		id += 1;

		// Случайная задержка на ответ
		Integer delay = (int) ((Math.random() * (3000 - 2000)) + 2000);
		Thread.sleep(delay);

		return person;
	}


}
