package Auto;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire1
{
	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value= "./software/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver fx=new FirefoxDriver();
		Thread.sleep(7000);
		fx.get("file:///C:/Users/sujee/Downloads/raja.html");
		
	}

}
