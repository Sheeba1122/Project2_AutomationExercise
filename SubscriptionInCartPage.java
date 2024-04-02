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

public class SubscriptionInCartPage {
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
	public void subscriptionInCart() {
		SubscriptionInCartPage_ID p = PageFactory.initElements(driver, SubscriptionInCartPage_ID.class);
		System.out.println(p.homepage.isDisplayed() + " : "  + p.homepage.getText() + " : " + p.homepage.isEnabled()); 
		p.cart.click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(10000, 10000);");
		
		System.out.println(p.subscription.isDisplayed()+ " : " + p.subscription.getText());
		p.email.sendKeys("testcheck789@gmail.com");
		p.arrow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
