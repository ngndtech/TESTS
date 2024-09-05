package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassEnter extends BaseDriver {

    @Test
    public void Test1()
    {
        browser.get("https://www.amazon.com.tr/");
        MyFunc.Wait(2);

        WebElement webSelect = browser.findElement(By.id("searchDropdownBox"));
        // bu element eğer SELECT tag ile başlayan web elementi ise
        // bu SELECT nesnesine CAST yapıp  öyle kullanabiliriz

        // elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürüyoruz
        Select ddMenu = new Select(webSelect);

        // yani bu işlemi altta bulunan adımların her hangi biriyle yapabiliriz
        // ister BYIndex ister ByValue ister ByVisibleText ile yapabiliriz
        // aralarına koyduğum bekletmeler testi yaparken net görebilmek için
        ddMenu.selectByIndex(2);
        MyFunc.Wait(2);
        ddMenu.selectByIndex(15);
        MyFunc.Wait(2);
        ddMenu.selectByValue("search-alias=electronics");
        MyFunc.Wait(2);
        ddMenu.selectByVisibleText("Evcil Hayvan Malzemeleri");
        MyFunc.Wait(2);

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for (WebElement secenek : ddMenu.getOptions())
            System.out.println("secenek.getText() = " + secenek.getText());


        BekleKapat();
    }
}
