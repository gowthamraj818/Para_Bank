package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updateProfile_Page_Objects {

	@FindBy(linkText = "Update Contact Info")
	public static WebElement updatelink;
	@FindBy(id = "customer.firstName")
	public static WebElement fname;
	@FindBy(id = "customer.lastName")
	public static WebElement lname;
	@FindBy(id = "customer.address.street")
	public static WebElement address;
	@FindBy(id = "customer.address.city")
	public static WebElement city;
	@FindBy(id = "customer.address.state")
	public static WebElement state;
	@FindBy(id = "customer.address.zipCode")
	public static WebElement zipcode;
	@FindBy(id = "customer.phoneNumber")
	public static WebElement phone;
	@FindBy(xpath ="//input[@value='Update Profile']" )
	public static WebElement updatebtn;
}
