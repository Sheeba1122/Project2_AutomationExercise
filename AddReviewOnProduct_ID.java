package automatioExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class AddReviewOnProduct_ID {
	public WebDriver driver;
	
	
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[text()='All Products']") WebElement viewproduct;
	@FindBy(xpath="//*[@href='/product_details/1']") WebElement product1;
	@FindBy(xpath="//*[text()='Write Your Review']") WebElement review;
	@FindBy(xpath="//*[@id='name']") WebElement name;
	@FindBy(xpath="//*[@id='email']") WebElement email; 
	@FindBy(xpath="//*[@id='review']") WebElement reviewtext; 
	@FindBy(xpath="//*[@id='button-review']") WebElement reviewbutton;
	@FindBy(xpath="//*[text()='Thank you for your review.']") WebElement reviewmsg;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	
	public void launchapp() {
		System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
		driver = new FirefoxDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
}
