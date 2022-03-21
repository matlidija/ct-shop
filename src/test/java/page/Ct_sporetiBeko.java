package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ct_sporetiBeko extends BaseTest {
    public Ct_sporetiBeko(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title=\"FSE64320DW kombinovani šporet\"]")
    WebElement linkFSE64320DW;
    @FindBy(xpath = "//button[@class=\"ub-emb-close\"]")
    WebElement closeIframe;
    @FindBy(xpath = "//td[contains(text(),\"Metalna fioka\")]")
    WebElement textFioka;

    public String textFiokaIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(textFioka));
        return textFioka.getText();
    }

    public boolean textFiokaIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(textFioka));
        return textFioka.isDisplayed();
    }


    public void clickCloseIframe(){
        wdwait.until(ExpectedConditions.elementToBeClickable(closeIframe));
        closeIframe.click();
    }

    public void clickLinkFSE64320DW(){
        wdwait.until(ExpectedConditions.elementToBeClickable(linkFSE64320DW));
        linkFSE64320DW.click();
    }

}
