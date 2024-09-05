package Gun08;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
public class _01_ElemaninStatusu extends BaseDriver {

    @Test
    public void Test1()
    {
        browser.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali = browser.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // Görünür durumda mı ?
        System.out.println("sali.isEnabled() = " + sali.isEnabled()); // etkin  durumda mı ?
        System.out.println("sali.isSelected() = " + sali.isSelected()); // çekli ve seçili durumda mı ?

        sali.click();
        System.out.println("sali.isSelected() = " + sali.isSelected()); // şimdi true oldu çünkü click yaptık

        WebElement cumartesi = browser.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed()); // true
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled()); // false
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected()); // false

        Assert.assertTrue(cumartesi.isDisplayed() == true);

        BekleKapat();



    }
}
