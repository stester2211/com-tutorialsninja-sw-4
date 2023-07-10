package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility
{
    By actualTextCheckOut= By.xpath("//a[text()='Checkout']");
    By actualTextNewCustomer= By.xpath("//h2[contains(text(),'New Customer')]");
    By clickOnGuest= By.xpath("//input[@value='guest']");
    By clickOnContinue= By.xpath("//input[@id='button-account']");
    By firstName= By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By phoneNumber = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postCode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By zone = By.xpath("//select[@id='input-payment-zone']");
    By clickOnContinueTwo= By.xpath("//input[@id='button-guest']");
    By addComment= By.xpath("//textarea[@class='form-control']");
    By clickTermCondition = By.xpath("//input[@name='agree']");
    By clickOnContinueThree= By.xpath("//input[@id='button-payment-method']");
    By actualErrorText= By.xpath("//div[text()='Warning: Payment method required!']");
    public void verifyTextCheckOut()
    {
        //2.16 Verify the text “Checkout”
        assertVerifyText(actualTextCheckOut,"Checkout", "Checkout text not found");
    }
    public void verifyTextNewCustomer()
    {
        //2.17 Verify the Text “New Customer”
        assertVerifyText(actualTextNewCustomer,"New Customer", "New Customer text not found");
    }
    public void clickOnGuestCheckOut()
    {
        //2.18 Click on “Guest Checkout” radio button
        clickOnElement(clickOnGuest);
    }
    public void clickOnContinue()
    {
        //2.19 Click on “Continue” tab
        clickOnElement(clickOnContinue);
    }
    public void fillAllField()
    {
        //2.20 Fill the mandatory fields
        sendTextToElement(firstName,"Vishwa");

        sendTextToElement(lastName,"patel");

        sendTextToElement(email,"vp@gmail.com");

        sendTextToElement(phoneNumber,"1234567893");

        sendTextToElement(address,"Asking");

        sendTextToElement(city,"Windsor");

        sendTextToElement(postCode,"123456");

        selectByVisibleTextFromDropDown(country,"United Kingdom");

        selectByVisibleTextFromDropDown(zone,"Anglesey");
    }
    public void clickOnContinueTwo()
    {
        //2.21 Click on “Continue” Button
        clickOnElement(clickOnContinueTwo);
    }
    public void addComment()
    {
        //2.22 Add Comments About your order into text area
        sendTextToElement(addComment,"Please call before you deliver the package");
    }
    public void clickOnCheckBoxTerm()
    {
        //2.23 Check the Terms & Conditions check box
        clickOnElement(clickTermCondition);
    }
    public void clickOnContinueThree()
    {
        //2.24 Click on “Continue” button
        clickOnElement(clickOnContinueThree);
    }
    public void verifyErrorText()
    {
        //2.25 Verify the message “Warning: Payment method required!”
        assertVerifyText(actualErrorText,"Warning: Payment method required!\n" +
                "×","Warning message not found");
    }

}
