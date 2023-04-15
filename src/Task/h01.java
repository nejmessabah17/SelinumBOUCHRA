package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class h01 {
    public static void main(String[] args) {
    //    tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
/*
        driver.get("https://toolsqa.com/automation-practice-switch-windows/");
        String parent= driver.getWindowHandle();
    //    System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[text()='Go back to Homepage']")).click();
        Set<String> allWindows=driver.getWindowHandles();
        //   System.out.println(driver.getWindowHandles());
       // driver.quit();

 */
        driver.get("https://geeksforgeeks.org/");
        String parent= driver.getWindowHandle();
      //  System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-24 gfg_home_page_search_card_description']")).click();
      //  System.out.println(driver.getWindowHandles());
        Set<String> allwindows=driver.getWindowHandles();
        for (String window:allwindows){
            if (window.equalsIgnoreCase(parent)){
                System.out.println(driver.getTitle());
                driver.switchTo().window(parent);
                System.out.println(driver.getTitle());
            }
        }

    }
}
