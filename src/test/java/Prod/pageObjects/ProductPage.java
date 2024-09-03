package Prod.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 45);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/span[20]/div")
    @CacheLookup
    WebElement productModel;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[5]/div[2]/div[2]/span[3]/div")
    @CacheLookup
    WebElement productDesign;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[6]/div[2]/div[2]/div/div/div/input")
    @CacheLookup
    WebElement uploadImageField;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[1]/input")
    @CacheLookup
    WebElement text1;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[2]/input")
    @CacheLookup
    WebElement text2;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[8]/div[2]/div[2]/span[2]/span/div[1]")
    @CacheLookup
    WebElement pickColor;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[9]/div[2]/div[2]/div/div[3]/div[1]/span/div[1]/img")
    @CacheLookup
    WebElement ringHolder;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/button[4]")
    @CacheLookup
    WebElement addToCartButton;

    public void selectProductModel() {
        wait.until(ExpectedConditions.elementToBeClickable(productModel));
        productModel.click();
    }

    public void selectProductDesign() {
        wait.until(ExpectedConditions.elementToBeClickable(productDesign));
        productDesign.click();
    }

    public void uploadImage() {
        String filePath = "/Users/ilonakutuzova/IdeaProjects/CPBProdHomeWork/src/test/java/Prod/testData/cat_image.jpeg";
        uploadImageField.sendKeys(filePath);
    }

    public void enterFirstText() {
        text1.sendKeys("First Text");
    }

    public void enterSecondText() {
        text2.sendKeys("Second Text");
    }

    public void selectColor() {
        pickColor.click();
    }

    public void selectRingHolder() {
        ringHolder.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div/div[2]/button")
    @CacheLookup
    WebElement checkoutButton;

    public void clickCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutButton.click();
    }

}
