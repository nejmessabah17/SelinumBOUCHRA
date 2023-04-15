package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        //   goto syntax projects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //locate the WebElement
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        //use select class
        Select sel = new Select(DD);
        //select by value
        sel.selectByValue("New Jersey");
        //select by visible text
        sel.deselectByVisibleText("Ohio");
        //to slow
        Thread.sleep(2000);
        //When it come MultiSelect Drop Down we can also deselect
        sel.deselectByVisibleText("New Jersey");

        sel.deselectByVisibleText("Ohio");
        System.out.println("The dropDown is multiple "+sel.isMultiple());


    }
}
