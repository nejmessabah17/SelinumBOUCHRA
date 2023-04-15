package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*public class Task2 {
    public static void main(String[] args) {
        /*
        HW2
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
         */
     /*   System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of web driver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to website
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame();
        WebElement text = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
        text.clear();
     /*   text.sendKeys("Hello World");

}

  }


      */