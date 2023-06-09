package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeColanta.mensajeColanta;


import static com.sofkau.questions.MensajeInicioLatam.mensajeInicioLatam;
import static com.sofkau.questions.MensajeInicioYourStore.mensajeInicioYourStore;


import static com.sofkau.questions.MensajeNombre.mensajeNombre;

import static com.sofkau.questions.MensajeNombreLaVaquita.mensajeNombreLaVaquita;
import static com.sofkau.tasks.lavaquita.IniciarSesionLaVaquita.iniciarSesionLaVaquita;
import static com.sofkau.tasks.lavaquita.NavegarAlInicioSesionLaVaquita.navegarAlInicioSesionLaVaquita;

import static com.sofkau.tasks.colanta.IniciarSesionColanta.iniciarSesionColanta;

import static com.sofkau.tasks.colanta.NavegarAlInicioSesionColanta.navegarAlInicioSesionColanta;

import static com.sofkau.questions.MensajeNombreExito.mensajeBienvenidaExito;
import static com.sofkau.questions.MensajeNombreLosMontes.mensajeNombreLosMontes;


import static com.sofkau.tasks.latam.IniciarSesionLatam.iniciarSesionLatam;

import static com.sofkau.tasks.latam.NavegarInicioLatam.navegarInicioLatam;



import static com.sofkau.tasks.automation.IniciarSesionAutomation.iniciarSesion;

import static com.sofkau.tasks.losmontes.IniciarSesionLosMontes.iniciarSesionLosMontes;
import static com.sofkau.tasks.losmontes.NavegaAlInicioSesionLosMontes.navegaAlInicioSesionLosMontes;

import static com.sofkau.tasks.yourstore.IniciarSesionYourStore.iniciarSesionYourStore;

import static com.sofkau.tasks.automation.NavegarAlInicioSesionAutomation.navegarAlRegistro;
import static com.sofkau.tasks.yourstore.NavegarInicioYourStore.navegarInicioYourStore;

