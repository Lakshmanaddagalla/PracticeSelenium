package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.co.in/");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");

        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println(suggestions.size());

        for (WebElement options : suggestions) {


            if (options.getText().equalsIgnoreCase("Selenium")) {
                System.out.println(options.getText());

                options.click();

            }
        }

    }
}
