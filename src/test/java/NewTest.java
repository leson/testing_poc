import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	WebDriver driver = null;

	@Before
	public void setupEnv() {
		// System.setProperty("webdriver.gecko.driver", "/home/user/bin");
		// check if firefox driver runs successfully on your computer
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void checkEnv() {
		driver.get("https://www.baidu.com/");
		WebElement we = driver.findElement(By.cssSelector("#kw"));
		System.out.println(we.getAttribute("name"));
	}

	@After
	public void doClose() {
		driver.quit();
		// driver.close();
	}

}
