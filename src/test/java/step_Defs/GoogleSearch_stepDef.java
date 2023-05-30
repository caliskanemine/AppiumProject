package step_Defs;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ReusableMethods;

public class GoogleSearch_stepDef {

    GooglePage googlePage= new GooglePage();


    @Given("user opens chrome")
    public void user_opens_chrome() {
       googlePage.searchBox.click();
    }
    @When("user writes something")
    public void user_writes_something() {
       googlePage.searchBar.sendKeys("orange"+ Keys.ENTER);
    }
    @When("user clicks to search button")
    public void user_clicks_to_search_button() {
        ReusableMethods.waitFor(2);
    }


}
