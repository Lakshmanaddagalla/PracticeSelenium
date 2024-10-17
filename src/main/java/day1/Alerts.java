package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        driver.findElement(By.id("alertBox")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();


        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();


        driver.navigate().back();

        driver.findElement(By.id("confirmBox")).click();

        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();

        driver.navigate().forward();

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.accept();

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert4 = driver.switchTo().alert();
        alert4.sendKeys("Hy lakshman");
        Thread.sleep(2000);
        alert4.accept();

        System.out.println(driver.findElement(By.id("result")).getText());

        driver.navigate().back();

        //using Explicit wait
        driver.findElement(By.id("promptBox")).click();

      Alert alert5= myWait.until(ExpectedConditions.alertIsPresent());
      System.out.println(alert5.getText());
      alert5.sendKeys("Hy Buddy");
      alert5.accept();

      System.out.println(driver.findElement(By.id("output")).getText());




    }
}
