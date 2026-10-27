#!/bin/bash
#
# Nombre:      notas.sh
# Autor:       Santiago Gonzalez Galindo
# Descripción: Punto extra de la práctica 1, crea notas.md en la carpeta principal del usuario si no existe y le agrega las notas nuevas.
# Fecha:       26/10/2026
# Uso:         ./src/bash/notas.sh

# $HOME es la carpeta principal del usuario que está en sesión
archivo="$HOME/notas.md"

# Si notas.md no existe, se crea
if [ ! -f $archivo ]; then
  touch $archivo
  echo "No existía $archivo, ya se creó."
fi

# Pide la nota y la agrega al final del archivo
echo "Escribe tu nota:"
read nota
echo "$nota" >> $archivo

echo "Tus notas en $archivo:"
cat $archivo

exit 0
