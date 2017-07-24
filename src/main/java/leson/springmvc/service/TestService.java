package leson.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

	final private IService service;

	@Autowired
	public TestService(IService service) {
		this.service = service;
	}

	public void sayHi() {
		System.out.println("execute service layer code, say hi service!");
	}
}
