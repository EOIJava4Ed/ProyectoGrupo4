# Proyecto de ejemplo Springboot EOI

## Introducción

El Proyecto de Ejemplo Spring Boot EOI es una aplicación guía diseñada para facilitar el aprendizaje de Spring Boot, un poderoso framework de desarrollo de aplicaciones Java. Spring Boot simplifica la creación de aplicaciones empresariales, proporcionando una configuración predefinida y una estructura de proyecto fácil de seguir.

Este proyecto de ejemplo utiliza Spring Boot 3.0.7, una versión estable y confiable de Spring Boot en el momento de su desarrollo. Además, se emplean tecnologías y herramientas adicionales como Maven para la gestión de dependencias y el empaquetado en formato JAR, y Java 20 como el lenguaje de programación principal.

Para el desarrollo de esta aplicación, se recomienda el uso del entorno de desarrollo IntelliJ IDEA, conocido por su amplio conjunto de características y facilidades para el desarrollo de aplicaciones Java. También se sugiere la instalación de algunos plugins, como Docker para la gestión de contenedores, JPA Buddy para mejorar la experiencia de desarrollo con JPA y Database Navigator para explorar y administrar bases de datos directamente desde el IDE.




## Software utilizado

En este proyecto, se utilizan las siguientes tecnologías:

