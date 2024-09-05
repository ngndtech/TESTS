package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {
    public static void main(String[] args) {

        browser.navigate().to("https://testpages.eviltester.com/styled/index.html");
        System.out.println("browser.getTitle() = " + browser.getTitle());
        System.out.println("browser.getCurrentUrl() = " + browser.getCurrentUrl());
        MyFunc.Wait(1);

        WebElement link = browser.findElement(By.id("alerttest"));
        link.click();
        System.out.println("browser.getTitle() = " + browser.getTitle());
        System.out.println("browser.getCurrentUrl() = " + browser.getCurrentUrl());
        MyFunc.Wait(1);

        browser.navigate().back();
        System.out.println("browser.getTitle() = " + browser.getTitle());
        System.out.println("browser.getCurrentUrl() = " + browser.getCurrentUrl());
        MyFunc.Wait(1);

        browser.navigate().forward();
        System.out.println("browser.getTitle() = " + browser.getTitle());
        System.out.println("browser.getCurrentUrl() = " + browser.getCurrentUrl());


        BekleKapat();
    }
}
