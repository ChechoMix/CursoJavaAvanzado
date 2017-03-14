/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/*
 * Contructor: Tipo especial de metodo usado para inicializar los objetos.
 * En java un constructor es invocado en tiempo de ejecucion
 * Reglas para crear un constructor ej java:
    1.- Contructor tiene SIEMPRE el mismo nombre de la clase

    Tipos de constructor:
    1.- Default
    2.- Parametrizados

Diferencias entre un Constructor y Metodo:
    Contructor
        Es usado para inicializar el estado del objeto
        No tiene tipo de retorno
        Es invocado implicitamente
        El compilador java provee un contructor por default si no tiene uno
        El nombre del constructor es el mismo que el de la clase

    Metodo
        Es usado para exponer el comportamiento del objeto
        Tiene un valor por retorno
        Es invocado explicitamente
        No lo provee el compilador en ningun caso
        Puede o no tener el mismo nombre de la clase

    

 *
 * @author HP
 */
public class Student {
    
    
    int id;
    String nombre;
    int edad;
    
    //Contructor por Default
    Student(){
        System.out.println("Soy un contructor por default");
    }
    //Contructor con 2 parametros:
    Student(int i, String n){
        this.id = i;
        this.nombre = n;
    }
    
    //Contructor con 3 parametros:
    Student(int a, String b,int c){
        this.id = a;
        this.nombre = b;
        this.edad =c;
    }
    
    
    void diplay(){
        System.out.println(id + " " + nombre);
    }
    
    public static void main(String[] args) {
        
        Student student = new Student();
        student.diplay();
        
        Student student2 = new Student(111,"Paloma");
        student2.diplay();
        
        Student student3 = new Student(123,"Sergio",36);
        student3.diplay();
        
        
    }
    
}
