
package Jueves;

class Tab {
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

class MyTab extends Thread{
    Tab t;
    MyTab(Tab t){
        this.t = t;
    }
    
    public void run(){
        t.printTable(5);
    }
}


class MyTab2 extends Thread{
    Tab t;
    MyTab2(Tab t){
        this.t = t;
    }
    
    public void run(){
        t.printTable(100);
    }
}

public class TestSync2 {
     public static void main(String[] args) {
     //un solo objeto:
     Tab ob= new Tab();
     
    MyTab t1 = new MyTab(ob);
    MyTab2 t2 = new MyTab2(ob);
    
    t1.start();
    t2.start();
                 
     
    }
    
}
