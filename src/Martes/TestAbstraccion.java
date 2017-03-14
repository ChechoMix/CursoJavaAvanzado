

package Martes;

/*

Una clase declarada con la palabra reservada Abstract se considera abstracta.
Puede ser abstracta con metodos no abstractos.

La abstraccion es un proceso para ocultar los detalles de implementación y 
mostrar sola la funcionalidad al usuario.

Osea, mostrar solo las cosas importantes para el usuario, ocultando los detalles internos.
EnviarSMS solo escribe el texto y lo envias.
No conoces el procesamiento interno sobre la entrega del mensaje

La abstraccion permite concentrarse en LO QUE HACE EL OBJETO en lugar de COMO LO HACE.

Formas de lograr la abstracción :
1.- Clase Abstracta (0 al 100 %)
2.- Interface (100%)

Una clase declarada como abstract se conoce como abstracta, necesita ser extendida (extends)  
e implementar metodos. No se puede instanciar.

abstract class A{ }

Un metodo que es declarado como abstract no tiene implementaciones.
abstract void printStatus();

 */

abstract class Bicycle{
    abstract void run();
}

abstract class ShapeX{
    abstract void draw();
}

class Rect extends Shape{
    void draw(){
        System.out.println("Dibujando un rectangulo");
    }
}
class CircleX extends Shape{
    void draw(){
        System.out.println("Dibujando un circulo");
    }
}

public class TestAbstraccion extends Bicycle {
    void run(){
        System.out.println("Corriendo felizmente...");
    }
    
    public static void main(String[] args) {
        Bicycle bicycle = new TestAbstraccion();
        bicycle.run();
        
        Shape s = new CircleX();
        s.draw();
        
        
    }
    
}
