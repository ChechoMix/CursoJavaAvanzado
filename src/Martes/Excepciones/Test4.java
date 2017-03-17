
package Martes.Excepciones;

/*
Diferencias entre throw y throws en Java
throw:
1.- Paralabra reservada usada para manejar una excepcion explicita.
2.- Es usada sin un metodo

throws:
1.- Parabra reservada para declarar una excepción
2.- Es usado en la signarura de un metodo
3.- 

*/

public class Test4 {
    public static void main(String[] args) {
        try {
            int dato = 25/5;
            System.out.println(dato);
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }finally{
            System.out.println("Este bloque SIEMPRE SE EJECUTA");
        }
        System.out.println("lo que sea");
        
    }
    //Ejemplo de throw
    void l(){
        throw new ArithmeticException("la excepcion es aritmetica");
    }
    //Ejemplo con throws
    void j() throws ArithmeticException{
        //body
    }
    
    //juntos:
    void h() throws ArithmeticException{
        throw new ArithmeticException("hola");
    }
    
    
    
}