import static com.sofkau.tasks.NavegarAlInicioSesionExito.navegarAlRegistroPaginaExito;
import static com.sofkau.tasks.PaginaInicioSesionExitoTasks.iniciarSesionExito;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(StepDefinitions.class);


    @Given("que el usuario esta en la pagina de inicio {string}")
    public void que_el_usuario_esta_en_la_pagina_de_inicio(String url) {
        configurarNavegador(url);
    }

    @When("navega hasta la opcion de iniciar sesion en la {string}")
    public void navega_hasta_la_opcion_de_iniciar_sesion_en_la(String pagina) {
        try {
            navegarHastaInicio(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }

    }

    @When("completa las credenciales en la {string}")
    public void completa_las_credenciales_en_la(String pagina) {
        try {
            completarCredenciales(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }


    @Then("el usuario debera ver un texto que lo confirme en la {string}")
    public void el_usuario_debera_ver_un_texto_que_lo_confirme_en_la(String pagina) {
        try {
            asserstions(pagina);

        } catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    private static void asserstions(String pagina) {
        switch (pagina) {
            case "automation exercise":
                assertionAutomation();
                break;

            case "la vaquita":
                assertionLaVaquita();
                break;

            case "pideColanta":
                assertionColanta();
                break;

            case "pagina exito":
                assertionExito();
                break;

            case "supermercado los montes":
                assertionLosMontes();
                break;

            case "Your Store":
                assertionYourStore();
                break;
            case "LATAM":
                assertionLatam();
                break;

            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    private static void assertionAutomation() {
        theActorInTheSpotlight().should(seeThat(mensajeNombre(), equalTo("Logged in as Jessica")));
    }

    private static void assertionColanta() {
        theActorInTheSpotlight().should(
                seeThat(mensajeColanta(), equalTo("HOLA, ROMINA"))
        );
    }

    private static void assertionLaVaquita() {
        theActorInTheSpotlight().should(
                seeThat(mensajeNombreLaVaquita(), equalTo("Hola, Maria"))
        );
    }

    private static void assertionExito() {
        theActorInTheSpotlight().should(seeThat(mensajeBienvenidaExito(), equalTo("Hola")));
    }


    private static void assertionYourStore() {
        theActorInTheSpotlight().should(seeThat(mensajeInicioYourStore(), equalTo("My Account")));
    }

    private static void assertionLatam() {
        theActorInTheSpotlight().should(seeThat(mensajeInicioLatam(), equalTo("Nelson")));
    }


    /**
     * Métodos
     */

    //When Navega hasta la opcion de iniciar sesion - General
    private static void navegarHastaInicio(String pagina) {
        switch (pagina) {
            case "automation exercise":
                clickInicioAutomation();
                break;
                case "pideColanta":
                clickInicioColanta();
                break;

            case "la vaquita":
                clickInicioLaVaquita();
                break;

            case "pagina exito":
                clickInicioSesionExito();
                break;
            case "supermercado los montes":
                clickIncioLosMontes();
                break;
            case "Your Store":
                clickInicioYourStore();
                break;
            case "LATAM":
                clickInicioLatam();
                break;
            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

    //Método iniciar Sesion automation
    private static void clickInicioAutomation() {
        theActorInTheSpotlight().attemptsTo(navegarAlRegistro());
    }


    private static void clickInicioColanta() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesionColanta()
        );
    }


    private static void clickInicioSesionExito() {
        theActorInTheSpotlight().attemptsTo(navegarAlRegistroPaginaExito());
    }

    private static void clickInicioYourStore() {
        theActorInTheSpotlight().attemptsTo(navegarInicioYourStore());
    }

    private static void clickInicioLatam() {
        theActorInTheSpotlight().attemptsTo(navegarInicioLatam());
    }

    //Metodo que contiene las credenciales de automation

    private static void clickInicioLaVaquita() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlInicioSesionLaVaquita()
        );
    }

    private static void inicioAutomation() {
        theActorInTheSpotlight().attemptsTo(iniciarSesion().conElUsuario("jessica@gmail.com").yConLaContrasenna("123456"));
    }

    private static void inicioColanta() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionColanta()
                        .conElEmail("rominamene2023@gmail.com")
                        .yConLaContrasenna("Lupita01")
        );
    }

    private static void inicioLaVaquita() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesionLaVaquita()
                        .conElUsuario("mariaisabelgiraldorendon357@gmail.com")
                        .yConLaContrasenna("MariaGiraldo_123")
        );
    }

    private static void registroUsuarioExito() {

        theActorInTheSpotlight().attemptsTo(iniciarSesionExito().conUsuario("ospina_88@hotmail.com").conPassword("Emilia#2019"));


        theActorInTheSpotlight().attemptsTo(
                iniciarSesionExito()
                        .conUsuario("ospina_88@hotmail.com")
                        .conPassword("Emilia#2019")
        );

    }


    private static void inicioYourStore() {

        theActorInTheSpotlight().attemptsTo(iniciarSesionYourStore().conElUsuario("yeisonbuitrago1010@gmail.com").yConLaContrasenna("72qMXaw5rK29sB")

        );
    }

    private static void inicioLatam() {
        theActorInTheSpotlight().attemptsTo(iniciarSesionLatam().conElUsuario("nelsonvelazquezqaexito@outlook.es").yConLaContrasenna("S41ch1p4p4"));
    }





    //When - completa credenciales para iniciar sesion - General
    private static void completarCredenciales(String pagina) {
        switch (pagina) {
            case "automation exercise":
                inicioAutomation();
                break;

            case "pideColanta":
                inicioColanta();
                break;

            case "pagina exito":
                registroUsuarioExito();
                break;

            case "supermercado los montes":
                inicioLosMontes();
                break;
            case "Your Store":
                inicioYourStore();
                break;
            case "LATAM":
                inicioLatam();
                break;

            case "la vaquita":
                inicioLaVaquita();
                break;

            default:
                LOGGER.info("Ingrese el nombre de la pagina correcta");
                Assertions.fail();
        }
    }

/**
 * Métodos Supermercado Los Montes
 */


private static void clickIncioLosMontes(){
        theActorInTheSpotlight().attemptsTo(navegaAlInicioSesionLosMontes());
        }

private static void inicioLosMontes(){
        theActorInTheSpotlight().attemptsTo(iniciarSesionLosMontes().conElEmail("juanmanuelgofu@gmail.com").yConLaContrasenna("Juan1997"));
        }

private static void assertionLosMontes(){
        theActorInTheSpotlight().should(seeThat(mensajeNombreLosMontes(),equalTo("Juan Manuel Gomez Fuentes")));
        }
        }

