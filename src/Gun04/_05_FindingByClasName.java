package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClasName {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("tps://form.jotform.com/221934510376353");

        WebElement element = browser.findElement(By.className("form-sub-label"));
        System.out.println("Element Name " + element.getText());
          // findElement:  locator birden fazla elemanı işaret ediyorsa bile, ilkini bulur

        // Birden fazla element bulma : Bütün elemanları almak için findElemenS kullanılır
        List<WebElement> elementler = browser.findElements(By.className("form-sub-label"));

        for (WebElement e : elementler)
            System.out.println("e = " + e.getText());

        System.out.println("elementler.size() = " + elementler.size());


        MyFunc.Wait(3);
        browser.quit();



    }
}
