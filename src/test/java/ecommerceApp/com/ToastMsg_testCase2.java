package ecommerceApp.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ToastMsg_testCase2 extends Utility{
	WebDriverWait wait;
	
  @Test
  public void f() throws InterruptedException {
	AndroidDriver driver = null;
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Spinner")));
	  
	//  Thread.sleep(1000);
	 
// WebElement dropdown = driver.findElement(By.className("android.widget.TextView"));
//	  System.out.println("Dropdown values:");
	    List<WebElement> options = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Spinner"));
	    for (WebElement option : options) {
	        System.out.println(option.getText());
	    }
	
//	  driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))")).click();
//	  Thread.sleep(1000);
//
//	//  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("mariya");
//	  Thread.sleep(1000);
//	  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//	  String toastmessage =driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//	  Assert.assertEquals(toastmessage, "please enter your name");
  }
}
