package automatioExercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AddReviewOnProduct extends AddReviewOnProduct_ID {
	
	
	@BeforeTest
	public void startapp() {
		AddReviewOnProduct_ID object = new AddReviewOnProduct_ID();
		object.launchapp();
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
		driver.quit();
	}
	
	
	

}
