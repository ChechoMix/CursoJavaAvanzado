

package Jueves;
//Escribir una cadena:

import java.io.FileOutputStream;
import java.io.IOException;


public class TestIO2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("c:\\cadena.txt");
            String s= "Texto";
            
            fos.write(s.getBytes());
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
