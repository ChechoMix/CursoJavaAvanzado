
package Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestMulti4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                cadena();
                System.out.println("Tarea uno:");            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Tarea dos.");
                escribe();
            }
        };
        
        t1.start();
        t2.start();
        
    }
    
    static void cadena(){
        try {
            FileOutputStream fos = new FileOutputStream("c:\\cadena.txt");
            String s= "Cadena";
            
            fos.write(s.getBytes());
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
     static void escribe(){
        try {
            FileOutputStream fos = new FileOutputStream("c:\\escribe.txt");
            String s= "Escribe";
            
            fos.write(s.getBytes());
            fos.close();
            System.out.println("Listo..");
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    
    
}
