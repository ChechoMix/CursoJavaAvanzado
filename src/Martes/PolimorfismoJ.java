
package Martes;

/*
Polimorfismo: Concepto mediante el cual podemos realizar una tarea o acción de distintas maneras
Se deriva de dos palabras griegas:
Poly: Muchos(as)
morphos:Formas

Tipos de polimorfismo:
    1.- Runtime Polymorphism (Polimorfismo en tiempo de compilación)
    2.- Dynamic Method Disrpach( Polimorfismo en tiempo de ejecución ) 

Podemos realizar el polimorfismo en java por sobrecarga de metodo y redefinición de metodo.
 */

class Bike{
    void run(){
        System.out.println("running...");
    }
}

public class PolimorfismoJ extends Bike{
    void run(){
        System.out.println("running safely woth 60km");
    }
    public static void main(String[] args) {
        Bike b = new PolimorfismoJ();
        /*Upcasting -> Cuando la variable de rerefencia de la superclase 
         se refiere al objeto de la clase hija.
        class A{}
        class B extends A{}
        A a = new B();
        */
        b.run();
        
    }
    
    
}
