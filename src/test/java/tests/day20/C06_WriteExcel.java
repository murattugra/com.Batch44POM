package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {


    @Test
    public void  test01() throws IOException {

        // ulkeler exceline 5. sutun olarak NUFUS sutunu ekleyelim
        // 3- dosyada yapmak istedigiiz degisiklikleri

        //dosyaya ulsalim
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        //class da calismak icin dosyanin bir kopyasi olan bir workbook olusturalim
        // ulkeler exceline 5. sutun olarak NUFUS sutunu ekleyelim
        Workbook workbook= WorkbookFactory.create(fis);
        // 3- dosyada yapmak istedigiiz degisiklikleri
        // kopya workbook ta yapalim

        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        // 3. satirdaki ulkenin nufusunu 1000000 yapalim

        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

    //*********    // 4/ kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);


    }

}
