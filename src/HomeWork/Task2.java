package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        //go to
       driver.get(" http://practice.syntaxtechs.net/basic-first-form-demo.php") ;
       driver.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("Hello");
       driver.findElement(By.xpath("//input[@id=\"sum1\"]")).sendKeys("1000");
       driver.findElement(By.xpath("//input[@id=\"sum2\"]")).sendKeys("2000");
       driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
      // driver.findElement()
    }
}
