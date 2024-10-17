package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AssignmentForDatePickers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://dummy-tickets.com/buyticket");


        driver.findElement(By.xpath("(//input[@name='source[]'])[1]")).sendKeys("India");
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='suggestions-list']/li"));
        System.out.println(suggestions.size());
        Actions action = new Actions(driver);
        action.moveToElement(suggestions.get(1)).perform();
        action.click().perform();

        driver.findElement(By.xpath("(//input[@name='destination[]'])[1]")).sendKeys("Sing");
        Thread.sleep(2000);

        List<WebElement> suggestions2 = driver.findElements(By.xpath("//div[@id='onewaymain']//div[2]//ul[1]/li"));

        System.out.println(suggestions2.size());

        action.moveToElement(suggestions2.get(2)).perform();
        action.click().perform();

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();

        WebElement dropDownMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select select = new Select(dropDownMonth);
        select.selectByValue("3");

        WebElement dropDownYear = driver.findElement(By.className("ui-datepicker-year"));
        Select select2 = new Select(dropDownYear);
        select2.selectByValue("2023");

        String dateExpected = "17";

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(dateExpected)) {
                dt.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='flight_oneway_btn']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("select2-dialcodes-container")).click();

        List<WebElement> countryCode = driver.findElements(By.xpath("//ul[@id='select2-dialcodes-results']/li"));

        for (WebElement country : countryCode) {
            if (country.getText().equalsIgnoreCase("India - 91")) {
                country.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@name='contact_number']")).sendKeys("9490507355");


        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lakshmankumaddagalla@gmail.com");

        WebElement title = driver.findElement(By.xpath("(//select[@name='passanger_title[]'])[1]"));

        Select select3 = new Select(title);
        select3.selectByValue("Mr");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Lakshman KUmar");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Addagalla");

        driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();

        WebElement dropDownDobMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select select4 = new Select(dropDownDobMonth);
        select4.selectByValue("3");

        WebElement dropDownDobYear = driver.findElement(By.className("ui-datepicker-year"));
        Select select5 = new Select(dropDownDobYear);
        select5.selectByValue("1999");


        List<WebElement> doB = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
        for (WebElement dt : doB) {
            if (dt.getText().equals(dateExpected)) {
                dt.click();
            }
        }

        driver.findElement(By.xpath("//span[@role='combobox']//span[@id='select2-nationality-fh-container']")).click();

        List<WebElement> nationality = driver.findElements(By.xpath("//ul[@id='select2-nationality-fh-results']/li"));
        for (WebElement n : nationality) {
            if (n.getText().equalsIgnoreCase("India")) {
                n.click();
                break;
            }
        }
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    }

}
//

