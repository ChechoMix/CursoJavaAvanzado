

package Miercoles;

class TestCall extends Thread{
    public void run() {
        System.out.println("running");
    }
}

public class TestCallRun extends Thread {
    
    public  void run(){
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i + " Hilo : " + this.getName()  );
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }                
        }
    }
    
    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun(),t2= new TestCallRun();
        t1.setName("Start");
        t2.setName("Run");
        t2.run();
        t1.run();
  
        
        
    }
    
    
}
