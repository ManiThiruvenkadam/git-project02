package firstprojectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class googlebrowsertest {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
driver.get("https://google.co.in");
WebElement search = driver.findElement(By.name("q"));
search.sendKeys("Java");
search.submit();
Thread.sleep(5000);
driver.quit();
	}
}
