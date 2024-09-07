package SFSeleniumAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigatetoSFDC extends BaseClass
{
public void launchbrowser() 
{
	
}

public void GetURL() 
{
	
}

public void maximizebrowser() 
{
	
}

public void ClickElement(WebElement Login) {
    driver.findElement(By.xpath("//a[@text()='Log in']"));
    Login.click();
}
}



