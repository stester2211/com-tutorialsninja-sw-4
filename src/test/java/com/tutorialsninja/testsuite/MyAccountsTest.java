package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest
{
    HomePage homePage= new HomePage();
    RegisterPage registerPage= new RegisterPage();
    LoginPage loginPage= new LoginPage();

    //1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException
    {
        //1.1 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.callMethodAndPassParameter("Register");
        Thread.sleep(1000);

        //1.3 Verify the text “Register Account”.
        registerPage.verifyTextRegister();
        Thread.sleep(1000);
    }

    // 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException
    {
        //2.1 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.callMethodAndPassParameter("Login");
        Thread.sleep(1000);

        //2.3 Verify the text “Returning Customer”.
        loginPage.verifyTextReturningCustomer();
    }

    //3. Test name verifyThatUserRegisterAccountSuccessfully()
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException
    {
        //3.1 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.callMethodAndPassParameter("Register");

        //3.3 Enter First Name
        registerPage.firstName();
        Thread.sleep(1000);

        //3.4 Enter Last Name
        registerPage.lastName();
        Thread.sleep(1000);

        //3.5 Enter Email
        registerPage.email();
        Thread.sleep(1000);

        //3.6 Enter Telephone
        registerPage.telephone();
        Thread.sleep(1000);

        //3.7 Enter Password
        registerPage.setPassword();
        Thread.sleep(1000);

        //3.8 Enter Password Confirm
        registerPage.setConfirmPassword();
        Thread.sleep(1000);

        //3.9 Select Subscribe Yes radio button
        registerPage.clickOnSubscribe();

        //3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyBox();
        Thread.sleep(1000);

        //3.11 Click on Continue button
        registerPage.clickOnContinue();
        Thread.sleep(1000);

        //3.12 Verify the message “Your Account Has Been Created!”
        registerPage.verifyAccountText();
        Thread.sleep(1000);

        //3.13 Click on Continue button
        registerPage.clickOnContinueTwo();
        Thread.sleep(1000);

        // 3.14 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        // 3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.callMethodAndPassParameter("Logout");
        Thread.sleep(1000);

        // 3.16 Verify the text “Account Logout”
        homePage.verifyTextLogOut();
        Thread.sleep(1000);

        //3.17 Click on Continue button
        homePage.clickContinue();
        Thread.sleep(1000);
    }

    // 4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //4.1 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.callMethodAndPassParameter("Login");
        Thread.sleep(1000);

        //4.3 Enter Email address
        loginPage.enterEmail();

        //4.5 Enter Password
        loginPage.enterPassword();

        //4.6 Click on Login button
        loginPage.clickLoginButton();
        Thread.sleep(1000);

        //4.7 Verify text “My Account”
        loginPage.verifyMyAccountText();
        Thread.sleep(1000);

        //4.8 Click on My Account Link.
        homePage.clickOnAccountLink();
        Thread.sleep(1000);

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.callMethodAndPassParameter("Logout");
        Thread.sleep(1000);

        //4.10 Verify the text “Account Logout”
        homePage.verifyTextLogOut();
        Thread.sleep(1000);

        //4.11 Click on Continue button
        homePage.clickContinue();
        Thread.sleep(1000);
    }


}
