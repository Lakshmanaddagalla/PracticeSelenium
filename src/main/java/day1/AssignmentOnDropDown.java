package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AssignmentOnDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

        WebElement options = driver.findElement(By.id("country-list"));

        Select select = new Select(options);

        select.selectByVisibleText("USA");

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());

        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }


    }
}
