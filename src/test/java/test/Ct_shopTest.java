package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.io.IOException;

public class Ct_shopTest extends BaseTest {
    Ct_shopHome ct_shopHome;
    Ct_sporetiPage ct_sporetiPage;
    Ct_sporetiKombinovani ct_sporetiKombinovani;
    Ct_sporetiBeko ct_sporetiBeko;
    Screenshot screenshot;




    @Before
    public void setUpTest(){
        ct_shopHome = new Ct_shopHome();
        ct_sporetiPage = new Ct_sporetiPage();
        ct_sporetiKombinovani = new Ct_sporetiKombinovani();
        ct_sporetiBeko = new Ct_sporetiBeko();
        screenshot = new Screenshot();

    }
    @Test
    public void ct_shopTest() throws IOException {
        ct_shopHome.clickButtonPrihvati()
                   .clickSviProizvodi();
        ct_sporetiPage.clickKombinovaniSporeti();
        ct_sporetiKombinovani.clickCheckboxBekoFilter();
        ct_sporetiKombinovani.clickCheckboxGorenjeFilter();
        js.executeScript("window.scrollBy(0,900)");
        ct_sporetiBeko.clickLinkFSE64320DW();
        ct_sporetiBeko.clickCloseIframe();
        js.executeScript("window.scrollBy(0,900)");
        Assert.assertTrue(ct_sporetiBeko.textFiokaIsDisplay());
        Assert.assertEquals("Metalna fioka", ct_sporetiBeko.textFiokaIsGet());
       screenshot.screenShotFile();





    }
}
