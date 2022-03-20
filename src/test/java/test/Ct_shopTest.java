package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.Ct_shopHome;
import page.Ct_sporetiKombinovani;
import page.Ct_sporetiPage;

public class Ct_shopTest extends BaseTest {
    Ct_shopHome ct_shopHome;
    Ct_sporetiPage ct_sporetiPage;
    Ct_sporetiKombinovani ct_sporetiKombinovani;



    @Before
    public void setUpTest(){
        ct_shopHome = new Ct_shopHome();
        ct_sporetiPage = new Ct_sporetiPage();
        ct_sporetiKombinovani = new Ct_sporetiKombinovani();
    }
    @Test
    public void ct_shopTest(){
        ct_shopHome.clickButtonPrihvati()
                   .clickSviProizvodi();
        ct_sporetiPage.clickKombinovaniSporeti();
        ct_sporetiKombinovani.clickCheckboxBekoFilter();
        ct_sporetiKombinovani.clickCheckboxGorenjeFilter();
        js.executeScript("window.scrollBy(0,900)");


    }
}
