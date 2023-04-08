package pageObjects.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.CLASS_NAME, using = "button[class='jss108']")
    public WebElement add_patient;
}
