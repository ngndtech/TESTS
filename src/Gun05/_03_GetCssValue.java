package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCssValue {
    public static void main(String[] args) {
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.snapdeal.com/");

        WebElement searchBox = browser.findElement(By.id("inputValEnter"));

        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        System.out.println("searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println("searchBox.getCssValue(\"background\") = " + searchBox.getCssValue("background"));
        System.out.println("searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println("searchBox.getCssValue(\"border\") = " + searchBox.getCssValue("border"));
        System.out.println("searchBox.getCssValue(\"font-family\") = " + searchBox.getCssValue("font-family"));

        MyFunc.Wait(3);
        browser.quit();




    }
}
