package jmockit;

import leson.jmockit.MyObject;
import mockit.Expectations;
import mockit.Verifications;

public class Test {

	@Test
	public void testHello() {
		final MyObject obj = new MyObject();  
	    new Expectations(obj) {//录制预期模拟行为  
	        {  
	            obj.hello("Zhangsan");  
	            returns("Hello Zhangsan");  
	            //也可以使用：result = "Hello Zhangsan";  
	        }  
	    };  
	    assertEquals("Hello Zhangsan", obj.hello("Zhangsan"));//调用测试方法  
	    new Verifications() {//验证预期Mock行为被调用  
	        {  
	            obj.hello("Hello Zhangsan");  
	            times = 1;  
	        }  
	    };  
	}
}
