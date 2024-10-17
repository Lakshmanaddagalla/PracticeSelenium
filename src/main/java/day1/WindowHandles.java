package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class WindowHandles {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();

        URL myUrl = new URL("https://testautomationpractice.blogspot.com/");
        driver.navigate().to(myUrl);

        driver.manage().window().maximize();

        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

        List<WebElement> elements = driver.findElements(By.id("wikipedia-search-result-link"));
        System.out.println(elements.size());

       for(int i=0; i<elements.size(); i++){
            elements.get(i).click();
        }



    }

}
