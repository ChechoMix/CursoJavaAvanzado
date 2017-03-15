
package Martes;
/*

Abstract Class                                                    Interface
1.- Tiene metodos abstractos y no abstractos                   1.- Solo tiene metodos abstractos.
2.- No soportan herencia multiple                              2.- Soportan la herencia multiple
3.- Tienen variables finales, estaticas y no estaticas         3.- Solo tienen variables finales y estaticas
4.- Puede proveer la implementación de una inface              4.- No puede proveer una implementación de una clase
5.- La palabra astract declara una clase abstracta             5.- La palabra interface es usada para declarar la interface

public abstract class Shape{                                   public interface Drawable{
    public abstract void draw();                                   void draw();
}                                                              }

*/

interface IBanco{
    float getRateOfInterest();
}

class BancomerI implements IBanco{
    public float getRateOfInterest(){
        return 7.5f;
    }
}

class HSBCI implements IBanco{
    public float getRateOfInterest(){
        return 8.6f;
    }
}

class BancoppelI implements IBanco{
    public float getRateOfInterest(){
        return 9.3f;
    }
}

public class Banco_Interfaces {
    
    
}
