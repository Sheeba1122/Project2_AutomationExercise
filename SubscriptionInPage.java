package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubscriptionInPage {
	public WebDriver driver;
	
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void subscription() {
		SubscriptionInPageID p =PageFactory.initElements(driver, SubscriptionInPageID.class);
		System.out.println(p.homepage.isDisplayed() + ": " + p.homepage.getText());
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(60000, 60000);");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println(p.subscription.isDisplayed() + " : " + p.subscription.getText());
		p.email.sendKeys("testcheck789@gmail.com");
		je.executeScript("window.scrollBy(60000, 60000);");
		p.arrow.click();
		je.executeScript("window.scrollBy(60000, 60000);");
		boolean successmsg; 
		if(successmsg=true) {
			System.out.println(p.successmsg.isDisplayed() + " : "+ p.successmsg.getText());
			}
		else {
			System.out.println("Not displayed");
		}
		
		
	}
		@AfterTest
		public void closeApp() {
		driver.close();
	}
}
