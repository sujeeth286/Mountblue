package Auto;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ur
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Software.geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("htpps://www.cricbuzz.com");
	}

}
