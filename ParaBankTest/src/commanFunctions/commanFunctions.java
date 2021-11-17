package commanFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commanFunctions {

	public  static Properties properties = null;
	public static WebDriver driver = null;
	Logger  logger = Logger.getLogger(commanFunctions.class);
	
	public Properties loadpropertyfile() throws IOException
	{
		//property file load and return
		FileInputStream fileInputStream = new FileInputStream("config.properties");		 
		properties = new Properties();
		properties.load(fileInputStream);

		return properties;
	}
	@BeforeSuite
	public void launchBroswer() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("parakBank Begins");
		logger.info("Loading the property files");
		loadpropertyfile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverlocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverlocation);
			logger.info("Lanching chrome");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driverlocation);
			logger.info("Lanching Firefox");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		logger.info("Open the Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void driverclose()
	{
		logger.info("Closing The Browser");
		driver.quit();
	}
}
