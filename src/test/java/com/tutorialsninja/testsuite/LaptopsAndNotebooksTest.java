package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest
{
    HomePage homePage= new HomePage();
    LaptopNotebookPage laptopNotebookPage= new LaptopNotebookPage();
    ProductLaptopPage productLaptopPage= new ProductLaptopPage();
    ShoppingCart shoppingCart= new ShoppingCart();
    CheckOutPage checkOutPage= new CheckOutPage();

    // 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException
    {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverToLapTop();
        Thread.sleep(1000);

        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");
        Thread.sleep(1000);

        //1.3 Select Sort By "Price (High > Low)"
        laptopNotebookPage.sortByPrice();
        Thread.sleep(1000);

        //1.4 Verify the Product price will arrange in High to Low order.
        laptopNotebookPage.verifyProductHighTOLow();
        Thread.sleep(1000);
    }
    //2. Test name verifyThatUserPlaceOrderSuccessfully()
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException
    {
        // click On pound
        homePage.currency();
        Thread.sleep(500);

        //2.1 Mouse hover on Laptops & Notebooks Tab and click.
        homePage.mouseHoverToLapTop();
        Thread.sleep(1000);

        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");
        Thread.sleep(1000);

        //2.3 Select Sort By "Price (High > Low)"
        laptopNotebookPage.sortByPrice();
        Thread.sleep(1000);

        //2.4 Select Product “MacBook”
        laptopNotebookPage.selectProductMacBook();
        Thread.sleep(1000);

        //2.5 Verify the text “MacBook”
        productLaptopPage.verifyTextMacBook();
        Thread.sleep(1000);

        //2.6 Click on ‘Add To Cart’ button
        productLaptopPage.clickOnAddToCartLink();
        Thread.sleep(1000);

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        productLaptopPage.verifyTextSuccess();
        Thread.sleep(1000);

        //2.8 Click on link “shopping cart” display into success message
        productLaptopPage.clickOnShoppingCartLink();
        Thread.sleep(1000);

        // 2.9 Verify the text "Shopping Cart"
        shoppingCart.verifyTextShoppingCart();
        Thread.sleep(1000);

        //2.10 Verify the Product name "MacBook"
        shoppingCart.verifyProductMacBook();
        Thread.sleep(1000);

        //2.11 Change Quantity "2"
        shoppingCart.changeQty();
        Thread.sleep(1000);

        //2.12 Click on “Update” Tab
        shoppingCart.clickOnUpdateButton();
        Thread.sleep(1000);

        //2.13 Verify the message “Success: You have modified your shopping cart!”
        shoppingCart.verifyTextSuccess();
        Thread.sleep(1000);

        //2.14 Verify the Total £737.45
        shoppingCart.verifyTotalOfLaptop();
        Thread.sleep(1000);

        //2.15 Click on “Checkout” button
        shoppingCart.checkoutButton();
        Thread.sleep(1000);

        //2.16 Verify the text “Checkout”
        checkOutPage.verifyTextCheckOut();
        Thread.sleep(1000);

        //2.17 Verify the Text “New Customer”
        checkOutPage.verifyTextNewCustomer();
        Thread.sleep(1000);

        //2.18 Click on “Guest Checkout” radio button
        checkOutPage.clickOnGuestCheckOut();
        Thread.sleep(1000);

        //2.19 Click on “Continue” tab
        checkOutPage.clickOnContinue();
        Thread.sleep(1000);

        //2.20 Fill the mandatory fields
        checkOutPage.fillAllField();
        Thread.sleep(1000);

        //2.21 Click on “Continue” Button
        checkOutPage.clickOnContinueTwo();
        Thread.sleep(1000);

        //2.22 Add Comments About your order into text area
        checkOutPage.addComment();
        Thread.sleep(1000);

        //2.23 Check the Terms & Conditions check box
        checkOutPage.clickOnCheckBoxTerm();
        Thread.sleep(1000);

        //2.24 Click on “Continue” button
        checkOutPage.clickOnContinueThree();
        Thread.sleep(1000);

        //2.25 Verify the message “Warning: Payment method required!”
        checkOutPage.verifyErrorText();
        Thread.sleep(1000);
    }

}
