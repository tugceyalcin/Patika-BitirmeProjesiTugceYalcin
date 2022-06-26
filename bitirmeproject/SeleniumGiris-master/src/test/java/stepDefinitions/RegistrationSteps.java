package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import pages.HomePage;
import util.DriverFactory;

public class RegistrationSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    pages.RegistrationPage registrationPage=new RegistrationPage(DriverFactory.getDriver());


    @Given("Access\"www.lcwaikiki.com.tr\"")
    public void access_lcwaikiki() {homePage.checkHomePage();}
    @When("Click Login Button")
    public void click_LoginButton(){homePage.clickLoginButton();}
    @When("Click Sign in Button")
    public void click_SignInButton(){homePage.clickSignInButton();}
    @When("Enter {string} in e-mail box")
    public void enter_eMail(String eMail){registrationPage.entereMail(eMail);}

    @When("Enter {string} in password box")
    public void enter_Password(String password){registrationPage.enterPassword(password);}
    @When("Enter {string} in phone number box")
    public void enter_PhoneNumber(String phoneNumber){registrationPage.enterPhoneNumber(phoneNumber);}
    @When("Click check box of Privacy Approve")
    public void checkbox_PrivacyApprove(){registrationPage.clickPA();}
    @When("Click Register button.")
    public void click_RegisterButton(){registrationPage.clickRegisterButton();}
    @Then("Check that  phone verification is opened")
    public void check_phoneVerificationPage(){registrationPage.checkPhoneVerificationPage();}


}
