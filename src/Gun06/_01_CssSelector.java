package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {


    @Test
    public void Test1()
    {
        browser.navigate().to("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Wait(1);

        WebElement business = browser.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();
        MyFunc.Wait(1);

        WebElement dropDownDiscover=browser.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscover.click();
        MyFunc.Wait(1);

        WebElement optionOnlineAdvertising=browser.findElement(By.cssSelector("[id$='_4588']> :nth-child(4)"));
        optionOnlineAdvertising.click();
        MyFunc.Wait(1);

        WebElement everyDayRadio=browser.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        everyDayRadio.click();
        MyFunc.Wait(1);

        WebElement goodRadio =browser.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        goodRadio.click();
        MyFunc.Wait(1);

        WebElement dropdownHowLong =browser.findElement(By.cssSelector("[id$='_4597']"));
        dropdownHowLong.click();
        MyFunc.Wait(1);



        WebElement option3 =browser.findElement(By.cssSelector("select[id$='_4597']> :nth-child(4)"));
        option3.click();
        MyFunc.Wait(1);

        goodRadio.click();





     BekleKapat();
    }

}
