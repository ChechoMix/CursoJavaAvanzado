/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Excepciones;


/*
Diferencia entre final, finally, finalize:
final:
1.- Es usado para aplicar restricciones en una clase, metodo y variables.
    Una clase final no se puede ser heredada, un metodo final no puede ser redefinido y una variable no puede ser cambiada de valor

2.- final es una palabra reservada

finally:
1.- Es un bloque
2.- Es usado para terminar el manejo de una excepcion, es un bloque de codigo implicito que siempre se ejecuta

finalize:
1.- Es usado para realizar el proceso de limpieza justo antes de que llegue el recolector de basura de java.
2.- Es un metodo


 */
class FinalTest{
    public static void main(String[] args) {
        final int x = 100;
    }
    
}

class FinallyTest {
    public static void main(String[] args) {
        try {
            int b=300;
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("Se ejecuta el bloque finally");
        }
    }
}

public class TestF {
    
    public void finalize(){
        System.out.println("llamada a finalizar");
    }
    
    public static void main(String[] args) {
        TestF f1 = new TestF(), f2 = new TestF();
        f1=null;
        f2=null;
        System.gc();
    
    }
}
