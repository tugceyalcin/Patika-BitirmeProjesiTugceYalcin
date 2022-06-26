package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    public  LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action= new Actions(driver);

    }


    public void entereMail(String e_Mail) {
        WebElement emailbox = driver.findElement(By.cssSelector(".text-input.input-error[name=\"email\"]"));

        wait.until(ExpectedConditions.visibilityOf(emailbox));
        emailbox.sendKeys(e_Mail);

    }

    public void enterPassword(String password) {
        WebElement psswrd = driver.findElement(By.cssSelector(".text-input.input-error[name=\"password\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(psswrd));
        psswrd.sendKeys(password);

    }

    public void clickLoginButton() {
        WebElement loginbutton = driver.findElement(By.cssSelector(".login-form__button.login-form__button--bg-blue"));

        wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
        loginbutton.click();

    }
}
