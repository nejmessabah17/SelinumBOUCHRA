package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElement {
    public static void main(String[] args) {
        // connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // initate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        // open facebook.com
        driver.get("https://www.facebook.com");
  //send in the username
        driver.findElement(By.id("email")).sendKeys("bouchra");
// send the password
        driver.findElement(By.name("pass")).sendKeys("Abracadabra");
        //click on the button create new account
        driver.findElement(By.linkText("create new account")).click();
        //click on forgotten password
        driver.findElement(By.partialLinkText("password")).click();
        driver.quit();

    }
}
