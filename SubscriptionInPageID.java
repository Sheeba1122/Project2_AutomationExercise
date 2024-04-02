package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionInPageID {

	@FindBy(id="susbscribe_email") WebElement email;
	@FindBy(xpath="//*[contains(@class,'fa fa-arrow-circle-o-right')]") WebElement arrow;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='Subscription']") WebElement subscription;
	@FindBy(xpath="//*[contains(@class,'alert-success alert')]") WebElement successmsg;
}
