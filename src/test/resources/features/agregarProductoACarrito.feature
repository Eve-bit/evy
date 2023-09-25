#language: es
  Característica: Agregar producto a Carrito de Compras
    Escenario: Agregar producto al carrito correctamente
      Dado que el usuario accede al login de la pagina opencart
      Y el usuario ingresa mail y password validos
      Y el usuario accede a la seccion Cameras
      Cuando el usuario agrega un producto al carrito de compras
      Y accede a su carrito de compras
      Entonces se muestra el producto agregado al carrito
