package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.*;
import util.DriverFactory;

public class AddProductToCartSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    pages.LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
    pages.ProductPage productPage= new ProductPage(DriverFactory.getDriver());

    pages.CartPage cartPage= new CartPage(DriverFactory.getDriver());

    @Given("Access\"www.lcwaikiki.com.tr\"")
    public void access_lcwaikiki() {homePage.checkHomePage();}
    @When("Click Login Button")
    public void click_LoginButton() {homePage.clickLoginButton();}
    @When("Enter {string} in e-mail box in login page")
    public void enter_eMail(String eMail){loginPage.entereMail(eMail);}
    @When("Enter {string} in password box in login page")
    public void enter_Password(String password){loginPage.enterPassword(password);}
    @When("Click Log in button")
    public void click_LoginButton2(){loginPage.clickLoginButton();}
    @When("Click Women>Dress>Blouse")
    public void click_Blouse(){productPage.clickBlouse();}
    @When("Filter according to color>Black")
    public void filter_Black(){productPage.filterBlack();}
    @When("Click  one dress")
    public void click_Dress(){productPage.clickDress();}
    @When("Pick Medium size")
    public void pick_Size(){productPage.pickSize();}
    @When("Click Add to cart button")
    public void add_Cart(){productPage.addCart();}
    @When("Click My Cart")
    public void go_Mycart(){cartPage.goMycart();}
    @When("Check dress")
    public void checkDress(){cartPage.checkDress();}
    @When("Click pay button")
    public void click_PayButton(){cartPage.clickPayButton();}


}
