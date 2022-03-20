package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ct_shopHome extends BaseTest {
    public Ct_shopHome(){
        PageFactory.initElements(driver, this);
    }

    private static final By sviproizvodiLink = By.xpath("//span[@class=\"am-opener sharkskin-collapse\"]");
    private static final By tehnikaLink = By.xpath("//i[@class=\"img-info pos-9\"]");
    private static final By sporetiLink = By.linkText("Šporeti");

    @FindBy(xpath = "//button[contains(text(), \"Prihvatam\")]")
    WebElement buttonPrihvati;

    public void clickSviProizvodi(){
        WebElement elementOne = driver.findElement(sviproizvodiLink);
        WebElement elementTwo = driver.findElement(tehnikaLink);
        Actions action = new Actions(driver);
        action.moveToElement(elementOne);
        action.moveToElement(elementTwo);
        action.build().perform();
        driver.findElement(sporetiLink).click();
    }

    public Ct_shopHome clickButtonPrihvati (){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonPrihvati));
        buttonPrihvati.click();
        return this;
    }
}
