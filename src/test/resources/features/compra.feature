Feature: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero comprar productos
  para disfrutar de ellos

  Background:
    Given que el usuario esta en la pagina de inicio "https://automationexercise.com/"
    And navega hasta la opcion de iniciar sesion en la "automation exercise"
    And completa las credenciales en la "automation exercise"

  Scenario:
    When navega hasta los productos y selecciona una marca
  And selecciona tres de ellos
  And va al carrito de compras y hace el proceso de checkout
  Then se le indicara al usuario que se hizo su orden