package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class openAccount_Page_Objects {

	@FindBy(linkText = "Open New Account")
	public static WebElement openNewAccount;
	
	@FindBy(xpath = "//input[@class='button']")
	public static WebElement Open;
}
