package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.ebay.co.uk/  sayfasına gidiniz
//        2- Kategorilerden Baby seçeneğini seçiniz.
//        3- Arama butonuna tıklatınız.
//        4- Sonuçları çıktığı ekranda sol başlık
//            kısmında Baby kelimesinin geçtiğini doğrulayınız
    @Test
    public void Test1()
    {
        browser.get("https://www.ebay.co.uk/");
        MyFunc.Wait(2);

        WebElement kategori = browser.findElement(By.xpath("//select[@id='gh-cat']"));
        kategori.click();
        MyFunc.Wait(2);

        // Burada SELECT etiketli elemnti CAST yaptım
        Select kategoriMenu = new Select(kategori);
        kategoriMenu.selectByIndex(3);
        MyFunc.Wait(2);

        WebElement search = browser.findElement(By.xpath("//input[@id='gh-btn']"));
        search.click();
        MyFunc.Wait(2);

        WebElement headerText = browser.findElement(By.className("b-pageheader__text"));

        Assert.assertTrue("Aranan Kelime Bulunamadı " , headerText.getText().contains("Baby"));


        BekleKapat();
    }
}
