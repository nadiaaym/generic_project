package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.web.LoginPageTest;

public class ManagePages extends Base {

    public static void initPractitionerApp(){
        practitionerAppLogin = PageFactory.initElements(driver, LoginPageTest.class);
    }
}
