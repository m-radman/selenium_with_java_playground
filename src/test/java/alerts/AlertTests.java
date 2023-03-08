package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(), "You successfully clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToCancel();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerPrompt();

        String text = "TAU rocks!";
        alertsPage.alert_enterText(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),
                "You entered: " + text, "Results text incorrect");
    }

}
