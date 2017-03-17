package Jueves;
/*

Java Shutdown Hook
El shutdown hook puede ser utilizado para realizar acciones de limpieza o guardar el estado cuando la JVM 
se apaga abruptamente o normalmente.

Realizar acciones de limpieza o recursos de liempieza significa cerrar el archivo de registro,
enviar algunas alertas o algo mas.

Asi que si se desea ejecutar algun codigo antes de que la JVM  se apague utilizamos Shutdown Hook

Cuando se cierra la JVM?
    Cuando el usuario presiona Ctrl + c en la consola
    Se invoca el metodo System.exit(int)
    Usuario cierra sesion

    El metodo addShutdownHook(Thread hook)
        Este ultimo de la clase Runtime se utiliza para registrar el con la JVM

Sintaxis Basica
    public void addShutdownHook(Thread hook){}

El objeto de la clase Runtime se puede obtener llamando al metodo estatico factory getRuntime(). 
Ej.
    Runtime r = new Runtime.getRuntime();

    Factory: Metodo que devuelve una instancia de una clase 

*/

class MyThread extends Thread {
    public void run(){
        System.out.println("Shut down hook task completed...");
    }    
}

class TestShutdown{
    public static void main(String[] args)  {
      
    }
}


