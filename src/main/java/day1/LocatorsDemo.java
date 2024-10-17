package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //locators are used to identify the element in a webpage.by using findElement and findElements methods to identify unique.
        //we are having 8 types of locators.
        // id,name,className,tagName,linkText,partialLinkText,Css,Xpath.

        //1)Find element Using name locator.

      WebElement searchField =driver.findElement(By.name("search"));
      searchField.sendKeys("Mac");

      WebElement element=driver.findElement(By.id("header-cart"));

      if(element.isDisplayed());
        {
            System.out.println("element is displayed");

        }
        {
            System.out.println("element is not displayed");
        }


    }
}
