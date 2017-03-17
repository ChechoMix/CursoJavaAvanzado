
package Jueves;

class simpleA extends Thread{
    public void run(){
        System.out.println("Tarea uno.");
    }
}

class simpleB extends Thread{
    public void run(){
        System.out.println("Tarea dos.");
    }
}

public class TestMulti3 {
    public static void main(String[] args) {
        simpleA t1 = new simpleA();
        simpleB t2 = new simpleB();
        
        t1.start();
        t2.start();
                
    }
    
}
