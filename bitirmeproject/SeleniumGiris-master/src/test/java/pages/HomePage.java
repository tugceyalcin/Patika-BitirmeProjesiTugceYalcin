package pages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;



public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action= new Actions(driver);

    }

    public void checkHomePage() {
        WebElement logo =driver.findElement(By.cssSelector(".header__middle__left .main-header-logo"));
        wait.until(ExpectedConditions.elementToBeClickable(logo));

    }

    public void clickLoginButton() {
        WebElement loginButton =driver.findElement(By.cssSelector(".user-wrapper"));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void clickSignInButton() {
        WebElement signInbutton =driver.findElement(By.cssSelector("a.login-form__link"));
        wait.until(ExpectedConditions.visibilityOf(signInbutton));
        signInbutton.click();
    }



}



