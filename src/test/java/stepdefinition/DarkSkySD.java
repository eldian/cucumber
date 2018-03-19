package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkSkyHomePage;

/**
 * Created by eldiandervishi on 3/9/18.
 */
public class DarkSkySD {

    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on home page of DarkSky$")
    public void pageTitleVerification() {
        darkSkyHomePage.pageTitleVerification();
    }


    @Then("^I verify days of the week is displayed in correct order$")
    public void dayVerification() {

//        Creating array from actual elements pulled from website
        darkSkyHomePage.createActualArray();

//        Creating expected array of elements
        darkSkyHomePage.createExpectedArray();

//        Verify if actual and expected values are equal
        darkSkyHomePage.arrayVerification();

    }


    public class DarkSky2SD {

        DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

        @When("^I click on today's bar$")
        public void clickParentBars() {

//        Click on all days of the week
            darkSkyHomePage.clickOnParentBars();
        }

        @Then("^I verify low and high temps displayed correctly on parent bar$")
        public void tempVerifications() {


//        Get all minimum and maximum temperatures from outside parent bar
            darkSkyHomePage.getMinMaxTemps();


//        Get all low and high temperature from inside each bar
            darkSkyHomePage.getLowHighTemps();


//        Verify all low and high temperatures are equal
            darkSkyHomePage.assertVerification();
        }

        public class DarkSky3SD {

            DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

            @When("^I click on Time Machine$")
            public void clickTimeMachine() {

                darkSkyHomePage.clickTimeMachine();
            }

            @And("^I select tomorrow date$")
            public void selectDateFromCalendar() {

                darkSkyHomePage.selectDateFromCalendar();
            }

            @And("^I verify selected date is not clickable$")
            public void verifyDateNotClickcable() {

                darkSkyHomePage.verifyDateNotClickable();
            }

            @Then("^I verify date is displayed in correct format$")
            public void verifyCorrectFormat() {

                darkSkyHomePage.verifyCorrectFormat();
            }


        }

    }
}

