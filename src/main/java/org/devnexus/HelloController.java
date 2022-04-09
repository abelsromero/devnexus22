package org.devnexus;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	public HelloController() {
	}

	private static final AtomicInteger counter = new AtomicInteger(1);


	@GetMapping("/hello")
	public String convertAll() {
		String message = "Hello Devnexus 2022!\n That's your visit number %s";
		return String.format(message, counter.incrementAndGet());
	}

}
