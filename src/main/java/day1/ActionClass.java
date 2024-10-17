package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
//enter email id
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lakshmankumaraddagalla@gmail.com");
//click on Next button
                driver.findElement(By.xpath("//span[.='Next']")).click();
        Thread.sleep(3000);
//enter password id
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Fusion@2412 ");
//click on Next button
        driver.findElement(By.xpath("//span[.='Next']")).click();
        Thread.sleep(10000);

        WebElement mailText = driver.findElement(By.xpath("(//tr[@role='row'])[1]"));
        System.out.println(mailText.getText());

        Actions action = new Actions(driver);
        action.contextClick(mailText).perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='J-N-JX aDE aDD'])[1]")).click();
    }
}
