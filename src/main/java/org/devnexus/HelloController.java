package org.devnexus;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	private static final AtomicInteger counter = new AtomicInteger(0);


	@GetMapping("/hello")
	public String convertAll() {
		String message = """
				<div style="text-align: center">
				  <h1>Hello Devnexus 2022!</h1>
				  <div style="border-top: 3px solid #bbb">
				    <h2>That's your visit number %s<h2>
				  </div>
				</div>
				""";
		return String.format(message, counter.incrementAndGet());
	}

}
