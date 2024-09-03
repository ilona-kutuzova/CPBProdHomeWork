package Prod.testCases;

import Prod.pageObjects.CartPage;
import Prod.pageObjects.LoginMode;
import Prod.pageObjects.FeaturedProducts;
import Prod.pageObjects.ProductPage;
import org.testng.annotations.Test;

public class CreateProductTest extends BaseClass {

    @Test
    public void createProduct() {

        driver.get(stageURL);
        logger.info("open prod site");

        LoginMode loginMode = new LoginMode(driver);
        FeaturedProducts featuredProducts = new FeaturedProducts(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginMode.enterPassword("12345");
        logger.info("entered password");

        loginMode.clickEnterButton();
        logger.info("clicked on enter button");

//        featuredProducts.switchToIFrame();
//        logger.info("switched to IFrame");

        featuredProducts.clickOnPhoneCaseProduct();
        logger.info("clicked on phone case");

        productPage.selectProductModel();
        logger.info("selected product model");

        productPage.selectProductDesign();
        logger.info("selected product design");

        productPage.uploadImage();
        logger.info("uploaded image");

        productPage.enterFirstText();
        logger.info("entered first text");

        productPage.enterSecondText();
        logger.info("entered second text");

        productPage.selectColor();
        logger.info("selected color");

        productPage.selectRingHolder();
        logger.info("selected ring holder");

        productPage.clickAddToCartButton();
        logger.info("clicked on add to cart button");

        productPage.clickCheckoutButton();
        logger.info("clicked on checkout button");



    }
}
