package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {


    @Test(groups = {"miniRegression", "regression"})
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Facebook ","fake isimle girilemedigi test edildi");
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/ ");
        extentTest.info("facebook sayfasina gidildi");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookie.click();
        extentTest.info("cookies halledildi");
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passaBox.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        extentTest.info("facebook giris bilgileri faker ile dolduruldu");
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());
        extentTest.pass("girilemedigi test edildi");

        ReusableMethods.waitFor(5);
        // Driver.closeDriver();

    }
}
