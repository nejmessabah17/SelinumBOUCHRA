package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.
        System.setProperty("webDriver.chrome.driver","Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //open the website google.com
        driver.get("https://www.facebook.com/");
    //get the current url that is there in the browser
    String URL= driver.getCurrentUrl();
    //print out the url
        System.out.println(URL);
        // get the title of the webpage
        String title = driver.getTitle();
        //print the title of the page
        System.out.println("the title of the page is "+title);
        //slow down for 3 seconds
        Thread.sleep(3000);
// close the browser
        driver.quit();
    }
}
