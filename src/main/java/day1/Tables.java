package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");

        WebElement dropDown1 = driver.findElement(By.name("fromPort"));
        dropDown1.click();

        Select option = new Select(dropDown1);
        option.selectByIndex(1);

        WebElement dropDown2 = driver.findElement(By.name("toPort"));
        dropDown2.click();
        Select option2 = new Select(dropDown2);
        option2.selectByIndex(1);

        driver.findElement(By.xpath("//input[@type='submit']")).click();


        int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();

        System.out.println("Number of rows:" + rows);

        int columns = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
        System.out.println("Number of columns:" + columns);

        int total = 0;
        for (int r = 1; r < rows; r++) {
            String s = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add(s);


            System.out.println(arrayList);

        }


    }
}
