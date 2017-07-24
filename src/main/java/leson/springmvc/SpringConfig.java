package leson.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用@Configuration注解该类，等价 与XML中配置beans；用@Bean标注方法等价于XML中配置bean
 * 
 * @author leson
 *
 */
@Configuration
public class SpringConfig {

	/**
	 * 方法上配置 @Bean 意思是告诉spring 从这个方法上可以获取一个对象。
	 * @return
	 */
	@Bean
	public Application getApp() {
		return new Application();
	}

}
