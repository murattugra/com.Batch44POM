package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {


    @Test
    public void test01() throws IOException {

        // elkeler excelindeki sayfa1 ve Sayfa2 deki satir sayilarini
        // ve kullanilan satir sayilarini bulun

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanilanSatirsayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();

        System.out.println("1. satir sayisi : "+ sayfa1SatirSayisi);
        System.out.println("1. sayfa fiziki kullanilan satir sayisi  : "+sayfa1FizikiKullanilanSatirsayisi);
        // fiziki kullanioan satir sayisi index ile deil sayma sayilari ile calisir



        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanilanSatirsayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();

        System.out.println("2. satir sayisi : "+ sayfa2SatirSayisi);
        System.out.println("2. sayfa fiziki kullanilan satir sayisi  : "+sayfa2FizikiKullanilanSatirsayisi);







    }



}
