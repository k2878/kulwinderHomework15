package com.tutorialsninja.steps;

import com.tutorialsninja.pages.Registration;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class RegisterStepsForUser {
    @When("^Navigates to Register tab click on Register$")
    public void navigatesToRegisterTabClickOnRegister() {
        new Registration().clickOnRegisterButton();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) throws InterruptedException {

//        List<List<String>> row = dataTable.asLists(String.class);
//        for( List<String> columns:row){
//            new LoginPage().register(columns.get(0), columns.get(1), columns.get(2), columns.get(3), columns.get(4));
//        }


        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            new Registration().fillOutForm(columns.get("name"), columns.get("lastname"), columns.get("email"), columns.get("telephone"), columns.get("password"), columns.get("password confirm"));

        }
    }

    @And("^I click checkbox of privacy policy$")
    public void iClickCheckboxOfPrivacyPolicy() {
        new Registration().clickOnPrivacyPolicyButton();


    }
    @And("^I click on continue button of registration page$")
    public void iClickOnContinueButtonOfRegistrationPage() {
        new Registration().clickOnContinueButton();
    }
    @Then("^I should see account successfully created message$")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals(new Registration().verifySuccessRegister(), "Your Account Has Been Created!", "Text Verified");
    }





}






