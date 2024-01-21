package ecommerceApp.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileBrowser {
	AndroidDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  UiAutomator2Options option = new UiAutomator2Options();
	  option.setDeviceName("Pixel_4_API_31");
	  option.setChromedriverExecutable("/Users/poonamsharma/Downloads/chromedriver");
	  option.setCapability("browserName","Chrome");
	  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),option);
	  driver.get("https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement ele =driver.findElement(By.name("q"));
	  ele.sendKeys("selenium automation");
	  ele.sendKeys(Keys.RETURN);

//	  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
//	  driver.context("NATIVE_APP");
//	  

	  
	  

  }
}
