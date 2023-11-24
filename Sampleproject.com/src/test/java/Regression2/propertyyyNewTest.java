package Regression2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


import Common.Base2;
import Pages.fbhome1;

public class propertyyyNewTest extends Base2 {
  @Test(groups = {"Functional"})
  public void f() throws IOException, InterruptedException  {
	 Properties pro1 = new Properties();
	 FileInputStream ft = new FileInputStream("C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\p.properties");
	 pro1.load(ft);
	 
	String mailtext = pro1.getProperty("email");
	 String passtext = pro1.getProperty("passwd");
	 System.out.println(mailtext);
	 System.out.println(passtext);
	 fbhome1 ob1 = new fbhome1(driver);
	 ob1.sendmail(mailtext);
	 Thread.sleep(4000);
	 ob1.sendpass(passtext);
	 Thread.sleep(0);
	 ob1.login1();
	 
  }
}
