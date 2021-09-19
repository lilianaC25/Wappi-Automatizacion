# language: es
@agregarusuario
Característica: Pedir una orden con y sin el cupón de bienvenida
  Yo como usuario, quiero probar la solicitud de una orden con y sin el cupón de bienvenida

  Antecedentes: Ingresar usuario y contrasena
    Dado que se ingresa a Wappi
    Cuando se ingresa el usuario y la contrasena
      | usuario   | contrasena  |
      | prueba1 | automatizacion |
    Entonces Se valida el ingreso a la pagina "Inicio"

  @pedido1
  Escenario: Validar la solicitud de una orden de pedido
    Dado Que al seleccionar una Oferta y dar clic en la opcion Pedir
    Cuando Damos clir en la opcion Confirmar Pedido
    Entonces El sistema muestra el mensaje "Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades"

  @pedido2
  Escenario: Validar la solicitud de una orden con cupón de bienvenida
    Dado Que se obtiene un cupon
    Cuando Que se realiza un pedido
    Y se aplica un cupon
    Entonces El sistema muestra el pedido con los mismos datos del pedido realizado y muestra "Si" en la opcion Uso cupon

  @pedido3
  Escenario: Validar la solicitud de una orden sin cupón de bienvenida
    Dado Que se realiza un pedido
    Cuando Se confirma el Pedido
    Entonces El sistema muestra el pedido con los mismos datos del pedido realizado y muestra "No" en la opcion Uso

  @pedido4
  Escenario: Verificar validez de cupon
    Dado Que se obtiene un cupon
    Cuando Que se realiza un pedido
    Y se aplica un cupon invalido
    Entonces El sistema muestra el mensaje "Cupon Invalido"

  @pedido5
  Escenario: Verificar ingreso del cupon maximo 2 veces
    Dado Que se obtiene un cupon
    Cuando se realizan mas de dos pedidos con el mismo Cupon
    Entonces El sistema muestra el mensaje "Cupon Invalido"

  @pedido6
  Escenario: Validar la informacion del Pedido
    Dado Que se realiza un pedido
    Cuando Se da clic en la opcion Mis pedidos
    Entonces El sistema muestar la misma informacion de la Oferta





