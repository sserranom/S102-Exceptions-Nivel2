
***S102. Exceptions - Ejercicio1 Nivel 2***

Crea una clase llamada "Entrada". Esta clase debe servir para controlar las distintas excepciones que pueden aparecer en Java a la hora de introducir datos por teclado utilizando la clase Scanner.
Lo primero que debe hacerse es instanciar un objeto de la clase Scanner ya partir de ahí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado. 

Importante
Es importante que si en algún método salta una excepción, la tratamos y volvemos a pedir el dato al usuario hasta que éste esté bien introducido. Por ejemplo: Si introduce un float con un punto en lugar de una coma,
debe mostrar “Error de formato”. Hasta que el usuario/a no introduce un float bien formado debe seguir pidiendo el dato.Todos los métodos reciben un String con el mensaje que se quiere mostrar al usuario, 
por ejemplo: “Introduce tu edad”, y devuelven el dato oportuno introducido por el usuario en cada método, por ejemplo: uno byte con la edad del usuario/a.

Métodos a implantar capturando la excepción de la clase "InputMismatchException":

public static byte leerByte(String mensaje);
public static int leerInt(String mensaje);
public static float leerFloat(String mensaje);
public static double leerDouble(String mensaje);

Métodos a implantar capturando una excepción personalizada de la clase Exception:

public static char leerChar(String mensaje);
public static String leerString(String mensaje);
public static boolean leerSiNo(String mensaje), si el usuario introduce “s”, devuelve “true”, si el usuario introduce “n”, devuelve “false”.

***Tecnologías Utilizadas***

-Lenguaje: Java -Version : java version "23.0.1" 2024-10-15 -iDE Utilizado: Eclipse

***Requisitos***

-Software: JDK 17 o superior -dependencias: Sin dependencias Externas

***Instalacion***

-Puedes clonar el repositorio en tu equipo local, utilizando los siguientes comando: https://github.com/sserranom/S102-Exceptions-Nivel2.git Abre el proyecto en tu IDE y ejecuta cada uno de los ejercicios el programa imprime en consola el requerimiento de cada uno de los ejercicios.

***Desplieque***

Este proyecto está diseñado para ser ejecutado en un entorno local para fines practicos
