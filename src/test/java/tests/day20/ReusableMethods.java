package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ReusableMethods

{
    // bir method olusturalim
    // dosya yolu ve satir, hucre indexini verince hucre bilgisini dondursun



    public static Cell hucreGetir(String path,String sayfaIsmi,int satirindex, int hucreindex){

        Cell cell=null;

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirindex).getCell(hucreindex);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return cell;

    }


    public static void mapOlustur(String path, String sayfaAdi) {


        Map<> excelMap=new HashMap();




    }
}
