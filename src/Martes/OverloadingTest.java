/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/*
Si una clase tiene diferentes metodos con el mismo nombre pero diferentes parametros se conoce
como SobreCarga de metodos

Ventajas de la sobrecarga de metodos
Incrementa la legibilidad del programa

Diferentes formas de sobrecargar un metodo
1.- Cambiando el numero de argumentos
2.- Cambiadno el tipo de los datos
 */

class Añadido{
    static int add(int a, int b){
        return a + b;
    }
    
    static int add(int a, int b, int c){
        return a+b+c;
    }
    
    static int suma(int c, int d){
        return c+d;
    }
    static double suma(double c, double d){
        return c+d;
    }
    
}

public class OverloadingTest {
    public static void main(String[] args) {
        
        //caso 1
        System.out.println(Añadido.add(111, 111));
        System.out.println(Añadido.add(111,111,111));
                
        //caso 2
        System.out.println(Añadido.suma(12,12));
        System.out.println(Añadido.suma(12.5, 17.8));
        
    }
    
    /*
    El metodo main se puede sobrecargar y tener cualquier cantidad de metodos main, sin embargo
    la JVM solo va ejecutar el que tiene como argumento un agreglo de strings
    
        class overload{
        public static void main(String[] args) {
            System.out.println("main con Strings []");
        }
        public static void main(String args) {
            System.out.println("main con String");
        }
        
        public static void main() {
            System.out.println("main sin string");
        }
            
    }
    */
    
    
       
    
}
