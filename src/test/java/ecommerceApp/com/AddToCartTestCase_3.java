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

public class AddToCartTestCase_3 extends Utility{
	WebDriverWait wait;
	AndroidDriver driver;
  @Test
  public void f() throws InterruptedException {
	
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.androidsample.generalstore:id/spinnerCountry")));

	  driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	  Thread.sleep(1000);
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))")).click();
	  Thread.sleep(1000);

	  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("mariya");
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	  Thread.sleep(1000);
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
	  int productcount =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	  for(int i = 0;i<productcount; i++) {
	String productName=	  driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	if(productName.equalsIgnoreCase("Jordan 6 Rings")){
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
	}
	  }
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	  Thread.sleep(1000);

	  String lastpage = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
Assert.assertEquals(lastpage,"Jordan 6 Rings");
  }
}
