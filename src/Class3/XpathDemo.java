package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //greate an instance of web driver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        // open on the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //find the username
        WebElement username= driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("tester");
        //find thepassword
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");
        //clear the username text box using method clear()
        username.clear();

        //to get the text username  which is beside the username text box

        WebElement usernameText= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //get the text password which is beside the password text box
        WebElement passwordText= driver.findElement(By.xpath("//label[text()='Password:']"));
        String pssText= passwordText.getText();
        System.out.println(pssText);

    }

}