package tests.day20;

import org.testng.annotations.Test;

public class C05_ExceliMapeYukleme {


    @Test
    public void test01(){

        //dosya yolu ve sayfa ismi verilen vir excel sheet i map olarak kaydeden
        // reusable bir method olusturalim


        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";



        ReusableMethods.mapOlustur(path,sayfaAdi);




    }


}
