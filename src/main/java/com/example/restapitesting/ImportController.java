package com.example.restapitesting;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ImportController {

	@PostMapping("/import")
	public String upload(@RequestBody String input) {
		System.out.println("Import Controller :" + input);
		return input;
	}
}
