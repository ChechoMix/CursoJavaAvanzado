package Jueves;
/*
La sincronizacion en java es la capacidad de controlar el acceso de multiples hilos en cualquier recurso compartido.
La sincronizacion es la mejor opcion cuando queremos permitir que solo un hilo pueda acceder a recursos compartidos.

La sincronizacion es principalmente usada para :
    1.- Prevenir la interferencia entre hilos
    2.- Prevenir problemas de inconsistencia

Tipos de sincronización:
1.- Procesos
2.- Hilos: Mutualmente excluyentes
    1.- Metodo sincronizado
    2.- Bloque sincronizado
    3.- Sincronizacion estatica
    
        Cooperación:Comunicacion entre hilos
        Exclusion Mutua: Ayuda a prevenir que los hilos interfieran entre si mientras comparten información
        
Bloqueo: La sincronización se basa en una entidad interna conocida como lock o monitor.
Cada objeto tiene un bloqueo asociado a el. Por convención un hilo necesita un acceso consistente a los 
campos de un objeto, tiene que adquirir el bloque del objeto antes de acceder a ellos y a continuación
liberar el bloqueo cuando se hace con ello.

Desde Java 5, el paquete java.util.concurrent.locks contiene varias implementaciones de bloqueo.

Ejemplo sin Sincronización:


*/
class Table {
    void printTable(int n){
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

class MyT extends Thread{
    Table t;
    MyT(Table t){
        this.t = t;
    }
    
    public void run(){
        t.printTable(5);
    }
}


class MyT2 extends Thread{
    Table t;
    MyT2(Table t){
        this.t = t;
    }
    
    public void run(){
        t.printTable(100);
    }
}

public class TestSync {
    public static void main(String[] args) {
     //un solo objeto:
     Table ob= new Table();
     
    MyT t1 = new MyT(ob);
    MyT2 t2 = new MyT2(ob);
    
    t1.start();
    t2.start();
                 
     
    }
    
}
