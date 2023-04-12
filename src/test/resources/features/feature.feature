Feature: Iniciar sesión
  Yo como usuario
  Quiero iniciar sesión en mi cuenta
  Para acceder a mis datos y funcionalidades

  @InicioSesión
  Scenario Outline: Iniciar sesion
    Given que el usuario esta en la pagina de inicio <url>
    When navega hasta la opcion de iniciar sesion en la <pagina>
    And completa las credenciales en la <pagina>
    Then el usuario debera ver un texto que lo confirme en la <pagina>

    Examples:

      | url                                                        | pagina                    |
      | "https://automationexercise.com/"                          | "automation exercise"     |
      | "https://www.pidecolanta.com/"                             | "pideColanta"             |
      | "https://www.exito.com/"                                   | "pagina exito"            |
      | "https://www.superlosmontes.com/"                          | "supermercado los montes" |
      | "http://opencart.abstracta.us/index.php?route=common/home" | "Your Store"              |







