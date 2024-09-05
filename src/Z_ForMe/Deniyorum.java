package Z_ForMe;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Deniyorum extends BaseDriver {

    @Test
    public void Test1()
    {
        browser.get("https://form.jotform.com/221934510376353");
        MyFunc.Wait(1);

        WebElement submit = browser.findElement(By.xpath("//Button[@type='submit']"));
        submit.click();

        BekleKapat();
    }

}
