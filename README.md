# llanquihue-tour

## Descripción del proyecto
Este proyecto es una aplicación desarrollada en Java para la agencia de turismo "Llanquihue Tour". El sistema lee información de excursiones desde un archivo de texto externo (.txt), instancia objetos de tipo "Tour" a partir de esos datos y los almacena en un "ArrayList". Incluye funcionalidades para recorrer la colección completa y aplicar filtros específicos basados en el precio. 

## Estructura de carpeta 
El proyecto está organizado bajo la siguiente estructura de paquetes dentro del directorio "src/":
"model/": Contiene la clase "Tour" que representa los datos y atributos.
"data/": Contiene la clase "GestorDatos" encargada de leer el archivo ".txt".
"ui/": Contiene la clase "Main" para la ejecución y visualización por consola. 
"resources/": Directorio que almacena el archivo de datos "tours.txt".

## Instrucciones para ejecutar la clase Main
1. Abrir el proyecto en su IDE.
2. Verificar que el archivo "tours.txt" se encuentre correctamente en la ruta "src/resources/".
3. Navegar hasta el paquete "ui/" y abrir la clase "Main.java".
4. Hacer clic derecho en el código y seleccionar "Run file" (o presionar Shift+F6).
5. La consola mostrará primero la lista completa de tours y luego el resultado de los tours filtrados por precio (menor a $20.000).
