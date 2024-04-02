package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scrolling_Pick_oneID {

	@FindBy(xpath="//*[@id='slider-carousel']//following::*[@class='item active']") WebElement slider;
	@FindBy(xpath="//*[contains(text(),'Full-Fledged practice website for Automation Engineers')]/ancestor::div[3]") WebElement slider1;
}
