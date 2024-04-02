package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollUpUsingArrowID {

	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='Subscription']") WebElement subscription;
	@FindBy(id="scrollUp") WebElement scrollup;
	
}
