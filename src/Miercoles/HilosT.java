
package Miercoles;

/*

( Paralelismo )Multihilos en java: Es el proceso para ejecutar muchos hilos de manera simultanea.
Hilo: SubProceso ligero, unidad muy pequeña de procesamiento.
(Concurrencia) Multiprocesamiento y Multihilo se utilizan para lograr la multitarea.

Ventajas de usar hilos:
    1.- No bloqueamos al usuario porque son tareas independientes y se pueden realizar muchas tareas al mismo tiempo.
    2.- Podemos realizar muchas tareas al mismo tiempo ahorrando tiempo.
    3.- Los hilos al ser independientes no se afectan entre si, en caso de ocurrir una excepcion en un hilo los demas funcionan igual

Multitarea: Proceso de ejecución de muchas tareas simultaneas.Usamos la multitarea para utilizar el CPU. La multitarea se logra de los maneras:
1.- Multitarea basada en procesos (Multiproceso)
    * Cada proceso tiene su propia direccion  en memoria, es decir, cada proceso asigna un area de memoria separada.
    * El proceso es pesado.
    * El costo de la comunicación entre el proceso es alto.
    * Cambiar de un proceso a otro requiere de tiempo para guardar y cargar registros, mapas de memoria, listas de actualizacion, etc.

2.- Multitarea basada en hilos (Multihilo)
    * Los hilos comparten los mismos espacios en memoria para direcciones.
    * El hilo es ligero
    * El costo de comunicación entre hilos es bajo.

Un hilo es un subproceso ligero, una unidad pequeña de procesamiento. Es una via de ejecución separada.
Los hilos son independientes, si se produce una excepción en un hilo no afecta a los demas hilos y comparten 
un area en memoria comun.

Ciclo de vida de un hilo:
    Un hilo puede ejecutarse en uno de sus 5 estados. De acuerdo con Oracle solo hay 4 en el Ciclo de vida de java (Ejecutables)
    el estado running no existe.
    new, runnable, non-runnable and terminated
    Pero para entender mejor los hilos explicare los 5 estados.

    El ciclo de vida del hilo en java lo controla la JVM, los estados son:
    1.- New: El hilo esta en este estado, si se crea una instancia de la clase Thread pero antes de la invocación del metodo star().
    2.- Runnable: El hilo esta en este estado, despues de la invocación del metodo start(), pero el thread scheduler(administrador de hilos)
            no lo ha seleccionado como el hilo en ejecución.
    3.- Running: El hilo se encuentra aqui cuando el thread scheduler lo ha seleccionado.
    4.- Non-Runnable (Blocked): Es el estado cuando el hilo sigue activo,sin embargo no es apto para ejecutarse.
    5.- Terminated: Es el estado cuando ha finalizado o muerto, cuando sale del metodo run().

    Hay 2 formas de crear un hilo:
        1.- Al extender de la clase Thread.
        2.- Al implementar la interface Runnable.

    
Clase Thread:
    Proporciona los constructores y metodos para crear y realizar operaciones en un hilo. La clase Thread extiende de la clase Object 
    e implementa la interface Runnable.

Constructores comunes de la clase Thread:
    Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r,String name)

Runnable 

    La interface Runnable debe ser implementada por cualquier clase cuyas instancias esten destinadas a ser ejecutadas por un hilo.
    La interface Runnable tiene un solo metodo denominado run()
    public void rub(): es usado para realizar la accion de un hilo.


 */

public class HilosT extends Thread {
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    public static void main(String args) {
        HilosT t1 = new HilosT();
        t1.start();
    }
    
}

class Hilos implements Runnable{

    public void run() {
        System.out.println("El hilo esta corriendo (Runnable)");
    }
    public static void main(String[] args) {
        Hilos t = new Hilos();
        Thread thread = new Thread(t);
        thread.start();
    }
    
}

/*
        public void run(){
           //Se utiliza para realizar la accion de mi hilo
        }
        public void start(){
           //Inicia la ejecución de del hilo, La JVM llama al metodo run() del hilo
        }
        public void sleep(){
           //Hace que el hilo actual en ejecución se detenga temporalmente durante el numero especificado en milisegundos
        }
       
        public void join(){
           //Espera que un hilo se muera para ejecutar otra cosa.
        }
        public int getPriority(){
           //Regresa la prioridad del hilo 
        }
        public int setPriority(){
           //Cambia la prioridad del hilo
        }
        public String getName(){
           // Regresa el nombre del hilo
        }
        public void setName(){
            //asigna el nombre al hilo
        }
        
        public Thread currentThread(){
            //Devuelve la referencia al hilo en ejecución actual.
        }
        public int getId(){
            //Devuelve el id del hilo
        }
        
        public Thread.State getState(){
            // Regresa el estado actual del hilo
        }
        
        public boolean isAlive(){
            // Prueba si el hilo esta vivo
        }
        
        public void yield(){
            // Hace que el objeto del hilo actualmente en ejecución, se detenga temporalmente y permita que otros hilos se ejeuten.
        }
        public void suspend(){
            // Deprecado, para suspender el hilo
        }
        public void stop(){
            // Deprecado, se utiliza para detener el hilo
        
        }
        public boolean isDaemon(){
            // Prueba si es un demonio0
        }
        public void setDaemon(){
            //Marca al hilo como un demonio
        }
        public void interrupt(){
            //Interrumpe el hilo
        }
        public boolean isInterrupted(){
            // Verifica si el hilo se puede interrumpir
        }
        
        public statid boolean interrupted(){
            //Prueba si el hilo actual se ha interrumpido
        }
        
       */
       
    

