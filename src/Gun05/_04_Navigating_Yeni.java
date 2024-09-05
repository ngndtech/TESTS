package Gun05;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating_Yeni extends BaseDriver {

    @Test
    public void Test1()
    {
        browser.navigate().to("https://testpages.eviltester.com/styled/index.html");
        MyFunc.Wait(1);

        WebElement link = browser.findElement(By.id("alerttest"));
        link.click();
        MyFunc.Wait(1);

        browser.navigate().back();
        MyFunc.Wait(1);

        browser.navigate().forward();

        Assert.assertTrue("Beklenen Sayfaya Ulaşılamadı" ,
                browser.getCurrentUrl().equals("https://testpages.eviltester.com/styled/index.html"));

        BekleKapat();
    }

}
