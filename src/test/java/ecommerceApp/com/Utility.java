package ecommerceApp.com;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class Utility {
	AndroidDriver driver;
	WebDriverWait wait;
  @BeforeClass
  public void getDriver() throws MalformedURLException {
//	  DesiredCapabilities caps = new DesiredCapabilities();
//	  caps.setCapability("DeviceName","Pixel_7_Pro_API_31");
//	  caps.setCapability("app","Users/poonamsharma/Documents/resources/General-Store.apk");

	  UiAutomator2Options option = new UiAutomator2Options();
    //  FirefoxOptions options = new FirefoxOptions();
    //  System.setProperty("webdriver.gecko.driver", "/Users/poonamsharma/Downloads/geckodriver");

	  option.setDeviceName("Pixel_7_Pro_API_34");
	
	//  option.withBrowserName("firefox");
	 // option.setChromedriverExecutable("/Users/poonamsharma/Downloads/chromedriver");
	 

//
	  option.setApp("Users/poonamsharma/Documents/resources/General-Store.apk");
 driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),option);
 wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	
  }
}
