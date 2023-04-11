package com.sofkau.ui.automation;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class CompraAutomation extends PageObject{
    public static final Target BOTON_PRODUCTOS= Target.the("boton de productos")
            .located(By.xpath("(//a[@href='/products'])"));
    public static final Target BOTON_MARCA=Target.the("boton marca")
            .located(By.xpath("(//a[@href='/brand_products/H&M'])"));
    public static final Target BOTON_SEGUIR_COMPRANDO=Target.the("seguir comprando")
            .located(By.xpath("(//button[@class='btn btn-success close-modal btn-block'])"));
    public static final Target BOTON_CARRITO=Target.the("boton carrito")
            .located(By.xpath("(//a[@href='/view_cart'])"));
    public static final Target BOTON_PAGO=Target.the("proceder al pago")
            .located(By.xpath("(//a[@class='btn btn-default check_out'])"));
    public static final Target BOTON_PLACE_ORDEN=Target.the("finalizar compra")
            .located(By.xpath("(//a[@href='/payment'])"));
    public static final Target CAMPO_NOMBRE=Target.the("nombre tarjeta")
            .located(By.xpath("(//input[@data-qa='name-on-card'])"));
    public static final Target CAMPO_TARJETA=Target.the("numero de tarjeta")
            .located(By.xpath("(//input[@data-qa='card-number'])"));
    public static final Target CAMPO_CVC=Target.the("cvc tarjeta")
            .located(By.xpath("(//input[@data-qa='cvc'])"));
    public static final Target CAMPO_EXPIRATION=Target.the("expiration tarjeta")
            .located(By.xpath("(//input[@data-qa='expiry-month'])"));
    public static final Target CAMPO_EXPIRATIONANNO=Target.the("expiration anno tarjeta")
            .located(By.xpath("(//input[@data-qa='expiry-year'])"));
    public static final Target BOTON_PAY=Target.the("boton pagar")
            .located(By.xpath("(//button[@data-qa='pay-button'])"));
}
