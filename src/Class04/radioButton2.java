package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButton2 {
    public static void main(String[] args) {

        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //find all the age group radio buttons
        //the xpath here is common to all the webElements that have age group
        List<WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //
        for (WebElement radioBtn:radioBtns){
            String age=radioBtn.getAttribute("value");
            //
            if (age.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }
        }

    }
}
