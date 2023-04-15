package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of web driver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //go to facebook
        driver.get("https://www.facebook.com/");
        //click on the button create account using css selector
 WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        //click on the button
        createNewBtn.click();
        //put a sleep statement so that the browser can open up to window which contains the element
Thread.sleep(1000);
        //fill in the first Name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abracadabra");

    }
}
