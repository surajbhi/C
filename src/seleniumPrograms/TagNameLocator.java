package seleniumPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20signup%7C&placement=&creative=589460569891&keyword=facebook%20signup&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-321689134300%26loc_physical_ms%3D9299875%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw8amWBhCYARIsADqZJoVp9SbruNj60h-D5xIL_n7JYtMKYCstSJR2fE9YPDcIFsFZ3in4lS0aAhPeEALw_wcB");
		//List<WebElement> lis = driver.findElements(By.tagName("a"));
		List<WebElement> lis = driver.findElements(By.id("//select[@id='day']"));

		System.out.println(lis.size());
		System.out.println("=====");
		for (int i = 0; i < lis.size(); i++) {
			System.out.println(lis.get(i).getText());
		}
		driver.quit();
	}
}
