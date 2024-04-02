package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePageID {
	@FindBy(xpath="//*[@href='/test_cases']") WebElement textcasepage;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	
}
