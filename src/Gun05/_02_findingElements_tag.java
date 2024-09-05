package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_findingElements_tag {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://www.amazon.com.tr/");

        List<WebElement> linkler = browser.findElements(By.tagName("a"));

        System.out.println("linkler.size() = " + linkler.size());

        for (WebElement e : linkler){

            if (!e.getText().equals("") && e.getAttribute("href")!= null)
                System.out.println("e.getText() = " + e.getText());
        }
        browser.quit();
    }
}
