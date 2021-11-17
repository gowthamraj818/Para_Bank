package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commanFunctions.commanFunctions;
import pageObjects.billpay_Page_Objects;

public class billPay extends commanFunctions{

	@Test
	public void paybill()
	{
		PageFactory.initElements(driver, billpay_Page_Objects.class);
		
		billpay_Page_Objects.clickbillpay.click();
		billpay_Page_Objects.name.sendKeys("gowtham");
		billpay_Page_Objects.addressstreet.sendKeys("#381 TNHB PHASE-1");
		billpay_Page_Objects.addresscity.sendKeys("Tirupattur");
		billpay_Page_Objects.addressstate.sendKeys("Tamilnadu");
		billpay_Page_Objects.zipnumber.sendKeys("635601");
		billpay_Page_Objects.phoneNumber.sendKeys("7502663438");
		billpay_Page_Objects.accountNumber.sendKeys("011111111111111111111111");
		billpay_Page_Objects.verifyAccount.sendKeys("011111111111111111111111");
		billpay_Page_Objects.enteramount.sendKeys("50");
	}
}
