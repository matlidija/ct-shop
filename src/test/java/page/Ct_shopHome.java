package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ct_shopHome extends BaseTest {
    public Ct_shopHome(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(), \"Prihvatam\")]")
    WebElement buttonPrihvati;

    public void clickButtonPrihvati (){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonPrihvati));
        buttonPrihvati.click();
    }
}
