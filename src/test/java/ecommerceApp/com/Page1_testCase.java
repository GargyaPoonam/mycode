package ecommerceApp.com;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;



public class Page1_testCase extends Utility{
	 @SuppressWarnings("deprecation")	
  @Test
  public void f() throws InterruptedException, MalformedURLException {
	  
      driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
      WebElement element =driver.findElement(By.id("android:id/text1"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		TouchAction action = new TouchAction(driver);
//		action.press(ElementOption.element(element)).moveTo(ElementOption.point(0, 100)).release().perform();
//		action.perform();
//		String scrollToText = "Zimbabwe";
//		String resourceId = "android:id/text1";
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
//		  		+ "new UiSelector().resourceId(\"" + resourceId + "\").text(\"" + scrollToText + "\"))"));   
//	      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
//			  		+ "new UiSelector().resourceId(\"" + resourceId + "\").text(\"" + scrollToText + "\"))")));
//		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
//		int startX = size.width / 2;
//		int startY = (int) (size.height * 0.8);
//		int endY = (int) (size.height * 0.2);
//
//		new TouchAction<>(driver)
//		    .press(PointOption.point(startX, startY))
//		    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//		    .moveTo(PointOption.point(startX, endY))
//		    .release()
//		    .perform();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(className(\"android.widget.TextView\"))"));

		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppiumBy.className("android.widget.TextView")));
				System.out.println(options.size());
		for (WebElement option : options) {
		      System.out.println("Print all dropdown option: " + option.getText());
		    }
//    	    WebElement option = options.get(i);
//    	   
//
//    	    System.out.println("Print all dropdown option: " + option.getText());
    	}
	    
//      for (WebElement option : options) {
////    //		js.executeScript("arguments[0].scrollIntoView();", options.get(0));
//    //	  action.press(ElementOption.element(element)).moveTo(ElementOption.point(0, 10)).release().perform();
////  		action.perform();
//          System.out.println("Print all dropdown option: " + option.getText());
//      }
//	  driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))")).click();
//	  Thread.sleep(1000);
//
//	  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("mariya");
//	  Thread.sleep(1000);
//	  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();	  
}

