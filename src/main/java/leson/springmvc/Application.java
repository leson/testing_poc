package leson.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import leson.springmvc.service.IService;
import leson.springmvc.service.TestService;

@Configuration
@ComponentScan
public class Application {

	@Bean
	IService mockIService() {
		return new IService() {
			public String getMessage() {
				return "hello world";
			}
		};
	}

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext(Application.class);
		// TestService test = context.getBean(TestService.class);
		// test.sayHi();
	}

	public String testHi() {
		return "hell0 test";
	}
}
