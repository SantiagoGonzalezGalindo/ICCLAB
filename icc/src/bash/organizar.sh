#!/bin/bash
#
# Nombre:      organizar.sh
# Autor:       Santiago Gonzalez Galindo
# Descripción: Prepara la carpeta de trabajo de la práctica 1.
# Fecha:       26/10/2026
# Uso:         ./src/bash/organizar.sh

# Mensaje de bienvenida
echo "Bienvenido, este script prepara tu carpeta de trabajo para la práctica 1."

# Pide el nombre del alumno
echo "Escribe tu nombre:"
read nombre

# Crea la carpeta y los archivos vacíos
carpeta="src/bash/practica01"

mkdir -p $carpeta
touch $carpeta/notas.md
touch $carpeta/reporte.md

exit 0
