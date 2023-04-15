package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        //click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        //as the element that contains text becomes
        //time.so first we need to implement
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        //Once the element is visible then get the text
        WebElement text= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomText=text.getText();
        System.out.println(WelcomText);
    }
}
