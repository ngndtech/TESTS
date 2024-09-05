package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver browser=new ChromeDriver();
        browser.get("https://form.jotform.com/221934510376353");

        //        sublabel_8_first
        //        sublabel_8_last

        WebElement labelFirstName=browser.findElement(By.id("sublabel_8_first"));
        System.out.println(labelFirstName.getText()); // Web elemntin ekranda çıkan yazısı

        WebElement labelLastName=browser.findElement(By.id("sublabel_8_last"));
        System.out.println(labelLastName.getText()); // Web elemntin ekranda çıkan yazısı


        MyFunc.Wait(3);
        browser.quit();



    }
}
