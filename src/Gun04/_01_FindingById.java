package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _01_FindingById {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://form.jotform.com/221934510376353");
        MyFunc.Wait(1);

        WebElement namebox = browser.findElement(By.id("first_8"));
        namebox.sendKeys("L O R D ");
        MyFunc.Wait(1);

        WebElement lastbox = browser.findElement(By.id("last_8"));
        lastbox.sendKeys("E N G İ N");

        MyFunc.Wait(5);
        browser.quit();



    }
}
