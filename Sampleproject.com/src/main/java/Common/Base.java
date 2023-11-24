package Common;

import org.testng.annotations.Test;

import Pages.fbhome1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class Base implements ITestListener {

public  static WebDriver driver;
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  @Override
public void onTestSuccess(ITestResult result) {
	  this.driver = ((Base)result.getInstance()).driver;
      try {
		shots("passed");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Override
public void onTestFailure(ITestResult result) {
	this.driver = ((Base)result.getInstance()).driver;
	try {
		shots("failed");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void shots( String folder) throws IOException {
	 // TakesScreenshot ts = ((TakesScreenshot)driver) // here, I am casting this driver into TakesScreenshot
			Date dt = new Date(); // to save screenshot date/time wise, we have to create the
			// object of Date class.
			String str = dt.toString().replace(" ", "-").replace(":", "-");
			// here, we changed the format from " " to "-" and ":" to "-" 
		// To change dt variable to String variable, we need to use to string function and see system.output.println to see the date format.
			//We can't save this kind of date format in our file and we have to change this date format
			// using .replace function.
		//	System.out.println(str);
			// Fri Nov 03 17:06:28 EDT 2023 -- this is date format in the console
	   File capture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  //( The above, we are taking screenshot and output type is FILE type and it is saved in "capture" variable. 
	 // String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
	 // FileHandler.copy(capture, new File("C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\sshot1\\"+str+".png"));
	 FileHandler.copy(capture, new File("C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\pictures\\"+folder+"\\"+str+".png"));
	  // To save in "Pictures" file in our project, we need to use FileHandler class and fine name is 1.png
    // C:\Users\akbar\eclipse-workspace1\Sampleproject.com\pictures
}
 // @Parameters({"browser", "url"})
  @BeforeTest
  @Parameters({"F1","F2"})
 // public void btest() throws InterruptedException {
	  
 // }
  public void   brow(  String browser1,String urlq) throws InterruptedException {
	  if(browser1.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\driverone\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  Thread.sleep(5000);
		  driver.get(urlq);
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
	  }
	  else if  (browser1.equalsIgnoreCase("Edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\Driv\\msedgedriver.exe");
		   EdgeOptions op= new  EdgeOptions();
		   op.addArguments("disable-notifications");
		   driver = new EdgeDriver(op); 
			  Thread.sleep(5000);
			  driver.get(urlq);
			  driver.manage().window().maximize();
			  Thread.sleep(4000);
		  
	  }
	  else {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\akbar\\eclipse-workspace1\\Sampleproject.com\\driverone\\geckodriver.exe");
		  driver = new FirefoxDriver(); 
		  Thread.sleep(5000);
		  driver.get(urlq);
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
	  }
  }
 

}
