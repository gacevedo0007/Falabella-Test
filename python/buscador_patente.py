import json

search = '[   {      "patente":"1",      "version":"1.6",      "nombre":"Changan",      "Detalle":"Ejemplo"     },{      "patente":"2",      "version":"1.6",      "nombre":"Hyundai",      "Detalle":"Ejemplo"     },{      "patente":"3",      "version":"1.6",      "nombre":"kia",      "Detalle":"Ejemplo"     }]'

searchWord = input("Por favor ingrese un valor a buscar: ")
searchWord = str(searchWord)
search = search.lower()

if searchWord in search:
   print("encontrado " + searchWord + search)
else:
  print("no encontrado "  + searchWord)
#Resultado: encontrado
