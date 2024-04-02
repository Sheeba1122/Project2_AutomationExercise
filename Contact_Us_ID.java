package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us_ID {
	@FindBy(xpath="//*[@href='/contact_us']") WebElement contactus;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='Get In Touch']") WebElement getintouch;
	@FindBy(xpath="//*[@class='status alert alert-success']") WebElement successmsg;
	
}
