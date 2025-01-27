package ecommerceApp.com;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class MobileBrowser {
    AppiumDriver driver;

   
	@Test
    public void f() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("DeviceName","Pixel_7_API_31");
        caps.setCapability("browserName","chrome");

  	 // caps.setCapability("app","Users/poonamsharma/Documents/resources/General-Store.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	  driver.get("https://www.google.com/");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement ele =driver.findElement(By.name("q"));
	  ele.sendKeys("flipkart");
	  ele.sendKeys(Keys.RETURN);

	  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	//  driver.context("NATIVE_APP");
//	  

	  
	  

  }
}
