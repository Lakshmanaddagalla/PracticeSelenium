package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement source1 = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement target1 = driver.findElement(By.xpath("//table[@id='table4']//tbody//div[@id='shoppingCart1']"));

        Actions action = new Actions(driver);
        action.dragAndDrop(source1, target1).perform();


        driver.findElement(By.xpath(""));

    }
}
