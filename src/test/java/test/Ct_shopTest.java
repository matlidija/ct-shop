package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.Ct_shopHome;
import page.Ct_sporetiPage;

public class Ct_shopTest extends BaseTest {
    Ct_shopHome ct_shopHome;
    Ct_sporetiPage ct_sporetiPage;



    @Before
    public void setUpTest(){
        ct_shopHome = new Ct_shopHome();
        ct_sporetiPage = new Ct_sporetiPage();
    }
    @Test
    public void ct_shopTest(){
        ct_shopHome.clickButtonPrihvati()
                   .clickSviProizvodi();
        ct_sporetiPage.clickKombinovaniSporeti();

    }
}
