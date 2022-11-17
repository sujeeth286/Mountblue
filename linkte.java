package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkte 
{
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805424%7Cb%7Cwww%20facebook%20com%27%7C&placement=&creative=550525805424&keyword=www%20facebook%20com%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221352%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-370943296522%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwmJeYBhAwEiwAXlg0AbRaDsolaxPyU40X2pm93b6T-sw0POhu7lyvZbkZneXqfg7maX4JZBoC1kwQAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
				 
	}
}