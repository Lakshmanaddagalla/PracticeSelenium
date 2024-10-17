package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandle2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");


        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> handles = driver.getWindowHandles();

        for(String handle : handles) {
          String title  =driver.switchTo().window(handle).getTitle();
          System.out.println(title);

          if(title.equals("OrangeHRM")) {
          driver.findElement(By.name("username")).sendKeys("MAMMU");

        }

        }




/*
        List<String> handleList = new ArrayList(handles);
        String parent = handleList.get(0);
        String child = handleList.get(1);

        System.out.println("Parent Window Handle:" + parent);
        System.out.println("Child window Handle:" + child);

 */



    }
}
