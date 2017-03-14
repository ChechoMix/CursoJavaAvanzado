
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
