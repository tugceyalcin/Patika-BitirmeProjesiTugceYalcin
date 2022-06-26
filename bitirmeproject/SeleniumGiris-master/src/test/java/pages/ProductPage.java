package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    public  ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action= new Actions(driver);

    }

    public void clickBlouse() {
    }

    public void filterBlack() {
    }

    public void clickDress() {
    }

    public void pickSize() {
    }

    public void addCart() {
    }
}
