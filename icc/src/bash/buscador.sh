#!/bin/bash
#
# Nombre:      buscador.sh
# Autor:       Santiago Gonzalez Galindo
# Descripción: Busca archivos o carpetas por nombre exacto o por coincidencia
#              dentro del directorio que indique el usuario.
# Fecha:       29/10/2026
# Uso:         ./src/bash/buscador.sh

tipo=0
modo=0
nombre=""
directorio=""
letra=""
patron=""
resultado=""

# Tipo a buscar
echo "¿Qué quieres buscar?"
echo "1. Archivo"
echo "2. Carpeta"
read tipo

# Por nombre o por coincidencia
echo "¿Cómo quieres buscar?"
echo "1. Por nombre exacto"
echo "2. Por coincidencia"
read modo

echo "Escribe el nombre o la parte del nombre:"
read nombre

# Directorio donde se busca
echo "¿En qué directorio quieres buscar?"
read directorio

# Para find, f es archivo y d es carpeta
if [ "$tipo" -eq 1 ]; then
  letra="f"
else
  letra="d"
fi

# Con * antes y después busca cualquier nombre que contenga el texto
if [ "$modo" -eq 1 ]; then
  patron="$nombre"
else
  patron="*$nombre*"
fi

# Búsqueda, lo que encuentre find se guarda en resultado
resultado=$(find "$directorio" -type $letra -name "$patron")

# Resultado
if [ "$resultado" = "" ]; then
  echo "No se encontró nada"
else
  echo "Resultado:"
  echo "$resultado"
fi

exit 0
