#!/bin/bash

opcion=0

echo "Ingresa 1 para listado simple o 2 para listado con detalles"
read opcion
if [ "$opcion" -eq 1 ]; then
  #Aquí adentro es el bloque de ejecución que depende del condicionante
  ls
else if [ "$opcion" -eq 2 ]; then
        ls -al
    else
        echo "Cuidado, no ingreso un valor válido, vuelva a intentarlo"

    fi
fi
