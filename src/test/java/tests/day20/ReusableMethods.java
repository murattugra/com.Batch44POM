package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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


    public static Map<String,String> mapOlustur(String path, String sayfaAdi) {


        Map<String,String> excelMap=new TreeMap<>();

        Workbook workbook=null;

        // ilk adim excele ulasmak

        try {
            FileInputStream fis=new FileInputStream(path);
             workbook=WorkbookFactory.create(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }


        int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();

        String key="";
        String value="";

        for (int i = 0; i <satirSayisi ; i++) {
            // ikici adim tablodaki hucreleri map a uygun hale donusturmek

            key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value=workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()+
                  ", "+  workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString()+
                  ", "+  workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();
                    // ucuncu
            excelMap.put(key,value);
        }

        return  excelMap;



    }
}
