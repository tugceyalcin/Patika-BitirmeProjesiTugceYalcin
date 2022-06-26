package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    public  CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action= new Actions(driver);

    }


    public void goMycart() {
    }

    public void checkDress() {
    }

    public void clickPayButton() {
    }
}
