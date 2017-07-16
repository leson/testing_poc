package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test163 {
	WebDriver driver = null;
	String url = "";

	@BeforeTest
	public void setupEnv() {
		// check if firefox driver runs successfully on your computer
		// System.setProperty("webdriver.gecko.driver", "/home/user/bin");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		this.url = "http://mail.163.com/";
	}

	@Test(invocationCount = 2, threadPoolSize = 2)
	public void checkEnv() {
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(this.url);
		WebElement we = driver.findElement(By.cssSelector("#auto-id-1494681961096"));
		we.sendKeys("testNG");
		we.click();
		System.out.println(we.getAttribute("name") + "｜" + Thread.currentThread().getId());
	}

	@AfterTest
	public void doClose() {
		driver.quit();
		// driver.close();
	}


}
