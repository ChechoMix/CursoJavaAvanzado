
package Miercoles;

public class TestMultiPriority extends Thread{
    public void run(){
        System.out.println("El hilo que esta corriendo es:" + Thread.currentThread().getName() );
        System.out.println("La prioridad del hilo actual es :" +Thread.currentThread().getPriority() );
    }
    
    public static void main(String[] args) {
        TestMultiPriority p1= new TestMultiPriority(), p2 = new TestMultiPriority(), p3= new TestMultiPriority();
        p1.setName("p1");
        p2.setName("p2");
        p3.setName("p3");
        
        p1.setPriority(MIN_PRIORITY);
        p2.setPriority(MAX_PRIORITY);
       
        p1.start();
        p2.start();
        
        
    }
    
}
