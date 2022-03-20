package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ct_sporetiKombinovani extends BaseTest {
    public Ct_sporetiKombinovani (){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//label[@for=\"filter_data_brend_142\"]")
    WebElement checkboxGorenjeFilter;
    @FindBy(xpath = "//label[@for=\"filter_data_brend_42\"]")
    WebElement checkboxBekoFilter;

    public void clickCheckboxBekoFilter(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkboxBekoFilter));
        checkboxBekoFilter.click();
    }

    public void clickCheckboxGorenjeFilter(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkboxGorenjeFilter));
        checkboxGorenjeFilter.click();
    }

}
