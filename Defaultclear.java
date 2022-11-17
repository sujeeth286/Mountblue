package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defaultclear 
{
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/sujee/OneDrive/Desktop/Default.html");
		Thread.sleep(4000);
		d.findElement(By.tagName("input")).clear();
	}

}
   