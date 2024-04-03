package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollUpWithoutArrow extends ScrollUpWithoutArrowID{
	public WebDriver driver;
	
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=0)
	public void scrollUpWithoutArrow() throws Exception{
	ScrollUpWithoutArrowID p = PageFactory.initElements(driver, ScrollUpWithoutArrowID.class);
	System.out.println(p.homepage.isDisplayed() + ": " + p.homepage.getText() + " : " + "Homepage is visible");
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.scrollBy(60000, 60000);");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(p.subscription.isDisplayed() + ": " + p.subscription.getText() + " : " + "Subscription Displayed");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
		
	@Test(priority=1)
	public void scrollToElement() {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView();", driver.findElement(Element));
	String[] header = {"Full-Fledged practice website for Automation Engineers"};
	for(String text : header) {
		System.out.println(text);
		}
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
