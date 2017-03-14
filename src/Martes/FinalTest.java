
package Martes;

/*
La palabra reservada FINAL en Java es usada para hacer una RESTRICCION 
Puede ser usada en muchos contextos, como:
1.- Variable -> No se puede cambiar el valor.
2.- Metodo   -> No se puede redefinir 
3.- Clase    -> No puede ser heredada

 */

final class Bicicleta{
    final int LIMITEVELOCIDAD = 90;
    final void run(){
        // LIMITEVELOCIDAD = 400; **  NO SE PUEDE POR ES "FINAL"
    }
    
    
}

public class FinalTest {
        
    
}
