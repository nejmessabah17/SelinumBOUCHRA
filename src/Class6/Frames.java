package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        //   goto syntax projects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //switch to the iframe which contains the input box
        //method:by index
        driver.switchTo().frame(0);
        //this statement will shift the focus to the first frame
      WebElement textBox  =driver.findElement(By.xpath("//input[@id='name']"));
        //send some text
        textBox.sendKeys("abracadabra");
        driver.switchTo().defaultContent();
        WebElement text=driver.findElement(By.xpath("//h3"));

        System.out.println("the text is "+text.getText());
        driver.switchTo().frame("iframe_a");
        WebElement getLabel= driver.findElement(By.xpath("//label"));
        System.out.println("the label is "+getLabel.getText());
                //switch focus to the main page
        driver.switchTo().defaultContent();
        //3 method switch to an iframe using WebElement
        //clear what ever is written in the text box
        WebElement frame1= driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();
    }
}
