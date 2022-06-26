package pages;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;
public class RegistrationPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.action= new Actions(driver);
    }

    public void entereMail(String Email) {
        WebElement emailbox = driver.findElement(By.cssSelector(".text-input.input-error[name=\"email\"]"));

        wait.until(ExpectedConditions.visibilityOf(emailbox));
        emailbox.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        WebElement password = driver.findElement(By.cssSelector(".text-input.input-error[name=\"password\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(Password);
    }

    public void enterPhoneNumber(String PhoneNumber) {
        WebElement phoneNumber = driver.findElement(By.cssSelector(".register__phone.text-input[name=\"phone\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
        phoneNumber.sendKeys(PhoneNumber);
    }

    public void clickPA() {
        WebElement checkboxprivacy = driver.findElement(By.cssSelector(".checkbox-container .checkbox-input"));

        wait.until(ExpectedConditions.elementToBeClickable(checkboxprivacy));
        checkboxprivacy.click();
    }

    public void clickRegisterButton() {
        WebElement registerbutton = driver.findElement(By.cssSelector(".register__button.register__button--blue"));

        wait.until(ExpectedConditions.elementToBeClickable(registerbutton));
        registerbutton.click();
    }

    public void checkPhoneVerificationPage() {
        WebElement phoneVerificationhome = driver.findElement(By.cssSelector("#base-timer-label"));

        wait.until(ExpectedConditions.elementToBeClickable(phoneVerificationhome));



    }
}
