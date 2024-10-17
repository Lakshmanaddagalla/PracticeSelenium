package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PaginationTables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");


        int rows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
        System.out.println("Number of rows " + rows);
        int columns = driver.findElements(By.xpath("//table[@id='productTable']//thead/tr[1]//th")).size();
        System.out.println("Number of columns " + columns);
        List<WebElement> checkBox = driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
        for (WebElement c : checkBox) {
            c.click();
        }

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= 3; column++) {
                String value = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + row + "]//td[" + column + "]")).getText();
                System.out.print(value + "\t");

            }
            String pagesNumber = driver.findElement(By.xpath("//ul/li/a")).getText();
            int totalPages = Integer.parseInt(pagesNumber);

            for (int p = 0; p <= totalPages; p++) {
                if (p >= 1) {
                    WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//li"));
                    active_page.click();
                }
            }
        }
        }


        }








