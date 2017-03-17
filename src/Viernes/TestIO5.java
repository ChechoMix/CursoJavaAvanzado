
package Viernes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*

La clase Java BufferedOutputStream se utiliza para almacenar en buffer un stream de salida.
Internamente utiliza un buffer para almacenar datos directamente es stream.Añade mas eficiencia que escribir datos de manera directa en un flujo.
Por lo tanto logra un mejor rendimiento.

Tiene 2 constructores:
BufferedOutputStream(OutputStream os) : crea un flujo de salida almacenado en buffer que se utiliza para 
escribir los datos en el sistema especializado.

BufferedOutputStream( OutputStream os, int size) : Crea el nuevo flujo de salida que será almacenado en buffer que se utiliza 
para escribir los datos en el stream especificando el tamaño del buffer.

Metodos:
    void write(int b): Escribe el byte especificando en el stream de salida almacenado en buffer.
    void wrire(byte []b, int off, int len): Escribe los bytes de la secuencia de stream de bytes especificado en el arrelo de bytes.
                Comienza con el dezplazamiento dado.
    void flush() : Borra el flujo de salida almacenado en bufer.Vacia los datos de una secuencia y la envia a otra.
            Se necesita si se ha conectado una secuencia con otra.


 */
public class TestIO5 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos= new FileOutputStream("c:\\cadena.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fos);
        String s= "Hola amigos";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        System.out.println("Listo...");
        
    }
    
}

