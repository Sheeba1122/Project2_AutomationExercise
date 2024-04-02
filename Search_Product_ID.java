package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Product_ID {
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[@id='search_product']") WebElement searchtextbox;
	@FindBy(xpath="//*[@id='submit_search']") WebElement searchbtn;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	@FindBy(xpath="//*[text()='All Products']") WebElement allproducts;
	@FindBy(xpath="//*[text()='Searched Products']") WebElement searchedproduct;
}
