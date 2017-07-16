package test;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium {
	WebDriver driver = null;
	String url = "";

	@BeforeTest
	public void setupEnv() {
		// check if firefox driver runs successfully on your computer
		// System.setProperty("webdriver.gecko.driver", "/home/user/bin");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		this.url = "https://www.baidu.com/";
	}

	@Test(invocationCount = 2, threadPoolSize = 2)
	public void checkEnv() {
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(this.url);
		WebElement we = driver.findElement(By.cssSelector("#kw"));
		we.sendKeys("testNG");
		we.click();
		System.out.println(we.getAttribute("name") + "｜" + Thread.currentThread().getId());
	}

	@AfterTest
	public void doClose() {
		driver.quit();
		// driver.close();
	}

	/** 这是智能等待元素加载的方法 */
	public void intelligentWait(WebDriver driver, int timeOut, final By by) {
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(by);
					return element.isDisplayed();
				}
			});

		} catch (TimeoutException e) {
			Assert.fail("超时L !! " + timeOut + " 秒之后还没找到元素 [" + by + "]", e);
		}
	}

	@Test
	public void f() {
		System.out.println("introduce");
		By inputBox = By.id("kw");
		By searchButton = By.id("su");

		// 智能等待元素加载出来
		intelligentWait(driver, 10, inputBox);
		// 智能等待元素加载出来
		intelligentWait(driver, 10, searchButton);
		driver.findElement(inputBox).sendKeys("introduce");
		driver.findElement(searchButton).click();
	}

}
