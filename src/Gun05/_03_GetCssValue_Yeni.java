package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue_Yeni extends BaseDriver {
    public static void main(String[] args) {
        browser.get("https://www.snapdeal.com/");

        WebElement searchBox = browser.findElement(By.id("inputValEnter"));

        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        System.out.println("searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println("searchBox.getCssValue(\"background\") = " + searchBox.getCssValue("background"));
        System.out.println("searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println("searchBox.getCssValue(\"border\") = " + searchBox.getCssValue("border"));
        System.out.println("searchBox.getCssValue(\"font-family\") = " + searchBox.getCssValue("font-family"));

        BekleKapat();
    }
}
