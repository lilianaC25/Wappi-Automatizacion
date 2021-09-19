# language: es
@agregarusuario
Característica: Actualizar informacion dentro del Perfil
  Yo como usuario, quiero probar el correcto funcionamiento del perfil

    Antecedentes: Ingresar usuario y contraseña
    Dado que se ingresa a Wappi
    Cuando se ingresa el usuario y la contrasena
      | usuario   | contrasena  |
      | prueba1 | automatizacion |
    Entonces Se valida el ingreso a la pagina "Inicio"


  @perfil1
  Escenario: Validar la Obligatoriedad de los campos del perfil
    Dado que al dar clic en la opcion informacion Personal
    Cuando se dejan los campos en blanco y se habilita el boton Guardar
    Entonces el sistema muestra un mensaje indicando que el campo es Obligatoria

  @perfil2
  Escenario: Validar registro del perfil
    Dado que al dar clic en la opcion informacion Personal
        Cuando se completan todo los campo y se habilita el boton Guardar
      | Nombre | Apellido | Fecha de Nacimiento | Pais      |
      | lida   | Suarez   | 12/04/1992          | Argentina |
    Entonces el sistema muestra un mensaje "Tu informacion de guardo correctamente"

  @perfil3
  Escenario: Validar campos inicializados del perfil
    Dado que al dar clic en la opcion informacion Personal
    Cuando habilito el boton Guardar
    Entonces se valida que los campos esten inicializdos con cualquier valor

