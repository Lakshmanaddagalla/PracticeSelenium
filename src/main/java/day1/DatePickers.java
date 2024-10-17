package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickers {

    public  void datePicker(WebDriver driver, String year, String month, String day) {

        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            //  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //forward
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// backword

        }

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(day)) {
                dt.click();
                break;
            }
        }


    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();

//        String year = "2020";
//        String month = "July";
//        String day = "4";
        DatePickers datePickers = new DatePickers();


       datePickers. datePicker(driver, "2020", "July", "4");
        //Method1
        // driver.findElement(By.id("datepicker")).sendKeys("17/04/1999");

        //Method2


//



    }

}

