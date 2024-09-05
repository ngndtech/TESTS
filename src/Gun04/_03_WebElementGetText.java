package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://form.jotform.com/221934510376353");

        WebElement labelFirstName = browser.findElement(By.id("first_8"));
        labelFirstName.sendKeys("LORD");

        WebElement labelLastName = browser.findElement(By.id("last_8"));
        labelLastName.sendKeys("ENGİN");



        MyFunc.Wait(5);
        browser.quit();
    }
}
