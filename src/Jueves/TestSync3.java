
package Jueves;


class Tabla {
    synchronized void printTable(int n){
        //metodo no sincronizado:
        for (int i = 1; i <= 5; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        
    }
}

public class TestSync3 {
    public static void main(String[] args) {
        //solo un objeto
        final Tabla tabla = new Tabla();
        Thread t1= new Thread(){
            public void run(){
                tabla.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                tabla.printTable(100);
            }
        };    
        
        t1.start();
        t2.start();
        
    }
    
}
