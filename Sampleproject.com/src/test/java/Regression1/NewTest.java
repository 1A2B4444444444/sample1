package Regression1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Common.Base;
import Pages.fbhome1;


public  class NewTest extends Base {

@Test
  public void f() throws InterruptedException, IOException {
	 
	 fbhome1 ob1 = new fbhome1(driver);
	 ob1.sendmail("akb@yahoo.com");
	 
	 Thread.sleep(4000);
	 
	 shots("T2-pass");
	 Thread.sleep(5000);
	
  }
 

  

}
