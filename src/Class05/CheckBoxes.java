package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Class0.Maximize
        driver.manage().window().maximize();
     //   goto syntax projects.com
       driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
       /*

       // get all the checkboxes
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //for each
    //    for (WebElement checkbox:checkBoxes){
      //      String value = checkbox.getAttribute("value");
       //     if (value.equalsIgnoreCase("option-2"));
        //    checkbox.click();





        // iterate through the list
        for (int i=0;i< checkBoxes.size();i++){
            String value =checkBoxes.get(i).getAttribute("value");
           // check if this is the desired one
            // if yes click it
            //if no continue to iterate
            if (value.equalsIgnoreCase("option-2")){
                checkBoxes.get(i).click();
            }
        }

        */
      List<WebElement> checkboxes  =driver.findElements(By.xpath("//input[@class='cb1-element']"));
      for (int i=0;i< checkboxes.size();i++){
          String value=checkboxes.get(i).getAttribute("value");
          if (value.equalsIgnoreCase("Option-1")){
              checkboxes.get(i).click();

          }
      }

    }


}
