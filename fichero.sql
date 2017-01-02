-- MySQL dump 10.13  Distrib 5.7.16, for Linux (x86_64)
--
-- Host: localhost    Database: preguntasdb
-- ------------------------------------------------------
-- Server version	5.7.16-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preguntas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(1000) DEFAULT NULL,
  `first_response` varchar(1000) DEFAULT NULL,
  `second_response` varchar(1000) DEFAULT NULL,
  `third_response` varchar(1000) DEFAULT NULL,
  `fourth_rsponse` varchar(1000) DEFAULT NULL,
  `fifth_response` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
INSERT INTO `preguntas` VALUES (1,'Los paquetes en tiempo de ejecución contienen:','Los archivos que deben ser instalados para que otros programas puedan usar la librería.','Los archivos necesarios para compilar nuevos programas.','Los archivos necesarios para compilar programas existentes.','Archivos que son necesarios para que el sistema operativo funcione correctamente.','Archivos que contienen la documentación necesaria de los paquetes de desarrollo.'),(2,'Los paquetes de desarrollo contienen: ','Los archivos que se necesitan para compilar programas nuevos o existentes.','Los archivos que deben ser instalados para que otros programas puedan usar la librería.','Archivos que son necesarios para que el sistema operativo funcione correctamente.','Archivos que contienen la documentación necesaria de los paquetes de desarrollo.','Archivos ejecutables que son requeridos por el kernel.'),(3,'En Debian existe la libreria rsvg que trata con gráficos en formato SVG. ¿Qué afirmación es correcta al paquete librsvg2-dbg?','Contiene las herramientas necesarias para la depuración.','Contiene las herramientas necesarias para el desarollo.','Contiene la documentación de la librerái rsvg.','Contiene una vinculación de lenguaje Python.','Contiene los programas de línea de comandos.'),(4,'La función de la base de datos de paquetes en un sistema operativo Linux es:','Contener la información sobre los paquetes que están disponibles y cuales están instalados.','Contener la información de la última actualización de los paquetes instalados en el sistema.','Contener la información sobre las librerías del sistema.','Tan solo contener información sobre paquetes en tiempo de ejeución.','Contener los paquetes que están siendo usados en el momento de la consulta por el sistema.'),(5,'Se da la situación en la que al actualizar un paquete, una aplicación es incompatible con la nueva actualización del paquete. ¿Qué haría un buen sistema de manejo de paquetes?','Advertir al administrador y darle la oportunidad de intervenir en esta situación.','No dejar instalar la actualización, dando prioridad a la aplicación antigua sobre la nueva.','Instalar la actualización, pudiendo quedar de esta forma inutilizable la aplicación que es incompatible.','Remitir un informe de la incompatibilidad al fabricante de la aplicación incompatible, para que actualice la misma.','Intentar instalar una version más antigua de la aplicación que se quiere instalar, buscando la compatibilidad con el paquete.'),(6,'El comando dpkg --list en un sistema operativo Debian:','Muestra una lista con todos los paquetes instalados en el sistema.','Elimina un paquete aleatorio de los paquetes instalados en el sistema.','Elimina un paquete aleatorio pero mantiene los archivos de configuracion.','Muestra el estado de instalación de los paquetes instalados en el sistema.','Instala un paquete en el sistema de archivos del disco duro.'),(7,'El comando apt proporciona:','Herramientas más avanzadas en el sistema de manejo de paquetes. ','Lo mismo que el comando dpkg pero en distribuciones no basadas en Debian.','Solo herramientas para añadir y eliminar paquetes.','Solo herramientas para poder buscar información acerca de paquetes deseados','No es un comando válido. El comando correcto es apt-get.'),(8,'Un comando alternativo (para instalar un paquete) al comando apt-get install <nombre_paquete> sería:','apt install <nombre_paquete>','No hay ninguna otra forma de escribir este comando.','install <nombre_paquete>','dpkg install <nombre_paquete>','dpkg-get install <nombre_paquete>'),(9,'El comando dpkg -l | grep \"chrome\":','Verifica si el paquete que contiene la palabra clave \"chrome\" ha sido instalado.','Mostrar una lista con todos los paquetes instalados y que se pueden instalar que contienen la palabra clave \"chrome\".','Mostrar una lista con los paquetes que se pueden instalar y que contienen la palabra clave \"chrome\".','Error. No es posible redireccionar la salida del comando dpkg -l con el comando grep.','Desinstala los paquetes con la ocurrencia \"chrome\" que encuentra en el sistema.'),(10,'Las distribuciones basadas en Debian disponen de una versión del programa rpm.','Verdadero. Este programa gestiona los paquetes RPM.','Falso. El programa rpm solo lo tienen las distribuciones RPM como Red Hat.','Solo algunas distribuciones basadas en Debian como Ubuntu, tienen el programa rpm. ','Falso. rpm no existe en ninguna distribución Linux. Los paquetes siempre se gestionan con apt y dpkg. ','Falso. Este programa solo existía en sistemas Linux muy antiguos, y se ha actualizado a dpkg en la mayoría de distribuciones.'),(11,'Las bibliotecas compartidas residen en:','/lib','/usr','/tmp','/dev','/'),(12,'Una biblioteca compartida es:','Diferente de una biblioteca estática porque se carga en memoria solo una vez','Una biblioteca estática que se carga en memoria solo una vez','Una biblioteca normal que puede ser compartida por varios programas','Diferente de una bibiloteca estática porque puede ser usada solo por un programa al mismo tiempo','Usada tan solo por el kernel.'),(13,'Por convención, la extensión en Linux para las bibliotecas compartidas es:','.so','.a','.dll','.lib','.sl'),(14,'Una ventaja al usar bibliotecas compartidas es:','Solo necesitan ser cargadas en memoria una vez.','Necesitas cargarla en memoria una vez por cada programa que la use.','Incrementa el tamaño del archivo binario. ','Tienes que compilarla a la misma vez que el programa','Puede ser cargada en memoria varias veces sin pérdida, en tiempo de ejecución.'),(15,'Una desventaja de las bibliotecas compartidas es:','Aumenta el tiempo necesario para ejecutar el código de un programa.','Se decrementa el tiempo necesario para ejecutar el código de un programa.','Necesitan ser compiladas cada vez que un programa las va a usar.','No puedes cambiar el código si hay un programa que las está usando.','No existen desventajas con las bibliotecas compartidas.'),(16,'Una ventaja de las bibliotecas compartidas es:','Son más fáciles de mantener, porque no necesitas compilar cada programa que las usa, después de cambiarlas.','Son más fáciles de usar, porque se vinculan a un programa desde el inicio de su ejecución.','Ahorran recursos del sistema porque están cargadas varias veces en memoria.','No necesitas referenciar su código en tiempo de ejecución.','Ninguna de las anteriores son propiedades de las bibliotecas compartidas.'),(17,'Uno de los principales problemas de usar bibilotecas compartidas es:','Permitir a los programas localizar las bibliotecas compartidas. ','Manejarlas para que usen el mínimo espacio de memoria.','Diferenciar bibliotecas estáticas de bibliotecas compartidas.','Usarlas para que puedan ser cargadas en memoria más de una vez.','Manejar la posibilidad de que varios programas las usen a la vez.'),(18,'¿Qué ocurre cuando se actualiza una bibilioteca compartida?','El resultado puede ser incompatible con alguno de los programas que la usan.','Una biblioteca compartida no debe ser actualizada porque puede ser incompatible con programas que la usan.','Nada, una biblioteca compartida no provoca un problema de compatibilidad.','Una copia de la versión más antigua se guarda en /tmp en el caso de que la nueva versión no sea válida.','El sistema comprueba los programas que usan la biblioteca y notifica si hay algún problema.'),(19,'¿Para que sirve el comando ldd?','Muestra una lista de todas las bibliotecas que un programa u otra biblioteca necesita para traabajar.','Muestra una lista de todos los programas que usan una biblioteca dada.','Devuelve la ruta a una biblioteca que un programa no encuentra para trabajar.','Es un comando que solo se puede usar como root. Muestra la ruta de todas las bibliotecas que usa un programa.','Este comando no existe.'),(20,'¿Es posible cambiar la ruta por defecto para todas las bibliotecas compartidas temporalmente?','Sí, y es recomendable cuando se quiere probar una biblioteca sin afectar al resto de los procesos.','Sí, pero no es recomendable puesto que los programas pueden dejar de funcionar de forma correcta.','Sí, pero el sistema dejará de funcionar correctamente.','No, pero se puede cambiar de forma permanente.','No, el sistema no lo permitirá. ');
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-02 19:41:47
