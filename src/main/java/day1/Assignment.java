package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.sound.midi.SysexMessage;
import java.sql.Driver;
import java.util.List;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       System.out.println(driver.getTitle());

        driver.findElement(By.id("name")).sendKeys("lakshman");
        driver.findElement(By.id("email")).sendKeys("lakshman@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9490507355");
        driver.findElement(By.id("textarea")).sendKeys("Near sri chaitanya junior college,simhapuri colony Hyderabad.");


        boolean selectedOrNot = driver.findElement(By.xpath("//input[@id='male']")).isSelected();
        System.out.println(selectedOrNot);


        WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
        String name = radioButton.getAttribute("type");
        if (name.equals("radio")) {
            System.out.println("Its is radio button");
        } else {
            System.out.println("Its is not radio button");
        }


        radioButton.click();

        if (radioButton.isSelected()) {
            System.out.println("Is selected");
        } else {
            System.out.println("Is not selected");
        }



        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("tuesday")).click();

        List<WebElement> listCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(listCheckBoxes.size());


       WebElement dropDown = driver.findElement(By.id("country"));

        Select selectDropDown = new Select(dropDown);
        selectDropDown.selectByVisibleText("Canada");
        Thread.sleep(3000);
        selectDropDown.selectByIndex(2);
        Thread.sleep(2000);
        selectDropDown.selectByValue("france");


    }
}