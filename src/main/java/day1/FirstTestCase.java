package day1;

/*
1.launch browser
2.open url
3.validate title
4.close browser


 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/");

       String title =driver.getTitle();
       System.out.println(title);
       String expected = "OpenCart - Open Source Shopping Cart Solution";
        if(title.equals(expected)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        driver.close();
    }
}
