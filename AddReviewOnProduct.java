package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddReviewOnProduct {
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
	public void productpage() {
		AddReviewOnProduct_ID p = PageFactory.initElements(driver,AddReviewOnProduct_ID.class);
		Assert.assertEquals(p.homepage.isEnabled(),true);
		p.productpage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(p.viewproduct.isDisplayed() + ": " + p.viewproduct.getText());
		p.product1.click();
		System.out.println(p.review.isDisplayed() + ": " + p.review.getText());
		p.name.sendKeys("Shalini");
		p.email.sendKeys("testcheck789@gmail.com");
		p.reviewtext.sendKeys("Good Product");
		p.reviewbutton.click();
		System.out.println(p.reviewmsg.isDisplayed() + ": " + p.reviewmsg.getText());
		}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
	
	

}
