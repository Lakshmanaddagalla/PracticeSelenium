package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandle3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.id("name")).sendKeys("Lakhshman");

       // String parentWindowHandle = driver.getWindowHandle();
        //System.out.println("Parent Window Handle ID is: " + parentWindowHandle);

        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windID = driver.getWindowHandles();

        List<String> ids = new ArrayList<>(windID);
        String parent =ids.get(0);
        String child =ids.get(1);
        System.out.println("Child Window Handle ID is: " + child);
        System.out.println("Parent Window Handle ID is: " + parent);



       /* for(String windowHandle : windID){

            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.findElement(By.id("firstName")).sendKeys("Lakhshman");
            }

        */

            System.out.println("Window Handle is: " +driver.getTitle());



        }


    }
