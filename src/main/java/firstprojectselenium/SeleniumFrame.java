package firstprojectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrame {
	
	WebDriver driver = null;
	
	//method for Launch WebBrowser
	public void launchbrowser ()
	{
		driver=new ChromeDriver();
	}
	
	//method for get URL
	public void GetURL (String url)
	{
		driver.get("https://developer.salesforce.com/signup");
		System.out.println(url+ "is entered");
	}
	
	//Method for Maximizebrowser
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
		System.out.println("Browser size maximized");
	}
	
	//Method for EnterText
	public void EnterText(WebElement element, String data, String ObjectName)
	{
		element.sendKeys(data);
	}
	
	//Method for clearTextField
	public void ClearText(WebElement element, String ObjectName)
	{
		element.clear();
	}
	
	//Method for ClickElement
	public void ClickElement(WebElement element)
	{
		element.click();
	}
	
}
