package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {


        WebDriver browser = new ChromeDriver();
        browser.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = browser.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));

        MyFunc.Wait(3);
        browser.quit();




    }
}
