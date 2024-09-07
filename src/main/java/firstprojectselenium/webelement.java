package firstprojectselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelement {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html\n");
		
		WebElement EmailId =driver.findElement(By.id("email_field"));
		EmailId.sendKeys("admin123@gmail.com");
		
		WebElement Password = driver.findElement(By.id("password_field"));
		Password.sendKeys("admin123");
		
		WebElement LogintoAccount = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		LogintoAccount.click();
		Thread.sleep(2000);
		
		/*Alert alertobj = driver.switchTo().alert();
		String catchmessage = alertobj.getText();
		System.out.println("The aler message is:"+catchmessage);
		alertobj.accept();*/
		
		/*WebElement Name = driver.findElement(By.id("Name"));
		Name.sendKeys("Manimegalai");
		Thread.sleep(2000);
		
		WebElement FatherName = driver.findElement(By.id("lname"));
		FatherName.sendKeys("Thiruvenkadam");
		Thread.sleep(2000);
		
		WebElement PostalAddress = driver.findElement(By.id("postaladdress"));
		PostalAddress.sendKeys("123 street, colony, 636201");
		Thread.sleep(2000);
		
		WebElement PersonalAddress = driver.findElement(By.id("personaladdress"));
		PersonalAddress.sendKeys("456 street,penrose colony, 63120");
		Thread.sleep(2000);
		
		WebElement GenderFemale= driver.findElement(By.xpath("//input[@Value='female']"));
		GenderFemale.click();
		
		if(GenderFemale.isSelected())
		{
			System.out.println("Gender female is selected");
		}
		else
		{
			System.out.println("Gender Male is selected");
		}
		Thread.sleep(2000);
		
		WebElement Citydropdown = driver.findElement(By.id("city"));
		Select choosecity = new Select(Citydropdown);
		choosecity.selectByValue("goa");
		Thread.sleep(2000);
		
		WebElement Coursedropdown = driver.findElement(By.id("course"));
		Select choosecourse = new Select(Coursedropdown);
		choosecourse.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement Districtdropdown = driver.findElement(By.id("district"));
		Select chooseDistrict = new Select(Districtdropdown);
		chooseDistrict.selectByIndex(3);
		Thread.sleep(2000);
		
		WebElement Statedropdown = driver.findElement(By.id("state"));
		Select chooseState = new Select(Statedropdown);
		chooseState.selectByValue("mca");
		Thread.sleep(2000);
		
		WebElement Pincode = driver.findElement(By.id("pincode"));
		Pincode.sendKeys("636201");
		Thread.sleep(2000);
		
		WebElement Emailid = driver.findElement(By.id("emailid"));
		Emailid.sendKeys("mathiruvenkadam@gmail.com");
		Thread.sleep(2000);*/
		
		WebElement Switchtodropdown = driver.findElement(By.xpath("//button[text()='dropbtn']"));
		Switchtodropdown.click();
		Thread.sleep(2000);
		
		//driver.quit();
		
		
	}

}
