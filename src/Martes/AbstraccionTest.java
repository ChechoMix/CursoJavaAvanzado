
package Martes;

abstract class Bici{
    Bici(){
        System.out.println("La bici se creo");
    }
    
    abstract void run();
    void changeColor(){
        System.out.println("Color cambiado..");
    }
    
}

class Magistroni extends Bici{

    @Override
    void run() {
        System.out.println("Soy Bicicleta");
    }
    
    void changeColor(){
        System.out.println("Color cambiado");
    }
   
}

public class AbstraccionTest {
    void run(){
        System.out.println("La bici corre de manera segura.");
    }
    
    public static void main(String[] args) {
        
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
        
    }
    
    
}
