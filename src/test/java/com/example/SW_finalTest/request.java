package com.example.SW_finalTest;

import com.example.sw_final.AdminControll;
import com.example.sw_final.LoginControl1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class request {
    @Given("the system administrator is logged in")
    public void theSystemAdministratorIsLoggedIn() {
        assertEquals(true, LoginControl1.loginclicked);

    }
    @When("the system administrator navigates to the requests page")
    public void theSystemAdministratorNavigatesToTheRequestsPage() {
        assertEquals(true, AdminControll.requestclicked);

    }
    @When("clicks on the accept button")
    public void clicksOnTheAcceptButton() {

    }

    @When("clicks on the reject button")
    public void clicksOnTheRejectButton() {

    }
    @When("the system updates the status of the request to {string}")
    public void theSystemUpdatesTheStatusOfTheRequestTo(String string) {
        assertEquals(true,string.equals("Accepted"));

    }

    @When("system updates the status of the request to {string}")
    public void systemUpdatesTheStatusOfTheRequestTo(String string) {
        assertEquals(true,string.equals("Rejected"));

    }



}
