package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Task11 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of web driver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to website
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select select=new Select(dropdown);
        select.selectByIndex(1);
        select.deselectByIndex(2);

    }
}
