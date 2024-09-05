package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = browser.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        WebElement Link2 = browser.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("Link2.getText() = " + Link2.getText());

        MyFunc.Wait(3);
        browser.quit();





    }
}
