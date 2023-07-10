package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest
{
    HomePage homePage= new HomePage();
    DesktopPage desktopClass= new DesktopPage();
    LaptopNotebookPage laptopNotebookPage= new LaptopNotebookPage();
    ComponentPage componentPage= new ComponentPage();

    @Test
    // 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.hoverMouseToDesktopClick();
        Thread.sleep(1000);

        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.callAllMenuBySelect("Show AllDesktops");
        Thread.sleep(1000);

        //1.3 Verify the text ‘Desktops’
        desktopClass.verifyTextDesktop();
        Thread.sleep(1000);
    }

    //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException
    {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverToLapTop();
        Thread.sleep(1000);

        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.callAllMenuBySelect("Show AllLaptops & Notebooks");
        Thread.sleep(1000);

        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopNotebookPage.verifyTextLaptopNoteBook();
        Thread.sleep(1000);
    }

    //3. verifyUserShouldNavigateToComponentsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException
    {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverToComponents();
        Thread.sleep(1000);

        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.callAllMenuBySelect("Show AllComponents");
        Thread.sleep(1000);

        //3.3 Verify the text ‘Components’
        componentPage.verifyTextComponents();
        Thread.sleep(1000);
    }
}