- [Spring Boot 3.0.7](https://spring.io/projects/spring-boot): Spring Boot es un framework de desarrollo de aplicaciones Java que facilita la creación de aplicaciones empresariales. La versión 3.0.7 es la utilizada en este proyecto.

- [Maven](https://maven.apache.org/): Maven es una herramienta de gestión de dependencias y construcción de proyectos. Se utiliza para gestionar las dependencias del proyecto y para empacar la aplicación en formato JAR.

- JAR Packaging: El empaquetado en formato JAR es una forma común de distribuir aplicaciones Java. En este proyecto, se utiliza JAR Packaging para empaquetar la aplicación y hacerla fácilmente ejecutable.

- [Java 20](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html): Java 20 es la versión de Java utilizada en este proyecto. Java es un lenguaje de programación ampliamente utilizado para el desarrollo de aplicaciones.


## Configurar el entorno de desarrollo local

Sigue estos pasos para configurar tu entorno de desarrollo local:

### 1. Instalar IntelliJ IDEA

- Descarga [IntelliJ IDEA](https://www.jetbrains.com/idea/) desde el sitio web oficial.
- Sigue las instrucciones de instalación para tu sistema operativo.
- Una vez instalado, ábrelo y configura tu entorno de trabajo según tus preferencias.

### 2. Instalar los plugins indicados

Para aprovechar al máximo el desarrollo en este proyecto, se recomienda instalar los siguientes plugins en IntelliJ IDEA:

- **Docker**: Este plugin te permite gestionar y administrar contenedores Docker directamente desde el IDE, lo que facilita la integración de tus aplicaciones con Docker.
- **JPA Buddy**: El plugin JPA Buddy mejora la experiencia de desarrollo al proporcionar características específicas para trabajar con JPA (Java Persistence API) en tu proyecto.
- **Database Navigator**: Este plugin te permite explorar y administrar bases de datos directamente desde el IDE, lo que facilita la interacción con tu base de datos durante el desarrollo.
- **SonarLint**: SonarLint te ayudará a detectar errores y defectos de programación en el código, consiguiendo siempre que calidad y seguridad lleguen a los estándares más altos.

### 3. Instalar Docker Desktop

- Descarga [Docker Desktop](https://www.docker.com/products/docker-desktop) según tu sistema operativo.
- Sigue las instrucciones de instalación para tu sistema operativo.
- Una vez instalado, asegúrate de que Docker esté en funcionamiento y configurado correctamente en tu entorno.

Asegúrate de seguir estos pasos para configurar tu entorno de desarrollo local antes de comenzar a trabajar en el proyecto. Esto te permitirá aprovechar al máximo las herramientas y los recursos necesarios para el desarrollo exitoso del proyecto.


## Hacer un Fork del Proyecto

Puedes crear tu propio proyecto spring desde cero desde este link de spring initializer: 

[Spring project](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.7&packaging=jar&jvmVersion=20&groupId=com.eoi&artifactId=springboot&name=springboot&description=Proyecto%20Gu%C3%ADa%20de%20Springboot&packageName=com.eoi.springboot&dependencies=devtools,lombok,configuration-processor,web)

Ese modelo contiene únicamente las dependencias básicas y viene únicamente con la aplicación inicial de SpringBoot.  Puedes utilizarlo como base para trabajar pero deberás seguir los mismos pasos que se siguieron en el proyecto de ejemplo de springboot.



Para hacer un fork del repositorio de ejemplo en GitHub y poder abrirlo en IntelliJ para comparar, sigue estos pasos:

1. Navega hasta el repositorio original en GitHub: [ateixeiramunoz/ejemplospringboot](https://github.com/ateixeiramunoz/ejemplospringboot).
2. Haz clic en el botón "Fork" en la parte superior derecha del repositorio.
3. Selecciona tu cuenta de GitHub como destino para el fork.

Una vez completado, tendrás un nuevo repositorio en tu cuenta de GitHub que es una copia del repositorio original. Ahora puedes clonar este fork en tu entorno local y realizar modificaciones según tus necesidades.

## Actualizar el Fork desde la Versión Principal

Para mantener tu fork actualizado con la versión principal en GitHub, puedes seguir estos pasos:

1. Clona tu fork en tu entorno local utilizando el comando 
2. `git clone` o una herramienta Git de tu elección.

3. Agrega el repositorio original como un control remoto adicional utilizando el comando 
   ```shell
   git remote add upstream https://github.com/ateixeiramunoz/ejemplospringboot
   ```   
Esto establecerá una conexión entre tu fork y el repositorio original.


4. Verifica los remotos configurados en tu repositorio local utilizando el comando
   ```shell
   git remote -v
   ```
5. Deberías ver tu fork (origin) y el repositorio original (upstream).
6. Para actualizar tu fork, primero debes obtener los cambios del repositorio original ejecutando

   ```shell
   git fetch upstream
   ```
Esto traerá las últimas actualizaciones al repositorio local.
   
7. Después de obtener los cambios, puedes combinarlos con tu rama principal utilizando
   ```shell
   git merge upstream/main
   ```
   **¡¡¡Asegúrate de estar en tu rama principal antes de ejecutar este comando!!!!!**

 
8. Si hay conflictos durante la fusión, resuélvelos manualmente editando los archivos afectados.
9. Finalmente, empuja los cambios actualizados a tu fork en GitHub utilizando `git push origin <nombre-de-tu-rama>`.

Con estos pasos, tu fork estará actualizado con los cambios más recientes del repositorio original en GitHub. Puedes repetir este proceso siempre que desees sincronizar tu fork con la versión principal.




## Ejecución del proyecto

Por defecto, el proyecto está configurado para lanzar el perfil "local", el cual utiliza una base de datos H2 en memoria. Esto permite ejecutar la aplicación sin necesidad de configurar una base de datos externa.

Sin embargo, si se elige el perfil "dev", se seleccionará un sistema de conexión en el que deberemos informar las variables de entorno de la base de datos o conectar a una base de datos local de MySQL por defecto. Esto proporciona flexibilidad para utilizar una base de datos más robusta y adecuada para entornos de desarrollo.

La ejecución del proyecto se realiza mediante la configuración de ciertas variables de entorno, que permiten adaptar la aplicación a diferentes escenarios. Estas variables incluyen SPRING_PROFILE para definir el perfil de ejecución, DATABASE_TYPE para especificar el tipo de base de datos a utilizar, DATABASE_NAME para el nombre de la base de datos, DATABASE_USERNAME y DATABASE_PASSWORD para las credenciales de acceso, y DATABASE_HOST y DATABASE_PORT para la ubicación y el puerto del servidor de la base de datos. Además, DATABASE_DRIVER se utiliza para indicar el controlador de la base de datos.

Con el Proyecto de Ejemplo Spring Boot EOI, podrás familiarizarte con los conceptos fundamentales de Spring Boot, incluyendo la configuración automática, la gestión de dependencias, el acceso a bases de datos mediante JPA, entre otros. A través de su estructura organizada y su configuración predefinida, este proyecto te servirá como punto de partida para tus propias aplicaciones basadas en Spring Boot.




## Ejecución del Proyecto en IntelliJ

Sigue estos pasos para ejecutar el proyecto `EjemplospringbootApplication` en IntelliJ:

1. Abre IntelliJ IDEA y selecciona "Open" en la pantalla de inicio.
2. Navega hasta la carpeta del proyecto descargado y haz clic en "Open" para abrirlo en IntelliJ.
3. Espera a que IntelliJ importe y configure el proyecto.
4. Una vez que el proyecto se haya cargado correctamente, busca la clase `EjemplospringbootApplication`. Puedes encontrarla en la ruta `src/main/java/com/eoi/ejemplospringboot/EjemplospringbootApplication.java`.
5. Haz clic derecho en la clase `EjemplospringbootApplication` y selecciona Run 'EjemplospringbootApplication'" para ejecutar la aplicación.
6. IntelliJ compilará y construirá el proyecto, y la aplicación se iniciará.

Si estás utilizando el perfil "local", la aplicación se ejecutará con una base de datos H2 en memoria por defecto. Si deseas utilizar el perfil "dev" con una base de datos MySQL, asegúrate de configurar las variables de entorno necesarias con los detalles de la base de datos, como se describe anteriormente.

Una vez que la aplicación se haya iniciado correctamente, puedes acceder a ella a través de un navegador web en la dirección [http://localhost:8080](http://localhost:8080) (o el puerto especificado en la configuración).

¡Disfruta explorando y probando el proyecto en IntelliJ!


## Ejecución de comandos desde este README.md

Desde este archivo README, si lo abres desde IntelliJ, podrás ejecutar directamente los comandos maven o docker que vayas viendo en la explicación, asi como lanzar las clases de la aplicacion. 


A continuación, se muestran algunos ejemplos de comandos Maven que puedes ejecutar utilizando este formato:

Si indicas nombres de clases o metodos, detecta que es la clase de la aplicación y se prepara para ejecutarla.

`EjemplospringbootApplication`  

Los comandos maven también son funcionales.

`mvn spring-boot:build-image`  

Igual que los de Docker
 ```shell
 docker -v 
 ```

   


## Integración con Docker

El proyecto trabaja con docker como sistema de contendores.

### Generacion de la imagen

Para generar la imagen Docker del proyecto, es necesario ejecutar el goal Maven del plugin spring-boot llamado build-image. Este plugin proporciona una manera conveniente de empacar la aplicación Spring Boot en una imagen Docker.

La sintaxis para ejecutar el goal Maven build-image es la siguiente:

`mvn spring-boot:build-image`


Al ejecutar este comando, Maven generará la imagen Docker del proyecto, incluyendo todas las dependencias y configuraciones necesarias. La imagen resultante se almacenará localmente y podrá ser utilizada para ejecutar contenedores Docker.

Una vez que la imagen Docker esté generada, puedes lanzar un contenedor utilizando la variable de entorno del perfil "local". Para hacerlo, debes ejecutar la siguiente sentencia:

   ```shell
   docker run --name SpringbootLOCAL -e SPRING_PROFILE=local -p 8080:8080 alejandroteixeira/spring-boot:latest
   ```

Esto levantará un contenedor docker que podrás consultar, igual que antes, en http://localhost:8080

## Perfiles de la Aplicación

En el archivo `pom.xml`, se han configurado perfiles que permiten adaptar la ejecución de la aplicación según diferentes entornos o configuraciones específicas. A continuación se detallan los perfiles disponibles:

### Perfil `local`

Este perfil está diseñado para ejecutar la aplicación en un entorno local. No requiere una base de datos externa, ya que utiliza una base de datos H2 en memoria. Es útil durante el desarrollo y las pruebas locales.

### Perfil `dev`

Este perfil está destinado a entornos de desarrollo. Utiliza una base de datos MySQL y se configura con parámetros específicos para este entorno. Puede requerir la configuración de variables de entorno o archivos de propiedades adicionales.

### Perfil `prod`

Este perfil está dirigido a entornos de producción. También utiliza una base de datos MySQL, pero se configura con parámetros específicos para el entorno de producción. Puede requerir configuraciones adicionales y consideraciones de seguridad.

Cada perfil tiene sus propias configuraciones y dependencias específicas que se definen dentro del archivo `pom.xml`. Asegúrate de ajustar estas configuraciones según tus necesidades y entorno de ejecución.

Recuerda que puedes personalizar aún más los perfiles y agregar tus propios perfiles según tus requisitos específicos.

¡Ahora puedes aprovechar los perfiles de la aplicación para adaptarla a diferentes entornos y configuraciones!



## Variables de entorno

Durante la ejecución del proyecto, se utilizan ciertas variables de entorno para adaptar la aplicación a diferentes escenarios, especialmente cuando se activan perfiles específicos. A continuación se enumeran las variables de entorno utilizadas en este proyecto, algunas de las cuales pueden ser necesarias según el perfil activo:

- `SPRING_PROFILE`: Esta variable define el perfil de ejecución de la aplicación y puede ser necesaria para cargar la configuración correspondiente a un perfil específico.
- `DATABASE_TYPE`: Esta variable especifica el tipo de base de datos que se utilizará y puede ser necesaria para configurar correctamente la conexión a la base de datos según el perfil.
- `DATABASE_NAME`: Esta variable define el nombre de la base de datos y puede ser necesaria para establecer la base de datos adecuada según el perfil.
- `DATABASE_USERNAME`: Esta variable define el nombre de usuario para acceder a la base de datos y puede ser necesaria para autenticarse en la base de datos según el perfil.
- `DATABASE_PASSWORD`: Esta variable define la contraseña para acceder a la base de datos y puede ser necesaria para autenticarse en la base de datos según el perfil.
- `DATABASE_HOST`: Esta variable define la ubicación (host) del servidor de la base de datos y puede ser necesaria para establecer la conexión con el servidor de la base de datos según el perfil.
- `DATABASE_PORT`: Esta variable define el puerto del servidor de la base de datos y puede ser necesaria para establecer la conexión con el servidor de la base de datos según el perfil.
- `DATABASE_DRIVER`: Esta variable define el controlador de la base de datos a utilizar y puede ser necesaria para cargar el controlador adecuado según el perfil.

Asegúrate de configurar correctamente estas variables de entorno según tus necesidades y el perfil activo antes de ejecutar el proyecto.



## Crear un modo de ejecución en IntelliJ con variables de entorno

Sigue estos pasos para crear un modo de ejecución en IntelliJ con las variables de entorno proporcionadas:

1. Abre IntelliJ IDEA y carga el proyecto.
2. Haz clic en la configuración de ejecución en la parte superior derecha de la ventana de IntelliJ (generalmente junto al botón de ejecución verde).
3. Selecciona "Edit Configurations" en el menú desplegable.
4. En la ventana de configuraciones, haz clic en el botón "+" en la esquina superior izquierda y selecciona "Spring Boot" en la lista de opciones.
5. En la sección "Environment", agrega las siguientes variables de entorno con los valores correspondientes:

    - Variable: `SPRING_PROFILE`
      Valor: `dev`

    - Variable: `DATABASE_TYPE`
      Valor: `mysql`

    - Variable: `DATABASE_NAME`
      Valor: `springboot`

    - Variable: `DATABASE_USERNAME`
      Valor: `root`

    - Variable: `DATABASE_PASSWORD`
      Valor: `password`

    - Variable: `DATABASE_HOST`
      Valor: `localhost`

    - Variable: `DATABASE_PORT`
      Valor: `3306`

    - Variable: `DATABASE_DRIVER`
      Valor: `com.mysql.cj.jdbc.Driver`

6. En la parte inferior de la ventana de configuraciones, selecciona la clase principal del proyecto (por ejemplo, `EjemplospringbootApplication`) como el punto de entrada.
7. Haz clic en "Apply" y luego en "OK" para guardar la configuración.

Ahora puedes ejecutar el proyecto en IntelliJ utilizando este modo de ejecución con las variables de entorno especificadas. Asegúrate de seleccionar esta configuración antes de ejecutar el proyecto para utilizar los valores proporcionados.

Recuerda que estos valores son solo un ejemplo y puedes ajustarlos según tus necesidades y configuración específica.


## Levantar un contenedor MySQL con el plugin de Docker en IntelliJ

El plugin de Docker en IntelliJ te permite gestionar y administrar contenedores Docker directamente desde el IDE, lo que facilita la integración de tus aplicaciones con Docker.

Para levantar un contenedor MySQL utilizando el plugin de Docker en IntelliJ en la ventana de servicios, puedes seguir estos pasos:

1. Asegúrate de tener el plugin de Docker instalado en IntelliJ. Si no lo tienes instalado, puedes ir a `File > Settings > Plugins` y buscar "Docker" en el Marketplace de IntelliJ para instalarlo.

2. Abre IntelliJ IDEA y carga tu proyecto.

3. Haz clic en la pestaña "Services" en la parte inferior izquierda de la ventana de IntelliJ para abrir la ventana de servicios.

4. En la ventana de servicios, haz clic derecho en la sección "Images" y selecciona la opción "Pull".

5. En el campo "Image name", ingresa `mysql:latest` para descargar la imagen más reciente de MySQL directamente desde Docker Hub.

6. Haz clic en el botón "OK" para iniciar la descarga de la imagen de MySQL.

7. Una vez descargada la imagen, haz click derecho sobre ella y selecciona la opción "Create Container".

8. En la sección "Port bindings", haz clic en el botón "+" para agregar una nueva asignación de puertos. Especifica el puerto 3036 en el campo "Host port" y el puerto 3306 en el campo "Container port".

9. En la sección "Environment variables", haz clic en el botón "+" para agregar una nueva variable de entorno. Ingresa `MYSQL_ROOT_PASSWORD` como nombre y `password` como valor.

10. Haz clic en el botón "OK" para crear el contenedor.

11. Espera a que el contenedor se inicie correctamente. Puedes verificar el estado del contenedor y los registros en la ventana de servicios.

12. Ahora, puedes conectarte al servidor de MySQL utilizando una herramienta de administración de bases de datos o ejecutando comandos SQL desde la línea de comandos.

- Host: `localhost` o `127.0.0.1`
- Puerto: `3036`
- Nombre de usuario: `root`
- Contraseña: `password`

Recuerda que este es solo un ejemplo y puedes ajustar los valores según tus necesidades, como los puertos de publicación y la contraseña de root.

¡Listo! Ahora tienes un contenedor MySQL en ejecución con la contraseña de root "password" y el puerto 3036 publicado en tu sistema utilizando el plugin de Docker en IntelliJ en la ventana de servicios.



## Ejecutar la aplicación y la base de datos en diferentes contenedores de Docker

Si deseas ejecutar la aplicación y la base de datos en diferentes contenedores de Docker en el mismo sistema, es recomendable crear una red personalizada en el plugin de Docker en IntelliJ y unir el contenedor MySQL a esa red. Esto permite una comunicación fácil y segura entre los contenedores.

Puedes seguir estos pasos para crear una red personalizada y unir el contenedor MySQL a esa red utilizando el plugin de Docker en IntelliJ:

1. Abre IntelliJ IDEA y carga tu proyecto.

2. Haz clic en la pestaña "Services" en la parte inferior izquierda de la ventana de IntelliJ para abrir la ventana de servicios.

3. En la ventana de servicios, haz clic derecho en la sección "Networks" y selecciona la opción "Create Network".

4. En la ventana emergente, ingresa un nombre para la red en el campo "Name" y haz clic en el botón "OK" para crear la red personalizada.

5. Una vez creada la red, haz clic derecho en el contenedor MySQL que creaste antes  y selecciona la opción "Edit Container Settings".

6. En la configuración del contenedor, ve a la sección "Networks" y haz clic en el botón "+" para agregar una nueva red.

7. Selecciona la red personalizada que creaste en el paso anterior y haz clic en el botón "OK" para unir el contenedor MySQL a esa red.

8. Guarda los cambios en la configuración del contenedor. Vuelve a crear el contenedor con la nueva configuración pulsando botón derecho sobre él. 

9. Ahora, puedes crear un nuevo contenedor para ejecutar la aplicación y unirlo a la misma red personalizada.

10. Para crear el contenedor de la aplicación, sigue los pasos mencionados anteriormente para crear un contenedor, pero selecciona la imagen de la aplicación y configura los puertos y variables de entorno según sea necesario. 
    
    Puedes tomar estos como ejemplo:
  
    - Variable: `SPRING_PROFILE`
      Valor: `dev`

    - Variable: `DATABASE_TYPE`
      Valor: `mysql`

    - Variable: `DATABASE_NAME`
      Valor: `springboot`

    - Variable: `DATABASE_USERNAME`
      Valor: `root`

    - Variable: `DATABASE_PASSWORD`
      Valor: `password`

    - Variable: `DATABASE_HOST`
      Valor: `localhost`

    - Variable: `DATABASE_PORT`
      Valor: `3306`

    - Variable: `DATABASE_DRIVER`
      Valor: `com.mysql.cj.jdbc.Driver`

11. En la configuración del contenedor de la aplicación, ve a la sección "Networks" y selecciona la misma red personalizada que seleccionaste para el contenedor MySQL.

12. Guarda los cambios en la configuración del contenedor de la aplicación.

13. Ahora, tanto el contenedor de la aplicación como el contenedor MySQL están conectados a la misma red personalizada, lo que les permite comunicarse entre sí.

Recuerda que este es solo un ejemplo y puedes ajustar los valores y configuraciones según tus necesidades, como los nombres de la red, las imágenes de los contenedores y las variables de entorno.

También puedes lanzar ambas directamente con los comandos:

   ```shell
   docker run -p 3306:3306 --env MYSQL_ROOT_PASSWORD=password --name mysql-server-dev --pull missing --network springboot mysql:latest
   ```

   ```shell
   docker run -p 0.0.0.0:80:8080 --env DATABASE_HOST=mysql-server-dev --env SPRING_PROFILE=dev --name SpringbootAPP-DESARROLLO --pull missing --network springboot alejandroteixeira/spring-boot:latest
   ```

¡Listo! Ahora puedes ejecutar la aplicación y la base de datos en diferentes contenedores de Docker en el mismo sistema utilizando una red personalizada.

Al ser la versión de desarrollo y no la local, en este caso la hemos publicado en el puerto 80 para diferenciarlas, por lo que podrás acceder directamente desde  [http://localhost](http://localhost)

### Ciclo de Vida de Maven

El ciclo de vida de Maven consta de una serie de fases que se ejecutan secuencialmente para construir y gestionar un proyecto. Cada fase realiza tareas específicas en el proceso de desarrollo y construcción del proyecto. A continuación se describen las principales fases del ciclo de vida de Maven:

#### clean
La fase `clean` se encarga de eliminar los archivos generados en compilaciones anteriores, como los directorios `target` y los archivos de compilación.

Comando Maven: `mvn clean`

#### validate
La fase `validate` valida la estructura y la sintaxis del proyecto para asegurarse de que es válido y que todas las dependencias necesarias están disponibles.

Comando Maven: `mvn validate`

#### compile
La fase `compile` compila los archivos fuente del proyecto y genera los archivos compilados, como los archivos `.class` para proyectos Java, en el directorio `target`.

Comando Maven: `mvn compile`

#### test
En la fase `test`, Maven ejecuta las pruebas unitarias del proyecto. Busca los archivos de prueba ubicados en el directorio `src/test` y los ejecuta utilizando un marco de pruebas como JUnit.

Comando Maven: `mvn test`

#### package
En la fase `package`, Maven empaca los archivos compilados y otros recursos necesarios en un formato específico, como un archivo JAR para proyectos Java.

Comando Maven: `mvn package`

#### verify
La fase `verify` realiza verificaciones adicionales sobre el proyecto y los resultados de las pruebas.

Comando Maven: `mvn verify`

#### install
En la fase `install`, Maven instala el artefacto en el repositorio local de Maven. Esto permite su reutilización en otros proyectos.

Comando Maven: `mvn install`

#### deploy
La fase `deploy` copia el artefacto en un repositorio remoto, como un servidor de artefactos Maven, para su distribución o uso por otros desarrolladores.

Comando Maven: `mvn deploy`

Estas son las fases principales del ciclo de vida de Maven. Cada una de ellas cumple una función específica en el proceso de construcción y gestión del proyecto. Maven permite ejecutar estas fases de forma individual o como parte del ciclo completo para llevar a cabo diversas tareas en el desarrollo de software.

La orden para lanzar el ciclo completo de Maven es simplemente ejecutar el comando:

`mvn clean deploy` 

Este comando ejecutará todas las fases del ciclo de vida de Maven, desde la fase clean hasta la fase deploy.

La fase deploy es una de las fases finales del ciclo de vida de Maven y se utiliza para publicar los artefactos del proyecto en un repositorio remoto, como un repositorio Maven corporativo o un repositorio en la nube. Esto permite compartir y distribuir el artefacto generado con otros desarrolladores o sistemas.

Es importante tener en cuenta que para ejecutar correctamente la fase deploy, es necesario configurar correctamente el repositorio remoto en el archivo settings.xml de Maven, proporcionando las credenciales de acceso y la URL del repositorio remoto.

Al ejecutar el comando mvn clean deploy, Maven ejecutará todas las fases del ciclo de vida hasta llegar a la fase deploy, donde se realizará el despliegue del artefacto en el repositorio remoto configurado.

Recuerda que para utilizar correctamente el comando mvn clean deploy, debes estar ubicado en el directorio raíz del proyecto donde se encuentra el archivo pom.xml.


## Plugins Maven

Los plugins se configuran en el archivo pom.xml y se ejecutan en fases específicas del ciclo de vida de Maven. Estos plugins nos brindan funcionalidades adicionales y nos permiten realizar diversas acciones durante el proceso de construcción, prueba y despliegue de la aplicación.

Cada plugin cumple un rol específico en el ciclo de vida de la aplicación y nos ayuda a automatizar tareas importantes. Su configuración adecuada en el archivo pom.xml nos permite aprovechar al máximo estas funcionalidades y mejorar la eficiencia de nuestro proceso de desarrollo y despliegue.



Algunos de los plugins comunes utilizados en el proyecto son:


### Plugin Docker Maven

El plugin `Docker Maven` se utiliza para interactuar con Docker desde Maven. Proporciona funcionalidades para construir, ejecutar y administrar contenedores Docker en el proceso de compilación y prueba de una aplicación.

Con este plugin, puedes:

- Construir y gestionar imágenes de Docker.
- Configurar los contenedores y las redes necesarias.
- Realizar acciones como iniciar y detener los contenedores durante diferentes fases del ciclo de vida de Maven.


### Plugin Surefire Maven

El plugin `Surefire Maven` se utiliza para ejecutar los tests unitarios en Maven. Proporciona un entorno de ejecución para las pruebas unitarias y garantiza que los resultados sean mostrados correctamente en los informes.

Con este plugin, puedes:

- Ejecutar los tests unitarios definidos en tu proyecto.
- Configurar opciones de ejecución, como patrones de inclusión y exclusión de tests.
- Ejecutar y generar informes sobre los tests unitarios, asegurando la calidad del código y detectando posibles errores.




## Plugin Failsafe Maven

El plugin `Failsafe Maven` es una extensión del plugin `Surefire Maven` que se utiliza para ejecutar los tests de integración en Maven. Proporciona un entorno separado para los tests de integración, permitiendo una mayor flexibilidad y configuración.

Con este plugin, puedes:

- Definir ejecuciones de tests de integración.
- Ejecutar pruebas que involucran componentes más grandes de la aplicación y asegura la integración correcta de los diferentes módulos.
- Especificar patrones de inclusión y exclusión de los tests.
- Verificar los resultados de los tests de integración.




# Uso de WebJars en mi proyecto

En este proyecto, estamos utilizando WebJars para gestionar las dependencias de bibliotecas web, específicamente `webjars-locator` y `bootstrap`. A continuación, explicaré cómo funciona WebJars y por qué lo estamos utilizando.

## ¿Qué es WebJars?

WebJars es un enfoque para empaquetar bibliotecas web y recursos estáticos en archivos JAR (Java Archive) para su fácil consumo en aplicaciones basadas en Maven. Proporciona una forma conveniente de administrar y utilizar bibliotecas web en proyectos Java.

## Ventajas de utilizar WebJars

- **Gestión sencilla de dependencias**: Con WebJars y Maven, puedes agregar fácilmente dependencias de bibliotecas web en tu proyecto sin tener que descargar y configurar manualmente los archivos de bibliotecas.

- **Control de versiones**: Al utilizar WebJars, puedes especificar fácilmente la versión de la biblioteca que deseas utilizar. Maven se encarga de descargar la versión específica y mantener un control estricto de las dependencias.

- **Facilidad de uso**: Los recursos de las bibliotecas web empaquetadas en WebJars son accesibles a través de rutas predefinidas y coherentes, lo que facilita su uso en tu proyecto sin tener que preocuparte por la ubicación de los archivos.


## Funcionamiento de WebJars

Cuando agregas una dependencia de WebJars a tu proyecto Maven, como `webjars-locator` y `bootstrap`, Maven se encarga de descargar automáticamente los archivos JAR correspondientes y colocarlos en el directorio `target/webjars` de tu proyecto.

## Código HTML de la aplicación para importar librerias y css desde webjars

En el código HTML, hemos agregado enlaces a los archivos de JavaScript y CSS de Bootstrap utilizando las rutas proporcionadas por WebJars. Estas rutas comienzan con `/webjars/` seguido del nombre de la biblioteca y la ubicación del archivo dentro del archivo JAR.


```markdown
<!DOCTYPE html>
<html lang="en">
<title>WebJars Demo</title>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <div class="content"></div>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
```


Cargar el script de Bootstrap al final del archivo HTML es una práctica recomendada conocida como "deferred loading" (carga diferida). Esta práctica se utiliza para mejorar el rendimiento y la velocidad de carga de la página.

Cuando se carga el script de Bootstrap al final del archivo HTML, se permite que el contenido HTML y los estilos CSS se carguen y rendericen primero. Esto evita el bloqueo del proceso de renderizado mientras se descarga y ejecuta el script de Bootstrap.

Al cargar los estilos CSS primero, el navegador puede aplicar los estilos a medida que el contenido se va mostrando en la pantalla, lo que mejora la apariencia visual y la experiencia del usuario. Luego, al cargar el script de Bootstrap al final, se asegura de que todos los elementos de la página ya estén disponibles y listos para interactuar con el JavaScript de Bootstrap.

Esta práctica ayuda a evitar el "efecto de bloqueo de renderizado" y garantiza que la página se cargue y muestre rápidamente, proporcionando una mejor experiencia de usuario.

Es importante tener en cuenta que esta recomendación es aplicable cuando no hay dependencias críticas de JavaScript que deban cargarse antes de que se renderice el contenido principal de la página. Si tienes dependencias específicas que requieren la carga del script de Bootstrap antes, deberás ajustar la ubicación del enlace al script en consecuencia.



Principios de programación de Spring Boot y Java aplicados en la aplicación
=======================================

En esta aplicación, se han aplicado varios principios de programación de Spring Boot y Java para lograr una arquitectura sólida y un código limpio y mantenible. A continuación, se describen algunos de los principios clave que se han utilizado en la creación de las interfaces y clases abstractas mencionadas.

### Inversión de Control (IoC)

La Inversión de Control es un principio fundamental en Spring Boot que permite desacoplar las dependencias y mover la responsabilidad de la creación y gestión de objetos a un contenedor de IoC, como el contenedor de Spring. En la aplicación, se ha aplicado este principio al utilizar anotaciones como `@Autowired` para inyectar dependencias, como los repositorios, en las clases correspondientes. Esto permite que el contenedor de Spring se encargue de crear y gestionar las instancias de las dependencias necesarias.

**Ejemplo:**

```java
@Autowired
private UserRepository userRepository;
```

### Inyección de Dependencias (DI)

La Inyección de Dependencias es un patrón que se utiliza para proporcionar dependencias a un objeto en lugar de que el objeto las cree o las busque por sí mismo. En la aplicación, se ha utilizado la inyección de dependencias en diferentes clases, como en `GenericServiceWithJPA`, `MiControladorGenerico` y `UsuarioController`. Al inyectar las dependencias, como los servicios y repositorios, a través de constructores o métodos anotados con `@Autowired`, se logra un bajo acoplamiento entre las clases y se facilita la prueba y el intercambio de implementaciones.


**Inyección de Dependencias (DI)**

```java
@Autowired
public MiControladorGenerico(GenericServiceWithJPA<T, ?> service) {
    this.service = service;
}
```


### Principio de Abstracción

El Principio de Abstracción es una práctica común en la programación orientada a objetos que busca abstraer los detalles internos de una implementación y proporcionar una interfaz genérica y reutilizable. En la aplicación, se ha aplicado este principio en las interfaces `GenericService` y `GenericServiceWithJPA`, que definen métodos genéricos para realizar operaciones CRUD en entidades. Estas interfaces permiten que se reutilice el código en diferentes partes de la aplicación sin conocer los detalles específicos de la implementación.


**Principio de Abstracción**

```java
public interface GenericService<T> {
    T getById(Object id);
    T create(T entity);
    T update(Object id, T entity);
    void delete(Object id);
    List<T> listAll();
    JpaRepository<T, ?> getRepository();
}
```

### Separación de Responsabilidades

La Separación de Responsabilidades es un principio importante para mantener un código limpio y mantenible. En la aplicación, se ha buscado separar las responsabilidades mediante la creación de clases abstractas, como `GenericServiceWithJPA` y `MiControladorGenerico`, que proporcionan una implementación base para funcionalidades comunes. Estas clases abstractas encapsulan la lógica de acceso a datos y operaciones CRUD, lo que permite a las clases concretas especializadas centrarse en aspectos específicos de la aplicación.

### Herencia y Polimorfismo

El uso de herencia y polimorfismo es un principio clave en la programación orientada a objetos. En la aplicación, se ha utilizado la herencia y el polimorfismo al crear clases abstractas como `GenericServiceWithJPA` y `MiControladorGenerico`. Estas clases abstractas definen métodos comunes y proporcionan una estructura   base para que las clases concretas hereden de ellas y extiendan su funcionalidad. Esto fomenta la reutilización del código y la consistencia en la implementación de las clases concretas.

### Principios de Diseño SOLID

Se han aplicado algunos principios del diseño SOLID en la creación de las interfaces y clases abstractas. Entre ellos:

- **Principio de Responsabilidad Única (SRP)**: Cada clase tiene una única responsabilidad y un único motivo para cambiar. Las interfaces `GenericService` y `GenericServiceWithJPA` tienen la responsabilidad de definir operaciones CRUD genéricas, mientras que las clases concretas se encargan de la implementación específica.

- **Principio de Abierto/Cerrado (OCP)**: Las interfaces y clases abstractas se diseñan para ser abiertas a la extensión y cerradas a la modificación. Pueden ser extendidas por clases concretas para agregar funcionalidades adicionales sin modificar el código existente.

- **Principio de Sustitución de Liskov (LSP)**: Las clases concretas que implementan las interfaces se pueden sustituir por las interfaces base sin afectar el comportamiento de la aplicación. Esto permite el uso polimórfico de las clases y promueve la cohesión y flexibilidad.




Tratamiento de Errores en la Aplicación
=======================================

En la aplicación, se ha implementado un manejo de errores personalizado para proporcionar una respuesta adecuada a las excepciones que pueden ocurrir durante la ejecución. Esto se logra mediante el uso de las clases `CustomExceptionHandler` y `ErrorController`.

`CustomExceptionHandler` es una clase anotada con `@ControllerAdvice`, que permite manejar excepciones específicas y proporcionar una respuesta personalizada. A continuación, se describen los métodos de manejo de excepciones implementados:

- `handleEntityNotFoundException`: Maneja la excepción `EntityNotFoundException` y agrega los atributos necesarios al modelo para mostrar un mensaje descriptivo del error.
- `handleMiEntidadNoEncontradaException`: Maneja la excepción `MiEntidadNoEncontradaException` y agrega los atributos necesarios al modelo para mostrar un mensaje específico del error.
- `handleParametrosIncorrectosException`: Maneja la excepción `ParametrosIncorrectosException` y agrega los atributos necesarios al modelo para mostrar un mensaje indicando que los parámetros son incorrectos.
- `handleException`: Maneja excepciones no controladas y agrega los atributos necesarios al modelo para mostrar un mensaje genérico de error.

Además, la clase contiene la clase interna `ErrorResponse`, que se utiliza para representar la respuesta de error. Esta clase tiene atributos para el mensaje de error, el mensaje descriptivo y la causa de la excepción.

Por otro lado, la clase `ErrorController` implementa la interfaz `ErrorController` de Spring Boot y se encarga de manejar los errores generados durante la ejecución de la aplicación. El método `handleError` se utiliza para procesar las excepciones y mostrar una página de error personalizada.

En el caso de que se produzca una excepción `TemplateInputException`, se agrega la lógica necesaria para manejarla, como la adición de atributos al modelo para mostrar un mensaje específico de error relacionado con la carga de la plantilla.

En cualquier otra excepción no controlada, se proporciona una respuesta genérica con un mensaje descriptivo del error.

Estas clases y su manejo de errores forman parte de la arquitectura de la aplicación Spring Boot, siguiendo los principios de Inversión de Control (IoC) y el Principio de Abstracción. Además, se utiliza la anotación `@ControllerAdvice` para centralizar el manejo de excepciones y lograr un código más limpio y mantenible.


### La Limitación de CustomExceptionHandler para Manejar Excepciones de Thymeleaf


La clase `CustomExceptionHandler` proporciona un mecanismo para manejar excepciones personalizadas en la aplicación y ofrecer una respuesta adecuada. Sin embargo, presenta una limitación en el manejo de excepciones específicas de Thymeleaf, como la `TemplateInputException`. A continuación, se explica por qué `CustomExceptionHandler` no puede manejar directamente estas excepciones:

En el caso de las excepciones de Thymeleaf, como la `TemplateInputException`, estas se lanzan durante la etapa de procesamiento de plantillas y son capturadas internamente por el motor de Thymeleaf. Esto significa que no se propagan directamente a la capa de manejo de excepciones de Spring.

Debido a esta limitación, `CustomExceptionHandler` no puede capturar y manejar directamente las excepciones específicas de Thymeleaf. En su lugar, se utiliza el `ErrorController` para abordar estas excepciones y proporcionar una respuesta personalizada.

Al implementar el `ErrorController`, se tiene acceso directo a la excepción lanzada y se puede verificar si es una `ServletException` con una causa de `TemplateInputException`. En caso afirmativo, se puede agregar la lógica necesaria para manejar específicamente esta excepción, como agregar atributos al modelo para mostrar un mensaje descriptivo relacionado con la carga de la plantilla.

En resumen, la necesidad de tener un `ErrorController` para manejar las excepciones de Thymeleaf radica en la forma en que estas excepciones son lanzadas y capturadas internamente por el motor de Thymeleaf. El `ErrorController` brinda la capacidad de interceptar estas excepciones y proporcionar una respuesta personalizada en caso de errores relacionados con Thymeleaf.

Esta consideración forma parte de la arquitectura de la aplicación Spring Boot, siguiendo los principios de Inversión de Control (IoC) y el Principio de Abstracción. Al utilizar el `ErrorController` junto con `CustomExceptionHandler`, se logra un manejo completo y consistente de excepciones en la aplicación.


### Manejo de Excepciones de Thymeleaf con ErrorController


En la aplicación, se utiliza la clase `ErrorController` para manejar las excepciones relacionadas con Thymeleaf y mostrar una página de error personalizada. A continuación, se explica la necesidad de tener un `ErrorController` y cómo se implementa en la aplicación:

La clase `ErrorController` implementa la interfaz `ErrorController` de Spring Boot, lo que le permite manejar los errores generados durante la ejecución de la aplicación. Esto es especialmente útil para capturar y manejar las excepciones relacionadas con Thymeleaf, como la `TemplateInputException`, que ocurre cuando hay un error en la carga de una plantilla.

El método `handleError` se encarga de procesar estas excepciones y mostrar una página de error personalizada. A través del parámetro `request` de tipo `HttpServletRequest`, se obtiene la información relacionada con el error, como la excepción lanzada. Luego, se verifica si la excepción es una `ServletException` con una causa de `TemplateInputException`. En ese caso, se agrega la lógica necesaria para manejar la excepción de Thymeleaf, como la adición de atributos al modelo para mostrar un mensaje específico de error relacionado con la carga de la plantilla.

Si la excepción no es una `TemplateInputException`, se proporciona una respuesta genérica con un mensaje descriptivo del error. Esto permite manejar otras excepciones no controladas de Thymeleaf de manera adecuada.

La implementación del `ErrorController` en la aplicación garantiza que todas las excepciones relacionadas con Thymeleaf sean capturadas y manejadas de manera consistente. Además, al mostrar una página de error personalizada, se mejora la experiencia del usuario y se proporciona información útil sobre el error ocurrido.

Esta funcionalidad forma parte de la arquitectura de la aplicación Spring Boot, siguiendo los principios de Inversión de Control (IoC) y el Principio de Abstracción. Además, se utiliza la interfaz `ErrorController` para centralizar el manejo de excepciones relacionadas con Thymeleaf y lograr un código más limpio y mantenible.



# Implementación de seguridad en el proyecto con Spring Security

En este proyecto, hemos implementado la seguridad utilizando Spring Security para proteger nuestros recursos y controlar el acceso de los usuarios. A continuación, se proporciona una explicación detallada del procedimiento y las clases involucradas en la implementación de la seguridad.

## Configuración de seguridad

La clase principal encargada de la configuración de seguridad es `MySecurityConfig`. Esta clase es anotada con `@Configuration` y `@EnableWebSecurity`, lo que indica que es una clase de configuración de Spring y habilita la funcionalidad de seguridad web de Spring Security.

La clase `MySecurityConfig` define un bean llamado `securityFilterChain`, que es un objeto de tipo `SecurityFilterChain`. Este bean se utiliza para configurar el comportamiento de Spring Security y definir las reglas de autorización para las solicitudes entrantes. Se utiliza el objeto `HttpSecurity` para configurar la cadena de filtros de autorización.

Dentro del método `securityFilterChain`, se definen las reglas de autorización utilizando el método `authorizeHttpRequests` del objeto `HttpSecurity`. Aquí se establecen las siguientes reglas:

- Se permite el acceso a la raíz del sitio y a la página de inicio (`"/", ""`) para todos (`permitAll()`).
- Se permite el acceso a los recursos estáticos de webjars (`"/webjars/**"`) para todos (`permitAll()`).
- Se permite el acceso a las páginas de error (`"/error/**"`) para todos (`permitAll()`).
- Se requiere autenticación para cualquier otra solicitud (`anyRequest().authenticated()`).

También se configura la página de inicio de sesión personalizada utilizando el método `formLogin` del objeto `HttpSecurity`. Se especifica la página de inicio de sesión (`"/login"`), la URL donde se procesará automáticamente la solicitud de inicio de sesión (`"/login"`), la URL por defecto después de un inicio de sesión exitoso (`"/"`) y se permite el acceso a todos (`permitAll()`).

Además, se configura el sistema de cierre de sesión de la aplicación utilizando el método `logout` del objeto `HttpSecurity`. Aquí se permite el acceso a todos (`permitAll()`).

En el método `securityFilterChainLocal`, se define otro bean de `SecurityFilterChain` específico para el perfil "local". Aquí se desactiva temporalmente la protección CSRF y las opciones de marco (`frameOptions`) para permitir el acceso a la consola de H2 (`/h2-console`) en entornos locales. Se configura una regla para permitir el acceso a la consola de H2.

## Clase de detalles del usuario

La clase `MyUserDetails` implementa la interfaz `UserDetails` de Spring Security y proporciona los detalles del usuario necesarios para la autenticación y autorización. Esta clase contiene campos para el nombre de usuario, contraseña y otros atributos del usuario.

Implementa los métodos de la interfaz `UserDetails`, como `getAuthorities`, `getPassword`, `getUsername`, etc., para proporcionar la información requerida por Spring Security. También se definen métodos setter y getter para los campos adicionales del usuario de nuestra aplicación.

## Servicio de detalles del usuario

La clase `MyUserDetailsService` implementa la interfaz `UserDetailsService` de Spring Security y se utiliza para cargar los detalles del usuario desde la base de datos. Esta clase se encarga de buscar y obtener los detalles del usuario de la base de datos y crear un objeto `MyUserDetails` personalizado con esos detalles.

En el método `loadUserByUsername`, se recibe el nombre de usuario como parámetro y se utiliza el repositorio de usuarios (`UsuarioRepository`) para buscar el usuario correspondiente en la base de datos. Si se encuentra el usuario, se asignan los detalles del usuario a un objeto `MyUserDetails` y se devuelven. Los detalles incluyen el nombre de usuario, la contraseña, los roles y otros atributos del usuario.

Además, se definen métodos privados dentro de `MyUserDetailsService` para obtener los roles y permisos del usuario. Estos métodos se utilizan para construir la lista de autoridades (`GrantedAuthority`) que se asigna al objeto `MyUserDetails`.

## Codificación de contraseñas

La clase `MySecurityConfig` define un bean llamado `passwordEncoder`, que utiliza `BCryptPasswordEncoder` para codificar las contraseñas de los usuarios. Este bean se utiliza para codificar y verificar las contraseñas almacenadas en la base de datos. Se recomienda utilizar un algoritmo de codificación seguro como bcrypt para almacenar las contraseñas de manera segura.

## Conclusiones

En resumen, para implementar la seguridad en nuestro proyecto con Spring Security, hemos configurado la clase `MySecurityConfig` para definir las reglas de autorización y la página de inicio de sesión personalizada. La clase `MyUserDetails` proporciona los detalles del usuario necesario para la autenticación y autorización, mientras que `MyUserDetailsService` se encarga de cargar los detalles del usuario desde la base de datos.

Además, hemos utilizado `BCryptPasswordEncoder` para codificar las contraseñas de los usuarios y garantizar la seguridad de las mismas.

Esta implementación nos permite proteger nuestros recursos, controlar el acceso de los usuarios y gestionar la autenticación y autorización en nuestro proyecto utilizando Spring Security.



## Integración de Thymeleaf con Spring Security

La integración de Thymeleaf con Spring Security permite personalizar la interfaz de usuario de acuerdo con el estado de autenticación y los roles de los usuarios. Thymeleaf proporciona el dialecto de seguridad de Spring, que incluye atributos y etiquetas especiales para mostrar u ocultar contenido basado en la autorización y la autenticación del usuario.

En los archivos HTML proporcionados, se utilizan diferentes elementos de Thymeleaf y el dialecto de seguridad para lograr esta personalización.

### Objetos #authorization y #authorization.principal

En la integración de Thymeleaf con Spring Security, los objetos `#authorization` y `#principal` tienen una relación con la interfaz `Authentication` de Spring Security.

La interfaz `Authentication` cumple dos propósitos principales dentro de Spring Security:

1. Proporciona las credenciales que un usuario ha proporcionado para la autenticación, como entrada al `AuthenticationManager`. En este escenario, `isAuthenticated()` devuelve `false`.

2. Representa al usuario actualmente autenticado. Puedes obtener la instancia actual de `Authentication` desde el `SecurityContext`.

La interfaz `Authentication` contiene las siguientes propiedades:

- `principal`: Identifica al usuario. Es una instancia de `UserDetails`.

- `credentials`: A menudo, una contraseña. En muchos casos, esta propiedad se borra después de que el usuario se autentica, para asegurarse de que no se filtre.

- `authorities`: Las instancias de `GrantedAuthority` representan permisos de alto nivel otorgados al usuario. En nuestra aplicación son los roles y los permisos.

En resumen, el objeto `#authorization` se utiliza para evaluar expresiones de autorización en las plantillas HTML, y el objeto `#authorization.principal` proporciona acceso a los detalles del usuario autenticado, como el `UserDetails`. Ambos objetos están relacionados con la interfaz `Authentication` de Spring Security, que se utiliza para proporcionar credenciales y representar al usuario autenticado.



### Index

En el archivo `index.html`, se utiliza el atributo `sec:authorize` junto con la expresión `isAuthenticated()` en la etiqueta `<h1>` para mostrar el saludo "Hello [nombre]" solo si el usuario está autenticado. La expresión `${#authentication.principal.nombre}` se utiliza para obtener el nombre del usuario autenticado y mostrarlo dinámicamente.

Además, se utilizan las etiquetas `<div>` con las clases `alert alert-success`, `alert alert-primary` y `d-flex` junto con el atributo `sec:authorize` y las expresiones `hasAuthority('ROLE_ADMIN')` y `hasAuthority('ROLE_USUARIO')` para mostrar contenido específico basado en los roles del usuario autenticado. Estas etiquetas muestran mensajes e iconos diferentes según el rol del usuario.

El formulario `<form>` con el atributo `sec:authorize="isAuthenticated()"` y la etiqueta `<input>` dentro del mismo se muestran solo si el usuario está autenticado. Este formulario se utiliza para realizar la acción de cierre de sesión con `th:action="@{/logout}"`.

### Modal

En el archivo `modal.html`, se utiliza la etiqueta `<img>` con el atributo `th:src="${#authentication.principal.imageUrl}"` para mostrar la imagen de perfil del usuario autenticado. La expresión `${#authentication.principal.imageUrl}` se utiliza para obtener la URL de la imagen de perfil desde el objeto principal del usuario autenticado.

Además, se utiliza la etiqueta `<span>` con la expresión `th:text="${#authentication.principal.username}"` para mostrar el nombre de usuario del usuario autenticado.

El fragmento `fragments/permisos` se incluye utilizando la etiqueta `<div th:replace="fragments/permisos :: permisos">` para mostrar los permisos del usuario autenticado. Este fragmento utiliza la etiqueta `<span>` con la expresión `th:each="permiso : ${#authentication.principal.getAuthorities()}"` para iterar sobre la lista de permisos y mostrarlos en forma de insignias.

### Fragmento de Permisos

En el archivo `permisos.html`, se utiliza el atributo `sec:authorize` junto con la expresión `isAuthenticated()` en la etiqueta `<div>` para mostrar el título "Estos son tus permisos" solo si el usuario está autenticado.

La etiqueta `<span>` con la expresión `th:each="permiso : ${#authentication.principal.getAuthorities()}"` se utiliza para iterar sobre la lista de permisos del usuario autenticado y mostrar cada permiso en forma de insignia.

En resumen, la integración de Thymeleaf con Spring Security en los archivos HTML proporcionados se realiza utilizando atributos y


## Logging con Log4j2 y Lombok

Log4j2 es un framework de registro (logging) ampliamente utilizado en aplicaciones Java para capturar y administrar los mensajes de registro. Lombok es una biblioteca que simplifica el desarrollo de Java al reducir la necesidad de escribir código repetitivo, como los métodos getter/setter o constructores. Al combinar Log4j2 y Lombok, puedes lograr configuraciones de logging más concisas y legibles.

Para utilizar Log4j2 con Lombok en tu aplicación Spring Boot, hemos seguido estos pasos:



### Control de Niveles de Log en Spring Boot, Hibernate y JPA

En una aplicación Spring Boot que utiliza Hibernate y JPA, es posible controlar los niveles de log de cada componente mediante la configuración de archivos `.properties`. Aquí se explica cómo:

1. Crea un archivo de configuración `.properties` (por ejemplo, `application.properties`) si aún no lo tienes en tu proyecto.

2. Para controlar los niveles de log de Spring Boot, agrega las siguientes propiedades en el archivo `.properties` y establece el nivel de log deseado (puedes elegir uno de los niveles `TRACE`, `DEBUG`, `INFO`, `WARN`, `ERROR`):

```
# Nivel de log de Spring Boot
logging.level.root=INFO
logging.level.org.springframework=INFO
```

3. Para controlar los niveles de log de Hibernate y JPA, agrega las siguientes propiedades en el archivo `.properties` y establece el nivel de log deseado:

```
Nivel de log de Hibernate y JPA
logging.level.org.hibernate=INFO
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql=TRACE
```


Estas propiedades permiten controlar los niveles de log para los componentes de Spring Boot, Hibernate y JPA. Puedes ajustar los niveles según tus necesidades y preferencias.

Recuerda que los niveles de log más comunes son `TRACE`, `DEBUG`, `INFO`, `WARN` y `ERROR`, y cada nivel muestra mensajes de log con mayor o menor detalle. Asegúrate de establecer los niveles de log de acuerdo con tus requisitos de depuración y registro de la aplicación.

Con esta configuración, tendrás un mayor control sobre los niveles de log de Spring Boot, Hibernate y JPA en tu aplicación. A medida que ajustes los niveles, podrás ver los mensajes de log relevantes en la consola o en el archivo de registro correspondiente.

¡No olvides reiniciar la aplicación después de realizar cambios en la configuración de log!


### Control del nivel de log de nuestra aplicación

Además, puedes controlar los niveles de log de otros componentes de Spring Boot siguiendo un patrón similar. Por ejemplo, si deseas controlar el nivel de log de una clase específica, puedes utilizar la siguiente configuración:

```
logging.level.com.eoi.ejemplospringboot.Miclase = DEBUG
```

Esto establecerá el nivel de log DEBUG para la clase logging.level.com.eoi.ejemplospringboot.Miclase. Puedes agregar múltiples líneas para configurar diferentes paquetes o clases según sea necesario.

```
logging.level.com.eoi.ejemplospringboot.controllers = INFO
```

Recuerda que la configuración del nivel de log se aplica a los paquetes o clases específicas que se definen. Otros paquetes o clases seguirán utilizando el nivel de log predeterminado o el nivel de log definido para su paquete padre.

