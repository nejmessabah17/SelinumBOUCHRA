import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
         */

        //navigate to the website
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("bouchra");
        driver.findElement(By.id("customer.lastName")).sendKeys("Nejm");
        driver.findElement(By.id("customer.address.street")).sendKeys("178 appartment c1 ");
        driver.findElement(By.id("customer.address.city")).sendKeys("Longs ");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");
        driver.findElement(By.id("")).sendKeys("");

    }

}
