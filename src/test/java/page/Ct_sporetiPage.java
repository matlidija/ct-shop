package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ct_sporetiPage extends BaseTest {
    public Ct_sporetiPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Kombinovani šporeti")
    WebElement kombinovaniSporeti;

    public void clickKombinovaniSporeti(){
        wdwait.until(ExpectedConditions.elementToBeClickable(kombinovaniSporeti));
        kombinovaniSporeti.click();
    }
}
