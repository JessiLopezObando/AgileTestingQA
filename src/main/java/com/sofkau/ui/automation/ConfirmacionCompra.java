package com.sofkau.ui.automation;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA=Target.the("mensaje de compra exitosa")
            .located(By.xpath("(//h2[@data-qa='order-placed'])"));
}
