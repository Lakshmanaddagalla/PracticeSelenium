package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (int i = 7; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }

        driver.navigate().to("https://mypage.rediff.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

    }
}
