package pageObjects.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import utilities.CommonOps;

public class LoginPageTest extends CommonOps {

    @FindBy(how = How.NAME, using = "")
    public WebElement txt_username;

    @FindBy(how = How.NAME, using = "")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "")
    public WebElement btn_login;

    @FindBy(how = How.CSS, using = "")
    public WebElement btn_skip;

    @Test
    public void login() {
        System.out.println("Fast test");
    }
}
