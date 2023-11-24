package Regression2;

import org.testng.annotations.Test;

import Common.Base2;
import Pages.fbhome1;

import org.testng.annotations.DataProvider;

public class dpNewTest6 extends Base2 {
  @Test(dataProvider = "dp")
  public void f(String mail, String pass) throws InterruptedException {
	  fbhome1 ob2 = new fbhome1(driver);
	  ob2.sendmail(mail);
	  Thread.sleep(3000);
	  ob2.sendpass(pass);
	  Thread.sleep(4000);
	  //driver.navigate().back();
	//  driver.navigate().back();
	 // Thread.sleep(5000);
	   ob2.login1();
	 //driver.navigate().back();
	 Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(5000);
	 // This is what I have added in this class
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "*******" },
      new Object[] { "def@gmail.com", "bbbbbb" },
    };
  }
}
