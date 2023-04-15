package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //   goto facebook.com
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("//*[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        WebElement text=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        String title= driver.getTitle();
        System.out.println(title);
        System.out.println("text is displayed " +text.isDisplayed());


    }
}
