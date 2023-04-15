package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverTask {

    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //greate an instance of web driver
        WebDriver driver=new ChromeDriver();
        // open on the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the screen
        driver.manage().window().maximize();

        //send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
        //send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on the login button
        driver.findElement(By.className("button")).click();
    }
}
