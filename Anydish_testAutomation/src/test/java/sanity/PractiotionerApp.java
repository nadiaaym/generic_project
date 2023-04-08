package sanity;

import extensions.Verifications;
import org.testng.annotations.Test;
import utilities.CommonOps;
import worflows.WebFlows;

import java.util.concurrent.TimeUnit;

public class PractiotionerApp extends CommonOps  {

    @Test
    public void test01_verifyLogin() {
       WebFlows.login(System.getenv("ANYDISH_USER"), System.getenv("ANYDISH_PASS"));
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Verifications.verifyTextInElement(practitionerMain.add_patient, "Add a new patient");

    }

    //public void test02_clickToAddPatient(){
      //  WebFlows.addPatient();
   // }

}
