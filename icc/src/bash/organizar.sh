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

# Guarda el nombre en el reporte
echo "Alumno: $nombre" > $carpeta/reporte.md

# Avisa que se creó la estructura
echo "La estructura se creó correctamente en $carpeta"

# Muestra el contenido del reporte
echo "Contenido del reporte:"
cat $carpeta/reporte.md

# Guarda en el reporte las últimas 50 líneas del historial
echo "" >> $carpeta/reporte.md
echo "Últimas 50 líneas del historial:" >> $carpeta/reporte.md
echo '```' >> $carpeta/reporte.md
tail -n 50 ~/.bash_history >> $carpeta/reporte.md
echo '```' >> $carpeta/reporte.md

exit 0
