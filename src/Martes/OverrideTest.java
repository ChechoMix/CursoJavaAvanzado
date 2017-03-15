
package Martes;

/*

Si una subclase tiene el mismo metodo declarado en la clase padre se le conoce como un metodo redefinido (Soibreescrito)

En otras palabras si la subclase provee una implementación especifica de un metodo que ya esta provisto en la clase padre
es por que está redefinido.

Usos de la redefinición de metodos
    Para proveer una implementación especifica de un metodo
    previamente en la super clase

    Es usado para el polimorfismo en tiempo de ejecución

Reglas de la refinición de metodos de Java
    1.- El metodo debe tener el mismo nombre como la clase padre
    2.- El metodo debe tener los mismos parametros como en la super clase
    3.- Debe ser una relación de tipo Is A (Heredado)
 */

class Vehiculo{
    void run(){
        System.out.println("El vehiculo esta corriendo...");
    }
}

public class OverrideTest extends Vehiculo{
    public static void main(String[] args) {
        OverrideTest bicicleta = new OverrideTest();
        bicicleta.run();
    }
    
    void run(){
        System.out.println("La bicicleta esta corriendo...");
    }
    
}
/*
Sobrecarga(Overloading)
1.- Es usada para incrementar la legibilidad del programa
2.- En caso de un metodo sobrecargado los parametros hacen la diferencia
3.- La sobrecarga se realiza dentro de la clase
4.- La sobrecarga es un ejemplo de Compile Time Polymorphism
5.- La sobrecarga no puede realizarse cambiando el tipo de retorno solamente

Redefinición (Override)
1.- Es usado para proveer la implementación especifica de un metodo ya establecido en la superclase
2.- En caso de una redefinición, los parametros deben ser los mismos
3.- La sustitución del metodo se produce en dos clases distintas, pero heredadas.
4.- La redefinición es un ejemplo de Run Time Polymorphism
5.- EL tipo de retorno debe ser igual a una variante del metodo definido

*/

