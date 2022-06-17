package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsTOCHeckVisibility {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/create");
WebElement vis= driver.findElement(By.xpath("(//input[@id='email'])[1]"));
//boolean b=vis.isDisplayed();
//boolean b1=vis.isEnabled();
//boolean b2=vis.isSelected();
System.out.println(vis.isDisplayed());
System.out.println(vis.isEnabled());
System.out.println(vis.isSelected());

driver.quit();
	}

}
