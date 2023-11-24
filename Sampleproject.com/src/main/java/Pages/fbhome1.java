package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhome1 {  // Creating page object model.
	public  static WebDriver driver;
	@FindBy(id="email") WebElement mailfield; // Located the element
	@FindBy(id="pass") WebElement passfield;
	@FindBy(name="login") WebElement logfield;
	
	public fbhome1(WebDriver driver) {       // Added page factory constructor
		fbhome1.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    public void sendmail(String mailtext) {  // created the functions
    	//mailfield.clear();
    	mailfield.sendKeys(mailtext);
    }
    public void sendpass(String passtext) {
    	passfield.sendKeys(passtext);
    }
    public void login1() {
    	logfield.click();
    }
    public void likn() {
    	List<WebElement> savelink1 = driver.findElements(By.tagName("a"));
    	System.out.println("Total ling are = " + savelink1.size() );
    	
    	for(int k=0;k<savelink1.size();k++) {
    	     System.out.println(savelink1.get(k).getAttribute("role"));
    	}
    }
}
