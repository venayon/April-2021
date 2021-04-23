package ho.qat.seo.stepDefinitions;

import ho.qat.seo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VisaConfirmationSteps {

    ResultPage resultPage;
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    DurationOfStayPage durationOfStayPage;

    @Given("I am on the Check UK visa website")
    public void i_am_on_the_Check_UK_visa_website() {
        startPage.open();
    }

    @And("I start visa check")
    public void i_start_visa_check() {
        startPage.clickStartNow();
    }

    @When("I select a nationality of {string}")
    public void iSelectANationalityOfAustralia(String nationality) {
        selectNationalityPage.selectNationality(nationality);
    }

    @And("I select reason {string}")
    public void iSelectReasonTourism(String reason) {
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
    }

    @Then("I will be informed {string}")
    public void confirm_visa_result(String resultText) {
        resultPage.confirmResultMessage(resultText);
    }

    @And("I state I am intending to stay for {string} than 6 months")
    public void iStateIAmIntendingToStayForMoreThanMonths(String moreOrLess) {
        durationOfStayPage.selectLengthOfStay(moreOrLess);
        durationOfStayPage.clickNextStepButton();
    }
}
