package Prod.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginMode {

    WebDriver driver;
    WebDriverWait wait;
    public LoginMode(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 45);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "password")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/form/button")
    @CacheLookup
    WebElement enterButton;

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickEnterButton() {
        this.enterButton.click();
    }
}

