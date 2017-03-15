
package Miercoles;

public class TestJoin extends Thread{
    public void run(){
        for (int i = 1; i <=5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i + " " + this.getName());
                
            } catch (InterruptedException ie ) {
                System.out.println(ie);
            }
        }
    }    
    public static void main(String[] args) {
        TestJoin t1= new TestJoin(), t2 = new TestJoin(), t3= new TestJoin();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        
        t1.start();
        try {
            t1.join(1500);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        
        t2.start();
        t3.start();
        
        
    }
    
    
}
