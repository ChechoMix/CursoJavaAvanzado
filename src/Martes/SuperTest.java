
package Martes;

/*

Super es una palabra reservada en Java como una variable referencia la cual es usada para servir de intermediario
entre la clase padre y subclase

Usos de Super
    1.- Se puede utilizar para referir la variable de instancia de la clase padre inmediata
    2.- Se puede utilizar para invocar el metodo de la clase padre inmediato
    3.- Se puede utilizar para invocar el contructor de la clase padre inmediata.

 */

// Caso 1:
class Animal {
    String color = "Blanco";

    public Animal() {
        System.out.println("Se ha creado el Animal.");
    }
               
    
    void eat(){
        System.out.println("Comiendo...");
    }
    
}

class Perro extends Animal {
    String color ="Negro";

    public Perro() {
        super();
        System.out.println("Se ha creado el perro.");
    }
    
    void printcolor(){
        //Imprime el color de la clase perro:
        System.out.println(this.color);
        
        //Imprimer el color de la clase animal:
        System.out.println(super.color);
    }

    @Override
    void eat() {
        System.out.println("Comiendo Croquetas");
    }
    
    void sleep(){
        System.out.println("Durmiendo");
    }
    
    void run(){
        System.out.println("Corriendo");
    }
    
    void ladrar(){
        System.out.println("guao");
    }
    
    void llamar(){
        super.eat();
        ladrar();
        
    }
    
}

public class SuperTest {
    public static void main(String[] args) {
        
        //Caso 1
        Perro perro =new Perro();
        perro.printcolor();
        
        //Caso 2
        Perro otroPerro = new Perro();
        otroPerro.llamar();
                    
        }
    }
    
    

