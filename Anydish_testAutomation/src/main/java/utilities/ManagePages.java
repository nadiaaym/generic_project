package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initPractitionerApp(){
        practitionerAppLogin = PageFactory.initElements(driver, pageObjects.web.LoginPage.class);
    }
}
