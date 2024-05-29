package me.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import me.pages.BasePage;
import me.pages.HomePage;
import me.pages.CareersPage;
import me.utility.ConfigurationReader;
import me.utility.Driver;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.LogManager;

import static org.junit.Assert.*;

public class StepDefs extends BasePage {

    HomePage homePage = new HomePage();
    CareersPage careersPage = new CareersPage();


    @Given("user is on the pureIntegration Home page")
    public void user_is_on_the_pureIntegration_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("pureIntegration_url"));
    }

    @Then("user should see title is {string}")
    public void userShouldSeeTitleIs(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle);
        log.info(actualTitle + expectedTitle);
        log.info(expectedTitle);

    }


    @When("user clicks on careers button")
    public void userClicksOnCareersButton() {
        homePage.careersBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(careersPage.OpenPositionsBtn));

    }

    @Then("user should see open positions Careers at pureIntegration")
    public void userShouldSeeOpenPositionsCareersAtPureIntegration(){
        assertTrue(careersPage.openPositionsBanner.isDisplayed());
        log.info(careersPage.openPositionsBanner);
    }
}
