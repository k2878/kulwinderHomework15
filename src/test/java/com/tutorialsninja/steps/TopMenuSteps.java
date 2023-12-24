package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.utility.Utility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class TopMenuSteps extends Utility {



    @When("^I mouse hover And click on desktop tab$")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().mouseHoverToDesktop();
    }


    @And("^I select menu show All Desktops$")
    public void iSelectMenuShowAllDesktops() {
        new HomePage().setShowAllDesktops();
    }

    @Then("^I should Navigate to desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }


    @When("^I mouse hover and click on laptop and notebook tab$")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        new HomePage().mouseHoverToLaptopsAndNotebooks();
    }

    @And("^I select menu Show All Laptops & Notebooks$")
    public void iSelectMenuShowAllLaptopsNotebooks() {
        new HomePage().setShowAllDesktopsAndNotebooks();
    }

    @Then("^I should navigate to laptop and notebook page successfully$")
    public void iShouldNavigateToLaptopAndNotebookPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText, expectedText);
    }

    @When("^I mouse hover and click on component tab$")
    public void iMouseHoverAndClickOnComponentTab() {
        new HomePage().mouseHoverToComponents();
    }

    @And("^I select menu Show All Components$")
    public void iSelectMenuShowAllComponents() {
        new HomePage().setShowAllComponents();
    }

    @Then("^I should navigate to component page successfully$")
    public void iShouldNavigateToComponentPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Components";
        Assert.assertEquals(actualText, expectedText);
    }
}