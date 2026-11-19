# llanquihue-tour

## Descripción del proyecto
Este proyecto es la segunda versión del sistema de gestión para la agencia "Llanquihue-tour". En esta iteración, apliqué prácticas de programación orientada a objetos, incluyendo encapsulamiento, manejo de excepciones (try-catch) y una arquitectura modular organizada en paquetes. Además, implementé una relación de composición entre las clases del dominio, asignando un objeto "guia" a cada "tour". El sistema carga la información desde un archivo de texto externo hacia una colección dinámica y permite ejecutar búsquedas automatizadas.

## Paquetes y clases implementadas. 
El proyecto está estructurado en los siguientes paquetes funcionales.
* **model**: Contiene las clases del dominio.
- Tour.java: Representa una excursión e incluye validaciones de precio.
- Guia.java: Representa al trabajador asignado (usado como composición en tour).
- **service**: Contiene la lógica de negocio y persistencia.
- GestorDatos.java: Lee el archivo externo, instancia los objetos manejando posibles excepciones (IOException, NumerFormatException) y los almanecena en un ArrayList.
- **App**: Contiene la interfaz de ejecución.
- Main.java: Ejecuta el programa, recorre la lista completa y realiza búsquedas por ubicación.
- **util**: Directorio de recursos.
- tours.txt: Archivo de datos base con la información de tours y guías.

## Instrucciones para ejecutar la clase Main
1. Abrir el proyecto en su IDE.
2. Verificar que el archivo "tours.txt" se encuentre correctamente en el paquete "util"
3. Navegar hasta el paquete "app" y abrir la clase "Main.java".
4. Ejecutar el archivo (Run file).
5. La consola desplegará el listado completo de excursiones con sus guías asociados y, luego, el resultado del filtro de búsqueda por ubicación. 
