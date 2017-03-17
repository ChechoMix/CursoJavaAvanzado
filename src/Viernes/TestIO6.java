
package Viernes;

/*
BufferedInputStream se utiliza para leer la información del stream.
Utiliza internamente el mecanismo del almacenador intermedio para hacer el 
funcionamiento rapido.

Puntos a tomar en cuanta:
Cuando se omiten o se leen los bytes del flujo, el bufer interno se rellena autimaticamente del 
flujo de entrada, conteniendo muchos bytes a la vez.

Cuando se crea un BufferedInputStream, se crea un array interno.
Metodos:
    int available() : Devulve un numero estimado de bytes, que se pueden leer sin bloquear por el metodo next
         invocation para el stream de entrada.

    int read() : lee el siguiente byte de datos del stream.
    int read(byte[]), int off, int Inn) : lee los bytes de la secuencia de entrada.
    void close(): Cierra un stream de entrada y libera cualquiera de los recursos asociados al flujo
    void reset(): Reposiciona el stream en una posicion donde el metodo mark fue llamado por primera vez



*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 */
public class TestIO6 {
    public static void main(String[] args) throws IOException  {
        FileInputStream fis = new FileInputStream("c:\\cadena.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);
        
        int i;
        while(( i= bin.read())!= -1){
            System.out.println((char)i);
        }
        
        bin.close();
        fis.close();
        
        
    }
    
}
