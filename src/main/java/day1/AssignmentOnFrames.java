package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnFrames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://ui.vision/demo/webtest/frames/");

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("HY Mammu");

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));

        driver.switchTo().frame(frame2);

        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Hy Gayathri");

        driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();

        Thread.sleep(3000);

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@data-load-time='1728221250407']"));
        driver.switchTo().frame(frame3);
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.xpath("(//*[@id='header']/div/div[2]/ul/li[1]/a/span"));

//        Actions action = new Actions(driver);
//        action.moveToElement(element).perform();
        element.click();
    }
}
