package ecommerceApp.com;

	import static org.testng.Assert.assertEquals;

	import java.net.MalformedURLException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import io.appium.java_client.AppiumBy;
  import io.appium.java_client.android.AndroidDriver;
  import io.appium.java_client.android.nativekey.AndroidKey;
	import io.appium.java_client.android.nativekey.KeyEvent;

	public class webviewclass extends Utility{
@Test
	public void f() throws MalformedURLException, InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("udit");
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(By.xpath("//android.widget.RadioButton[@text = 'Female']")).click();
		//OPEN DROPDOWN
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//ScrollGesture(known of where to scroll
		  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	Thread.sleep(2000);
	//clik on ARGENTINA(point till scroll)
	driver.findElement(By.xpath("//android.widget.TextView[@text = 'Argentina']")).click();
	//click on lets shop
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();    
	Thread.sleep(3000);	 
	//add items to cart
	driver.findElements(By.xpath("//android.widget.TextView[@text = 'ADD TO CART']")).get(0).click()  ;  
	Thread.sleep(3000);
	driver.findElements(By.xpath("//android.widget.TextView[@text = 'ADD TO CART']")).get(0).click()    ;
	Thread.sleep(3000);
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(3000);

	//check price of both products
	String value1 = driver.findElement(By.xpath("//android.widget.TextView[@text = '$160.97']")).getText() ;  
	String value2 = driver.findElement(By.xpath("//android.widget.TextView[@text = '$120.0']")) .getText() ;  
	String expect = driver.findElement(By.xpath("//android.widget.TextView[@text = '$ 280.97']")) .getText() ;  
	String expected = expect.substring(2,8);
	System.out.println(expected);
	String x = value1.substring(1,7);
	String y = value2.substring(1,6);
	System.out.println(x);
	System.out.println(y);
	Double totalAmount =Double.parseDouble(x)+Double.parseDouble(y);
	Assert.assertEquals(totalAmount,Double.parseDouble(expected));
	//visiot website
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.CheckBox")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click(); 
	Thread.sleep(6000);

	//hybrid app
	Set<String>  contexts =driver.getContextHandles();


		for( String contextName:contexts);
		{
	System.out.println("contextName");}
		driver.context("Webview");
		

	}



	}



