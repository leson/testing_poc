import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {

	@Before
	public void setupEnv() {
//		System.setProperty("webdriver.gecko.driver", "/home/user/bin");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	}

	@Test
	public void checkEnv() {
		// 首先打一个hello world来测试一你的IDE里testng的插件是否已经安装好
		// check if you success installed testng on your IDE
		System.out.println("Hello World, TestNG");

		// 看看你电脑上能不能正确用firefox driver启动firefox
		// check if firefox driver runs successfully on your computer
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com/");
	}

	@After
	public void afterTest() {

	}

}
