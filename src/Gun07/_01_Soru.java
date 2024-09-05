package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
//    Assert.assertTrue(urunFiyatToplamlam == itemTotal)
public class _01_Soru extends BaseDriver {

    @Test
    public void Test1()
    {
        browser.get("https://www.saucedemo.com/");
        MyFunc.Wait(2);

        WebElement username = browser.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("standard_user");
        MyFunc.Wait(1);

        WebElement passWord = browser.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("secret_sauce");
        MyFunc.Wait(1);

        WebElement loginButton = browser.findElement(By.xpath("//input[@name='login-button']"));
        loginButton.click();
        MyFunc.Wait(2);

        WebElement sauce = browser.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        sauce.click();
        MyFunc.Wait(2);

        WebElement addCart = browser.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addCart.click();
        MyFunc.Wait(2);

        WebElement comeBack = browser.findElement(By.xpath("//button[@id='back-to-products']"));
        comeBack.click();
        MyFunc.Wait(1);

        WebElement sauceBolt = browser.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        sauceBolt.click();
        MyFunc.Wait(2);

        WebElement addCart0 = browser.findElement(By.xpath("//button[@name='add-to-cart']"));
        addCart0.click();
        MyFunc.Wait(2);

        WebElement basket = browser.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        basket.click();
        MyFunc.Wait(2);

        WebElement checkUut = browser.findElement(By.xpath("//button[@id='checkout']"));
        checkUut.click();
        MyFunc.Wait(2);

        WebElement firstname = browser.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Engin");
        MyFunc.Wait(1);

        WebElement lastName = browser.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Lord");
        MyFunc.Wait(1);

        WebElement postCode = browser.findElement(By.xpath("//input[@id='postal-code']"));
        postCode.sendKeys("1453");
        MyFunc.Wait(1);

        WebElement Continue = browser.findElement(By.xpath("//input[@id='continue']"));
        Continue.click();
        MyFunc.Wait(2);





        BekleKapat();

    }
}
