##**IMPORTAR PROYECTO EN ECLIPSE**

- 1º). Descargamos el proyecto y lo guardamos.

- 2º). Abrimos Eclipse. Click en File, Import, Existing project into Workspace.

- 3º). En Select Root Directory, hacemos click en Browse y seleccionamos la ubicacion de nuestro proyecto.

![importarProyecto](importarProyecto.png)

- 4º). Hacemos click en Finish y esperamos a que acabe de importar.


##**AÑADIR LA LIBRERIA DE MySQL A ECLIPSE**

Para que compile el proyecto, es necesario añadir la libreria que se encuentra en la carpeta lib. Para ello:

- Hacemos click derecho en el proyecto.

- Seleccionamos la opción Build Path - Add External archives.

- Seleccionamos el archivo `mysql-connector-java-5.0.8-bin.jar`, ubicado en `preguntasSSOO/lib/mysql-connector-java.5.0.8`

![libreria](libreria.png)

- Hacemos click en aceptar y la libreria queda importada.

##**COMO IMPORTAR Y EXPORTAR UNA BASE DE DATOS MySQL**

####*LINUX*

Para que el proyecto funcione, es necesario importar la base de datos `fichero.sql`. Para ello, lo primero que necesitamos es instalar `MySQL` en Linux. Procedemos de la siguiente forma:

- Ejecutamos `sudo apt-get update` para actualizar los repositorios instalados.

- Ejecutamos `sudo apt-get install mysql-server` para instalar MySQL.

- Una vez instalado MySQL, podemos importar nuestra base de datos como se muestra en el siguiente enlace:

[¿Cómo importar una base de datos MySQL?](https://gist.github.com/kamikaze-lab/98e901d961db59fd0db8)

####*WINDOWS*



##***Q&A***

- ¿Qué hacer si al ejecutar el programa en Eclipse sale el error `Error: No se ha encontrado la clase principal`?

  Estando situados en el archivo `JFrameUserInterface.java`, hacer click en la pestaña `Run`, elegir la opción `Run As` y después elegir la opción `Java Application`.
