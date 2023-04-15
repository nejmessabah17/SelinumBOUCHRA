package HomeWork1;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
 /*   HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
            2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.
    Verify that the text "Hello World!" is now displayed on the page

  */
 public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
     //create an instance of web driver
     WebDriver driver = new ChromeDriver();
     //max the window
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     //go to website
     driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
     driver.findElement(By.xpath("//button[text()='Start']")).click();
     //driver.findElement(By.xpath(//*[@id="start"]/button)).click();

     driver.findElement(By.xpath("//div[@id='finish']")).click();

      WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
     System.out.println("text is displayed " +text.isDisplayed());


 }
}
