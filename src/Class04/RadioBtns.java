package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {


        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //click on the radio button male
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enabled
        boolean isEnableMale = maleBtn.isEnabled();
        System.out.println("the radio button male is enabled " + isEnableMale);
        //check if the radio button is selected
        boolean isDisplayedMale=maleBtn.isEnabled();
        System.out.println("the radio button male is displayedMale "+isDisplayedMale);

        boolean isSelectedmale = maleBtn.isSelected();
        System.out.println("the male button is selected " + isSelectedmale);
        //if the radio button is not selected click on it
        if (!isSelectedmale) {
            maleBtn.click();

        }
        //check if the radio button is selected after the click
            isSelectedmale=maleBtn.isSelected();
            System.out.println("the status of  selected is "+isSelectedmale);
    }
    }

