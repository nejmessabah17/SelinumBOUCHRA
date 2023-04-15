package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class h002 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of web driver
        WebDriver driver = new ChromeDriver();

        //max the window
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);


        //go to website
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentHandle=driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);

     driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);

   // driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]")).click();



   //    Set<String> handles =driver.getWindowHandles();
    //   for (String handle:handles){

    //   }
     //  Thread.sleep(20000);
     //  driver.quit();
    }
}
