package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement box1 = driver.findElement(By.id("field1"));
        WebElement box2 = driver.findElement(By.id("field2"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("WELCOME");

        Actions act = new Actions(driver);
        act.doubleClick(button).perform();


        String text = box2.getAttribute("value");
        if (text.equals("WELCOME")) {
            System.out.println("Successfully copied");
        }
        else
        {
            System.out.println("ed");
        }

       WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));

     WebElement target=   driver.findElement(By.xpath("//div[@id='droppable']"));

     Actions action = new Actions(driver);
     action.dragAndDrop(source,target)  .perform();


    }
}
