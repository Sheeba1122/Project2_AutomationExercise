package automatioExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductQualityInCartID {

	@FindBy(xpath="//*[text()='View Product']") WebElement viewproduct;
	@FindBy(id="quantity") WebElement quantity;
	@FindBy(xpath="//*[@class='btn btn-default cart']//following::*[@class='fa fa-shopping-cart']") WebElement addtocart;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[@href='/view_cart']") WebElement viewcart;
	@FindBy(xpath="//*[text()='Blue Top']") WebElement product1;
	@FindBy(xpath="//*[text()='4']")WebElement displayquantity;
	@FindBy(xpath="//div[@class='modal-dialog modal-confirm']") WebElement popup;
	@FindBy(xpath="//*[text()=' Home']") WebElement homepage;
	
}
