# PruebaTecnicaJava-Nexos
# API Registro de Mercancias 
Prueba técnica Nexos

## Autor

- Miguel Angel Fuquene Arias

## Contrucción 

- NetBeans-Editos decódigo y ambiente de desarrollo(IDE)
- Maven-gestor de dependencias 
- Docker-Software para crear, probar e implementar APIs por medio de contenedores
- Spark-Micro Framework para crear APIs

## Requerimientos
- Java 8 o superior
- Spring framework, Spring data, Spring web
- BD PostgreSQL
- Maven o Gradle
Para el desarrollo FrontEnd
- Angular
Se evaluarán los siguientes conceptos:
- Buenas prácticas de programación
- Manejo de excepciones (fundamental)
- Pruebas de unidad (fundamental)
- Manejo de DTO’S y entidades
- Manejo de API’S y controladores
- Estructuración de paquetes y capas
- Inyección de dependencias
- Normalización de base de datos

## Evidencia de funcionamiento
- Backend Corriendo 

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/backendCorriendo.png)

- Creacion de Tablas en base de datos postgresql

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/CreacionDeTablas.png)

- Como se puede ver en la siguiente imagen se crean las tablas Mercancia y Usuarios ambas inicialmente vacias.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/TablaMercanciaVacia.png)

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/TablaUsuariosVacia.png)

- Posteriormente muestro como se hace el primer registro de mercancia por medio de postman probando asi que funciona el backend asi como las restricciones propuestas.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/PrimerRegistroPostman.png)

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/PrimerRegistroUsuarioPostman.png)

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/PrimerRegistroMercanciaDB.png)

- A continuación pruebo que las excepciones por nombre y por fecha de producto funcionan como se fue requerido.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/ExcepcionNombreDeProductoUnico.png)

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/ExcepcionFechaDelProducto.png)

- En la siguiente imagen se puede ver corriendo la parte del frontend por medio del comando ng serve desarrollado con Angular.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendCorriendo.png)

- Aqui se muestra la vista inicial de la API donde esta muestra la lista de diferentes productos que se añadieron

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendPantallaHome.png)

- La siguiente es la pantalla para editar mercancia que sale cuando se hace click sobre alguno de los productos ya registrados.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendPantallaEditar.png)

- Aqui se podra ver la otra pantalla que es de registro, basicamente es muy parecida a la de edicion sin embargo, difieren en cuanto a que la de registro no tiene el boton para eliminar y adicionalmente muestra los campos vacios para registrar un nuevo producto.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendRegistroMercancia.png)

- En el siguiente se puede evidenciar que quedo registrado el producto de la imagen anterior y se ve reflejado en la pantalla home donde se muestra toda la mercancia

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendEvidenciaRegistro.png)

- Aqui se puede ver cuando se desea editar una mercancia, en este ejemplo puse los datos como deben ir para que salga un mensaje con actualizacion existosa.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendEvidenciaEdicionMercancia.png)

- Asi mismo, se mestra que el boton eliminar tambien esta sirviendo.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendEvidenciaEliminarMercancia.png)

- Por ultimo se mostrara en pantalla los mensajes de alerta que saldrian si en dado caso un usuario digita cuando este actualizando mercancia un nombre incorrecto que ya exista, que ingrese un fecha incorrecta que sea posterior a la fecha actual o que un usuario quiera eliminar un registro que no hizo el.

![](https://github.com/MiguelFuquene1024/PruebaTecnicaJava-Nexos/blob/master/Evidencia%20Funcionamiento%20API/FrontendEvidenciaExcepcionUsuario.png)




In la raiz del proyecto de Agular se ejecuta lo siguiente para correr el proyecto:

### `ng serve`

Runs the app in the development mode.\
Open [http://localhost:4200](http://localhost:4200) to view it in the browser.

