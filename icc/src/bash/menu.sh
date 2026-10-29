#!/bin/bash
#
# Nombre:      menu.sh
# Autor:       Santiago Gonzalez Galindo
# Descripción: Pide el nombre del usuario y muestra un menú de tres opciones.
# Fecha:       29/10/2026
# Uso:         ./src/bash/menu.sh

nombre=""
opcion=0

# Bienvenida
echo "Bienvenido al menú de opciones"

# Pide el nombre y lo usa en un mensaje
echo "¿Cuál es tu nombre?"
read nombre
echo "Hola, $nombre"

# Menú de tres opciones
echo "1. Ver un saludo"
echo "2. Ver un consejo"
echo "3. Salir"
echo "Elige una opción:"
read opcion

# Mensaje según la opción elegida
if [ "$opcion" -eq 1 ]; then
  echo "Que tengas un buen día, $nombre"
else if [ "$opcion" -eq 2 ]; then
    echo "$nombre, recuerda hacer commit de tus cambios"
  else if [ "$opcion" -eq 3 ]; then
      echo "Hasta luego, $nombre"
    else
      echo "Opción no válida, vuelve a intentarlo"
    fi
  fi
fi

exit 0
