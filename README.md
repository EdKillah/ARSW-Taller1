# LOC Counting

Programa que funciona como lector de líneas de código. Los dos tipos de lectura disponibles son: físicas y exluyente de lineas en blanco y comentarios.

## Instrucciones de uso

Para poder usar el proyecto lo primero que debe realizar es clonar este repositorio utilizando el siguiente comando desde la terminal del SO que este utilizando:

```
git clone https://github.com/EdKillah/ARSW-Taller1
```
Luego debe redirigirse por medio de la terminal al directorio raíz la cual contiene el achivo pom.xml.

Una vez se encuentre en este directorio se debe compilar el programa para esto se debe ejecutar el siguiente comando:

```
mvn package
```

Para finalizar y ejecutar el programa debe utilizar el siguiente comando:

```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.app.App TIPO RUTA_ARCHIVO
```

Donde TIPO se encuentra entre los siguientes valores:
* PHY: representa las líneas físicas del archivo (TODAS LAS LÍNEAS)
* LOC: representa únicamente las línas de código (excluye comentarios y lineas en blanco)

Un ejemplo de como ejecutarlo: 

```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arsw.intro.app.App PHY "Voto.java"
```

El archivo __Voto.java__ se encuentra en el mismo directorio que el archivo pom.xml por eso basta con solo colocar el nombre del archivo.


### Prerequisites

Para ejecutar con éxito este programa se requiere de los siguientes programas instalados en su máquina

```
java version: "1.8.0_171"
git version: 2.19.1.windows.1
Apache Maven version: 3.6.3
```

## Diagrama de clases

![image](https://github.com/EdKillah/ARSW-Taller1/tree/master/resources/diagrama.PNG)




## Pruebas del programa

Al ejecutar el comando mvn package  se compila el programa y ejecuta las pruebas al mismo tiempo.
Estas pruebas pruebas la funcionalidad correcta del programa, validando que cargué correctamente los archivos y que el conteo de lineas sea el correcto con un archivo base.

A continuación se presenta una imagen detallando el éxito de las mismas:

![image](https://github.com/EdKillah/ARSW-Taller1/tree/master/resources/pruebas.PNG)



## Construido con


* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.java.com/es/download/)
* [Git](https://github.com/) - Versionamiento



## Authors

* **Eduard Jimenez** - *LOCS/Hora  360/12 = 30 LOCS/Hora* - Fecha: 03/06/2020



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


### Enlace al sistema de integración continua

_A continuación se presenta el link:_
[![CircleCI](https://circleci.com/gh/EdKillah/ARSW-Taller1.svg?style=svg)](https://circleci.com/gh/EdKillah/ARSW-Taller1)