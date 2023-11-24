package Regression2;

import org.testng.annotations.Test;

import Pages.fbhome1;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest5 {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  fbhome1 ob1 = new fbhome1(driver);
	  ob1.sendmail("abc@yahoo.com");
	  Thread.sleep(5000);
	  ob1.sendpass("########");
	  Thread.sleep(4000);
  }
 //@BeforeTest
/*  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\driverone\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(4000);
	  driver.manage().window().maximize();
	  Thread.sleep(4000);*/
 // }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\driverone\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(4000);
	  driver.manage().window().maximize();
	  Thread.sleep(4000);

} }
