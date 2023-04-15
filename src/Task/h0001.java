package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class h0001 {
    public static void main(String[] args) {
        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        //   goto syntax projects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1040753379%3A1678243034247384&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHflrXv7TPwReG5MghHe1hX9clEzJDJHjyMEEO2v2QaDRd07KKxmp-mWiSFenva6K1yuMhh3");
       driver.findElement(By.xpath("//div[@role='combobox']")).click();

       List<WebElement> list = driver.findElements(By.xpath("//li[@role='option']"));

       for (int i=0;i< list.size();i++){
           String str=list.get(i).getAttribute("data-value");
           if (str.equalsIgnoreCase("ar")){
               list.get(i).click();
           }
       }
    }
}
