

package Miercoles;

public class TwiceTest  extends Thread{
    public void run(){
        
        System.out.println("corriendo...");
        
    }
        
    public static void main(String[] args) {
        
        TwiceTest t1 = new TwiceTest();
        t1.start();
        if(t1.isAlive())
            throw new IllegalThreadStateException("ya lo cache");
        else
            t1.start();
                
    }
    
}
