package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
    @Test
    public void Test1()
    {
        browser.get("https://www.facebook.com/");
        MyFunc.Wait(2);

        WebElement kaydol = browser.findElement(By.xpath("//a[text()='Yeni hesap oluştur']"));
        kaydol.click();
        MyFunc.Wait(2);

        WebElement firstName = browser.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Engin");
        MyFunc.Wait(2);

        WebElement lastName = browser.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("LORD");
        MyFunc.Wait(2);

        WebElement emailbox = browser.findElement(By.xpath("//input[@name='reg_email__']"));
        emailbox.sendKeys("engndlhsn@gmail.com");
        MyFunc.Wait(2);

        WebElement birthDay = browser.findElement(By.xpath("//select[@id='day']"));
        birthDay.click();

        Select day = new Select(birthDay);
        day.selectByIndex(18);
        MyFunc.Wait(2);

        WebElement birthMonth = browser.findElement(By.xpath("//select[@id='month']"));
        birthMonth.click();

        Select month = new Select(birthMonth);
        month.selectByIndex(0);
        MyFunc.Wait(2);

        WebElement birthYear = browser.findElement(By.xpath("//select[@id='year']"));
        birthYear.click();

        Select year = new Select(birthYear);
        year.selectByIndex(31);
        MyFunc.Wait(2);

        birthYear.click();


        BekleKapat();
    }
}
