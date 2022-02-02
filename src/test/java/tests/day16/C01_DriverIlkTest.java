package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {


    @Test
    public  void test01(){
        // amazona a gidelim
        Driver.getDriver().get("https://www.amazon.com");// getDriver() metodunu her calistirdigimizda yeni sekme  sayfa acar
        // amazona gittigimizi test edelim

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
            Driver.driver.manage().window().minimize();
            Driver.closeDriver();
    }


    @Test
    public void test02(){
        // bestbuy anasayfasina gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        // bestbuy a gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("best"));
        Driver.closeDriver();

    }



}
