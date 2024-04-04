package automatioExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us_ID {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@href='/contact_us']") WebElement contactus;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='Get In Touch']") WebElement getintouch;
	@FindBy(xpath="//*[@class='status alert alert-success']") WebElement successmsg;

	
}
