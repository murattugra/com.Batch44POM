package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

        // POM a arkli class lara farkli sekilde ulasilmasi benimsenmistir
        // Driver class i icin static yontesi kullaniyoruz
        // Page class lari icn obje uzerinden kullanilmasi tercih edilmistir

    @Test
    public void Test01(){

        // Amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // arama kutusuna Nutell yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //Atama sonuclarinin Nutella icerdigini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(actualSonucStr.contains("Nutella"));


        Driver.closeDriver();

    }

    @Test
    public void test02(){
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // java icin aram ayapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java"+Keys.ENTER);
        // sonucun java icerdiginin test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("java"));
        Driver.closeDriver();

    }


}
