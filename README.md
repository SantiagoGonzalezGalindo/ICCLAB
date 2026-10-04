# Laboratorio de Introducción a Ciencias de la Computación

Repositorio académico de Santiago, estudiante de la Licenciatura en Ciencias de la Computación de la Facultad de Ciencias.

## Descripción

El propósito de este repositorio es reunir las prácticas, los ejercicios y las actividades del laboratorio de Introducción a Ciencias de la Computación.

## Objetivos

- Desarrollar habilidades de programación y resolver problemas.
- Practicar el uso de la línea de comandos de Linux.
- Aprender a organizar proyectos de software.
- Utilizar Git para llevar un historial de los cambios.
- Aplicar lo visto en el curso en ejercicios y programas.

## Requisitos

Para descargar y trabajar con el repositorio se necesita:

- Git, para obtener el proyecto y hacer uso de sus versiones.
- Un editor de texto para consultar y modificar los archivos.
- Un JDK para las actividades que requieran compilar y ejecutar código Java.
- Una terminal con Bash para usar los comandos de este README.

## Cómo obtener una copia

Para obtener la copia del repositorio se debe introducir este código en una terminal:

```bash
git clone https://github.com/CCLaboratorio/SantiagoGonzalez.git
cd SantiagoGonzalez
```

## Estructura del repositorio

```
.
├── icc/
│   ├── build/              # archivos .class que se generan al compilar
│   ├── resources/          # archivos que necesitan los programas
│   └── src/
│       ├── bash/           # scripts de Bash
│       └── java/           # programas en Java
│           └── ejercicios/ # ejercicios vistos en el laboratorio
├── img/                    # imágenes del repositorio
├── tareas/                 # tareas y actividades del laboratorio
└── README.md
```

## Carpetas y su propósito

- `src/` Código fuente de los programas.
- `build/` Archivos generados durante la compilación o construcción.
- `test/` Pruebas para comprobar el funcionamiento de los programas.
- `docs/` Documentación, diagramas y explicaciones de las actividades.

Por ahora el repositorio solo tiene `src/` y `build/` (dentro de `icc/`); `test/` y `docs/` se van a agregar cuando haya pruebas o documentación más larga.

## Cómo compilar y ejecutar

Los comandos se escriben desde la carpeta principal del repositorio. `-d icc/build` hace que el `.class` se guarde en `icc/build/` en lugar de quedarse junto al `.java`, y `-cp icc/build` le dice a Java en qué carpeta buscarlo.

```bash
javac -d icc/build icc/src/java/Main.java
java -cp icc/build Main
```

```bash
javac -d icc/build icc/src/java/ejercicios/TDPrimitivos.java
java -cp icc/build TDPrimitivos
```

## Contenido

| Archivo | Qué hace |
|---|---|
| `icc/src/java/Main.java` | Pide el nombre del usuario con `Scanner` y lo muestra en pantalla. |
| `icc/src/java/ejercicios/TDPrimitivos.java` | Muestra los tipos de datos primitivos enteros (`byte`, `short`, `int`, `long`) y suma dos números que le pide al usuario. |

## Autor

- Santiago Gonzalez Galindo — [@SantiagoGonzalezGalindo](https://github.com/SantiagoGonzalezGalindo)
- Licenciatura en Ciencias de la Computación
- Facultad de Ciencias — Universidad Nacional Autónoma de México

## Colaboradores

- Leonardo Gallo — [@lngallo](https://github.com/lngallo)

## Dudas o errores

Si encuentras un error o tienes alguna duda sobre algún ejercicio, puedes abrir un *issue* en este repositorio.

Repositorio con fines académicos.
