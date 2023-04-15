package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        //   goto syntax projects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1040753379%3A1678243034247384&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHflrXv7TPwReG5MghHe1hX9clEzJDJHjyMEEO2v2QaDRd07KKxmp-mWiSFenva6K1yuMhh3");


                //click on the help button
                driver.findElement(By.xpath("//a[text()='Help']")).click();
        //click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        //get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();

        System.out.println(parentWindowHandle);
        // get window handles of all the window that have been opened up

        Set<String> windowHandles = driver.getWindowHandles();
        //print all the window handles
        for (String wh : windowHandles) {
            System.out.println(wh);

            //switch the focus of the driver to help window
            driver.switchTo().window(wh);

            //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("")){
                break;


            }

        }
        //to verify we switched to the right window;
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);
    }
}
