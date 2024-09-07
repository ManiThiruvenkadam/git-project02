package SFSeleniumAutomationProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseClass {

	protected WebDriver driver = null;

    // Method for Launch WebBrowser
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    // Method for Get URL
    public void getURL(String url) {
        driver.get("https://developer.salesforce.com/signup");
        System.out.println(url + " is entered");
    }

    // Method for Maximize Browser
    public void maximizeBrowser() {
        driver.manage().window().maximize();
        System.out.println("Browser size maximized");
    }

    // Method for EnterText
    public void enterText(WebElement element, String data, String objectName) {
        element.sendKeys(data);
        System.out.println("Entered text into " + objectName);
    }

    // Method for Clear TextField
    public void clearText(WebElement element, String objectName) {
        element.clear();
        System.out.println("Cleared text from " + objectName);
    }

    // Method for Click Element
    public void clickElement(WebElement element) {
        element.click();
        System.out.println("Clicked on element");
    }
}
