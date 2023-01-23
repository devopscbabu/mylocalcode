package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NewTest {
WebDriver driver;	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babu\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
  }
  @Test
  public void launchBrowser() {
	  driver.get("https://www.facebook.com/");
	  String actualTitle = driver.getTitle();  
	  }
  @Test(dependsOnMethods = {"launchBrowser"})
  public void closeBrowser() {
	  driver.quit();
  }
}
