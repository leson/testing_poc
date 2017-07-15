package leson.springmvc.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/greeting", method = GET)
	public @ResponseBody String greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return "hello";
	}
}