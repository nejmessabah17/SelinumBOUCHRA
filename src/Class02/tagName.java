package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
       // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
     // go to amazon.com
        driver.get("https://www.amazon.com/");
        //print all the links in the amazon.com

    }
}