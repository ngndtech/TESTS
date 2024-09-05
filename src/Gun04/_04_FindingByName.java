package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://form.jotform.com/221934510376353 ");

        browser.manage().window().maximize(); // Ekranı max yani Tam Ekran yapıyor


        WebElement namebox = browser.findElement(By.name("q8_name[first]"));
        namebox.sendKeys("L O R D ");
        MyFunc.Wait(1);

        WebElement lastbox = browser.findElement(By.name("q8_name[last]"));
        lastbox.sendKeys("E N G İ N");
        MyFunc.Wait(1);
        lastbox.clear(); // Kutucuğu temizler, burada kullanılmasa idi, E N G İ NWİNNER aynı yerde yazacaktı
        lastbox.sendKeys("WİNNER");

        WebElement btnSubmit = browser.findElement(By.id("input_2"));
        btnSubmit.click();
        MyFunc.Wait(1);

        MyFunc.Wait(5);
        browser.quit();

    }
}
