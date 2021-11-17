package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class billpay_Page_Objects {
	
	@FindBy(linkText = "Bill Pay")
	public static WebElement clickbillpay;
	@FindBy(xpath = "// *[@name='payee.name']")
	public static WebElement name;
	@FindBy(xpath = "// *[@name='payee.address.street']")
	public static WebElement addressstreet;
	@FindBy(xpath = "// *[@name='payee.address.city']")
	public static WebElement addresscity;
	@FindBy(xpath = "// *[@name='payee.address.state']")
	public static WebElement addressstate;
	@FindBy(xpath = "// *[@name='payee.address.zipCode']")
	public static WebElement zipnumber;
	@FindBy(xpath = "// *[@name='payee.phoneNumber']")
	public static WebElement phoneNumber;
	@FindBy(xpath = "// *[@name='payee.accountNumber']")
	public static WebElement accountNumber;
	@FindBy(xpath = "// *[@name='verifyAccount']")
	public static WebElement verifyAccount;
	@FindBy(xpath = "// *[@name='amount']")
	public static WebElement enteramount;
	@FindBy(xpath = "// input[@value='Send Payment']")
	public static WebElement SendPayment;
}
