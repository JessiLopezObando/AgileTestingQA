package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class RefrescarAutomation implements Task {
    public RefrescarAutomation() { }

    public static RefrescarAutomation thePage() {
        return Tasks.instrumented(RefrescarAutomation.class);
    }
    @Override
    @Step("{0} refreshes the browser")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();
    }
}
