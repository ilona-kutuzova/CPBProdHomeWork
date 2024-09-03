package Prod.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeaturedProducts {

    WebDriver driver;
    WebDriverWait wait;
    public FeaturedProducts(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 45);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "web-pixel-sandbox-CUSTOM-shopify-custom-pixel-LAX-4f5d3379wf2d89af0p0a848e1am9c1cde7c")
    @CacheLookup
    WebElement iFrame;

    @FindBy(xpath = "/html/body/main/section[2]/div/div/slider-component/ul/li[8]/div/div/div[2]/div[1]/h3/a")
    @CacheLookup
    WebElement phoneCaseProduct;

//    public void switchToIFrame() {
//        driver.switchTo().frame(iFrame);
//    }

    public void clickOnPhoneCaseProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(phoneCaseProduct));
        phoneCaseProduct.click();
    }
}
