package spring_test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import leson.springmvc.Application;

public class TestApp extends SpringTestBase {

	@Autowired
	Application obj;

	@Test
	public void Test01() {
		System.out.println(obj.testHi());
	}
}
