package tests.day16;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {




    @Test
    public void test01() throws InterruptedException {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/ ");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookie.click();
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passaBox.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());

       Thread.sleep(3000);
      // Driver.closeDriver();

    }

}
