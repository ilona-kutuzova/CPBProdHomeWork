package Prod.testCases;

import Prod.pageObjects.LoginMode;
import Prod.pageObjects.FeaturedProducts;
import org.testng.annotations.Test;

public class CreateProductTest extends BaseClass {

    @Test
    public void createProduct() {

        driver.get(stageURL);
        logger.info("open prod site");

        LoginMode loginMode = new LoginMode(driver);
        FeaturedProducts featuredProducts = new FeaturedProducts(driver);

        loginMode.enterPassword("12345");
        logger.info("entered password");

        loginMode.clickEnterButton();
        logger.info("clicked on enter button");

//        featuredProducts.switchToIFrame();
//        logger.info("switched to IFrame");

        featuredProducts.clickOnPhoneCaseProduct();
        logger.info("clicked on phone case");

    }
}
