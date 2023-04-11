package com.sofkau.ui.automation;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionInicioAutomation extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
}
