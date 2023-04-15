package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class task12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of web driver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();

        //go to website
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.findElement(By.xpath("//img[@id=\"content\"]/div/div[1]"));
    }
}
