package leson.jmockit;

import javax.annotation.Resource;

@Resource
public class MyObject {

	public String hello(String name) {
		return "Hello " + name;
	}
}
