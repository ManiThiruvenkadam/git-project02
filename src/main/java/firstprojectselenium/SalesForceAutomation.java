package firstprojectselenium;
//Automating the salesforce website

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		Thread.sleep(2000);
		//a[text() = 'Log in']
		WebElement signinbutton = driver.findElement(By.linkText("Log in"));
		signinbutton.click();
		Thread.sleep(2000);
		
		WebElement enterUserName = driver.findElement(By.id("username"));
		enterUserName.sendKeys("mani.t@selectiva.io");
		Thread.sleep(2000); 
		
		WebElement EnterPassword = driver.findElement(By.id("password"));
			EnterPassword.sendKeys("Welcome@1");
			Thread.sleep(2000); 
		
		//Providing the invalid user name and Password
		/*WebElement InvalidUserName = driver.findElement(By.id("username"));
		InvalidUserName.sendKeys("Mani#$@gmail.com");
		Thread.sleep(2000);
		
		WebElement InvalidPassword = driver.findElement(By.id("password"));
		InvalidPassword.sendKeys("Welcome1234");
		Thread.sleep(2000);*/
	
		
	//Clear Password field to check on error message
	   /* WebElement ClearPassword = driver.findElement(By.id("password"));
		ClearPassword.clear();
		Thread.sleep(2000);    */
		
	//click the Remember me check box
		/*WebElement CheckonRememberme = driver.findElement(By.id("rememberUn"));
		CheckonRememberme.click();
		Thread.sleep(2000);*/
		
		WebElement LogIn = driver.findElement(By.id("Login"));
		LogIn.click();
		Thread.sleep(2000); 
		
	//Forgot password TestCase
		/*WebElement ClickonForgotPassword = driver.findElement(By.xpath("//*[contains(@id,'forgot')]"));
		ClickonForgotPassword.click();
		Thread.sleep(2000);  
		
		WebElement EnterUserName = driver.findElement(By.id("un"));
		EnterUserName.sendKeys("mani.t@selectiva.io");
		Thread.sleep(2000);
		
		WebElement ClickonContinue = driver.findElement(By.id("continue"));
		ClickonContinue.click();
		Thread.sleep(2000); */
		
		
		
		/*WebElement ModuleHome = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		ModuleHome.click();
		Thread.sleep(2000); 
		
		//a[@title='Opportunities Tab - Selected'] --- due to some reason this Xpath isn't working although it is right.
		//*[contains(@title, 'Opportunities')]
		WebElement ModuleOpportunities = driver.findElement(By.xpath("//*[contains(@title,'Opportunities')]"));
		ModuleOpportunities.click();
		Thread.sleep(2000);  
		
		WebElement ModuleLeads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		ModuleLeads.click();
		Thread.sleep(2000);
		
		WebElement ModuleContacts = driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		ModuleContacts.click();
		Thread.sleep(2000);
		
		WebElement ClickonPlusSign = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		ClickonPlusSign.click();
		Thread.sleep(2000);  */
		
		WebElement UserProfile = driver.findElement(By.id("userNavLabel"));
		UserProfile.click();
		Thread.sleep(2000);
		
		/*WebElement ClickLogout = driver.findElement(By.xpath("//a[@title='Logout']"));
		ClickLogout.click();
		Thread.sleep(2000);   */
		
		//a[@title='My Profile
	/*	WebElement ClickonMyProfile = driver.findElement(By.xpath("//a[@title='My Profile]"));
		ClickonMyProfile.click();
		Thread.sleep(2000);  
		//a[contains(@class,'contactInfoLaunch editLink')]//img']
		WebElement DropdownMyProfile = driver.findElement(By.linkText("My Profile"));
		DropdownMyProfile.click();
		Thread.sleep(2000);  */
		
		
		
	
		
		
	}

}
