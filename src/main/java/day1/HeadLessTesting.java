package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
        options.addArguments("incognito");


        WebDriver driver = new ChromeDriver(options);


        //  driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.id("name")).sendKeys("Dharani Dirisala");

        System.out.println(driver.getTitle());
    }
}
