
package Martes;


//Declaracion de la interface definida por el usuario.
interface Drawable{
    void draw();
}

class Rec1 implements Drawable{
    public void draw(){
        System.out.println("Dibujando un rectangulo");
    }
}

class Cir implements Drawable{
    public void draw(){
        System.out.println("Dibujando un circulo");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Drawable d = new Cir();
        d.draw();
    }
}
