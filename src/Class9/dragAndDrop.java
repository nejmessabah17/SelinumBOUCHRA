package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class dragAndDrop {
    public static void main(String[] args) {

        //tel your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //go to syntax projects.com




        //  go to the website
        driver.get("https://jqueryui.com/droppable/");
    //    driver.switchTo().frame();

        //get the element which u want to drag

        WebElement draggable = driver.findElement(By.id("draggable"));

        //get the droppable element
        WebElement droppable=driver.findElement(By.id("droppable"));

        //action class
        Actions action=new Actions(driver) ;
            action.dragAndDrop(draggable,droppable).perform();



        }

        }



