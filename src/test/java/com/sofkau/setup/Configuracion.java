package com.sofkau.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.sofkau.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Configuracion {
    private static final String SWITCHES = "--remote-allow-origins=*";
    private static final String ACTOR = "usuario";
    private static final int DIEZ_SEGUNDOS = 10;

    @Managed()
    protected WebDriver webDriver;


    private void setupUser(String url) {
        configurarDriver(url);
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarDriver(String url) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments(SWITCHES);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(co);
        webDriver.get(url);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.quit();
    }

    protected void configurarNavegador(String url) {
        setupUser(url);
        setUplog4j();
    }

    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    public static void waitExplicit() {
        WebDriverWait wait = new WebDriverWait(getDriver(), DIEZ_SEGUNDOS);
        wait.until(ExpectedConditions.alertIsPresent());
    }


}
