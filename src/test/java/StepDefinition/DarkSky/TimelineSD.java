package StepDefinition.DarkSky;

import Drivers.Web;
import Pages.BasePage;
import Pages.DarkSky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TimelineSD  extends BasePage {
    LandingPage landingPage= new LandingPage();

    @Given("^I am on Darksky home page$")
    public void launchDarksky(){
        Web.initDriver("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }

    @Then("^I verify timeline is displayed with '(.*)' hours increment with '(.*)' data points$")
    public void verify(int interval, int size){
        Assert.assertTrue(landingPage.verifyInterval(interval,size));
    }


    }

