package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingDatePickers {

    public static void datePicker(WebDriver driver, String date) {

        WebElement Month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select select = new Select(Month);
        select.selectByValue("10");

        WebElement Year = driver.findElement(By.className("ui-datepicker-year"));
        Select select1 = new Select(Year);
        select1.selectByValue("2024");


        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }


    }


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

        driver.findElement(By.id("product_549")).click();

        driver.findElement(By.id("travname")).sendKeys("Lakshman kumaaaaaaar");

        driver.findElement(By.id("travlastname")).sendKeys("Addagalla");

        // driver.findElement(By.id("dob")).sendKeys("17/04/1999");
        driver.findElement(By.id("sex_1")).click();

        driver.findElement(By.id("fromcity")).sendKeys("Hyderabad");

        driver.findElement(By.id("tocity")).sendKeys("Rajahmundry");

        driver.findElement(By.id("departon")).click();

        datePicker(driver, "17");

        driver.findElement(By.id("select2-reasondummy-container")).click();

        List<WebElement> purpose = driver.findElements(By.xpath("//ul[@id='select2-reasondummy-results']//li"));

        for (WebElement p : purpose) {
            if (p.getText().equals("Visa application")) {
                p.click();
                break;
            }
        }

        driver.findElement(By.id("deliverymethod_1")).click();

        driver.findElement(By.id("billing_phone")).sendKeys("9490507355");

        driver.findElement(By.id("billing_email")).sendKeys("lakshmanaddagalla@gmail.com");

//        driver.findElement(By.xpath("select2-billing_country-container")).click();
//
//        List<WebElement> country = driver.findElements(By.xpath("//ul[@id='select2-billing_country-results']/li"));
//
//        for (WebElement d : country) {
//            if (d.getText().equals("India")) {
//                d.click();
//                break;
//            }
//        }
        driver.findElement(By.id("billing_address_1")).sendKeys("Near sri chaitanya college simhapuri colony,spatial sapphire 504");
        driver.findElement(By.id("billing_city")).sendKeys("Hyderabad");

        driver.findElement(By.id("select2-billing_state-container")).click();

        List<WebElement> state = driver.findElements(By.xpath("//ul[@id='select2-billing_state-results']//li"));

        for (WebElement d : state) {
            if (d.getText().equals("Andhra Pradesh")) {
                d.click();
                break;
            }
        }
        driver.findElement(By.id("billing_postcode")).sendKeys("500090");


        WebElement submit = driver.findElement(By.id("place_order"));

        Actions actions = new Actions(driver);
        actions.moveToElement(submit).click().perform();


        WebElement icon = driver.findElement(By.id("solar:shop-2-bold"));

        if (icon.isDisplayed()) {
            System.out.println("Process is passed");
        } else {
            System.out.println("Process is failed");
        }

    }

}
