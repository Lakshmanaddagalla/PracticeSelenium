package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WedDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String title = driver.getTitle();
        if (title.equals("OrangeHRM")) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

    }
}
