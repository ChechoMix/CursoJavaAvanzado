
package Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestMulitRunn implements Runnable {
    public void run(){
        show();
        escribe();
    }
       
    void show(){
       System.out.println("Tarea uno");
    }
    
    void escribe(){
       try {
            FileOutputStream fos = new FileOutputStream("c:\\hilos.txt");
            fos.write(65);
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } 
    }
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new TestMulitRunn());
        Thread t2 = new Thread(new TestMulitRunn());
        t1.start();
        t2.start();
        
        
    }
   
   
}
