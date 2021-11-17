package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class applyloan_Page_Objects {

	@FindBy(linkText = "Request Loan")
	public static WebElement loanlink;
	
	@FindBy(xpath = "// input[@id='amount']")
	public static WebElement lamount;
	
	@FindBy(xpath = "// input[@id='downPayment']")
	public static WebElement dpayment;
	
	@FindBy(xpath = "// input[@type='submit']")
	public static WebElement clickapply;
	
	@FindBy(linkText = "Log Out")
	public static WebElement LogOut;
}
