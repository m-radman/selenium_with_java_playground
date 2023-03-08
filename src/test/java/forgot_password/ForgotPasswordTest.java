package forgot_password;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void retrieveForgotenPass() {
        var forgotPass = homePage.clickForgotPass();

        forgotPass.enterEmail("tau@example.com");
        forgotPass.retrievePassword();

        assertEquals(forgotPass.getMessage(), "Internal Server Error",
                "Incorrect message");
    }
}
