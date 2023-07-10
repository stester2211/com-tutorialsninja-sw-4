package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility
{
    By actualTextRegister= By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName= By.xpath("//input[@id='input-firstname']");
    By lastName= By.xpath("//input[@id='input-lastname']");
    By email= By.xpath("//input[@id='input-email']");
    By telephone= By.xpath("//input[@id='input-telephone']");
    By password= By.xpath("//input[@id='input-password']");
    By confirmPassword= By.xpath("//input[@id='input-confirm']");
    By clickRadioSubscription= By.xpath("//input[@type='radio'][@name='newsletter'][@value='1']");
    By clickOnPrivacyBox= By.xpath("//input[@type='checkbox'][@name='agree'][@value='1']");
    By clickOnContinue= By.xpath("//input[@value='Continue']");
    By actualAccountCreatedText= By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By clickContinueTwo= By.xpath("//a[contains(text(),'Continue')]");
    public void verifyTextRegister()
    {
        //1.3 Verify the text “Register Account”.
        assertVerifyText(actualTextRegister,"Register Account","Register text not verify");
    }
    public void firstName()
    {
        //3.3 Enter First Name
        sendTextToElement(firstName,"Vishwa");
    }
    public void lastName()
    {
        //3.4 Enter Last Name
        sendTextToElement(lastName,"Patel");
    }
    public void email()
    {
        //3.5 Enter Email
        sendTextToElement(email,"vpa12345@gmail.com");
    }
    public void telephone()
    {
        //3.6 Enter Telephone
        sendTextToElement(telephone,"1234567885");
    }
    public void setPassword()
    {
        //3.7 Enter Password
        sendTextToElement(password,"123456vv");
    }
    public void setConfirmPassword()
    {
        //3.8 Enter Password Confirm
        sendTextToElement(confirmPassword,"123456vv");
    }
    public void clickOnSubscribe()
    {
        //3.9 Select Subscribe Yes radio button
        clickOnElement(clickRadioSubscription);
    }
    public void clickOnPrivacyBox()
    {
        //3.10 Click on Privacy Policy check box
        clickOnElement(clickOnPrivacyBox);
    }
    public void clickOnContinue()
    {
        //3.11 Click on Continue button
        clickOnElement(clickOnContinue);
    }
    public void verifyAccountText()
    {
        //3.12 Verify the message “Your Account Has Been Created!”
       assertVerifyText(actualAccountCreatedText,"Your Account Has Been Created!", "Account text not found");
    }
    public void clickOnContinueTwo()
    {
        //3.13 Click on Continue button
        clickOnElement(clickContinueTwo);
    }


}
