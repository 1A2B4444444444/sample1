package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Base3 {
  public static WebDriver driver;
  @BeforeMethod
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\driverone\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }

  @AfterMethod
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
