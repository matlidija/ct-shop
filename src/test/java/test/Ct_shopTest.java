package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.Ct_shopHome;

public class Ct_shopTest extends BaseTest {
    Ct_shopHome ct_shopHome;


    @Before
    public void setUpTest(){
        ct_shopHome = new Ct_shopHome();
    }
    @Test
    public void ct_shopTest(){
        ct_shopHome.clickButtonPrihvati();

    }
}
