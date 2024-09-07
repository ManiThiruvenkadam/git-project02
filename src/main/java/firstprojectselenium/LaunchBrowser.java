package firstprojectselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopCommerce.com");
	Thread.sleep(2000);
	
	String checktitle = driver.getTitle();
	
	if(checktitle.equals("nopCommerce demo store"))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	
driver.quit();
		
		
	}

}
