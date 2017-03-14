/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/*
 
    THIS
    Hay un monton de usos para la palabra this.
    En java es una variable de referencia, que hace referencia al objeto actual.

    Usos de la palabra reservada this:
    1. this puede ser usado pra referenciar una variable de instancia a una clase
    2. this puede ser usado para invocar el metodo de la clase actual
    3. this() puede ser usado para invocar el contructor de la clase actual
    4. this puede ser pasado como argumento en una llamada a un metodo
    5. this puede ser pasado como argumento en una llamada al constructor
    6. this puede ser usado para retornar instancia de la clase actual desde el metodo

 * 
 */
public class Autoreferencia {
    public static void main(String[] args) {
        estudiante s = new estudiante(111, "Sergio", 36);
        s.display();
        
        A a = new A();
        a.n();
        
        
    }
}

class estudiante{
    int id;
    String nombre;
    int edad;
    
    estudiante(int id, String nombre, int edad){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        
    }
    
    void display(){
        System.out.println(this.id + " " +this.nombre + " " + this.edad );
    }
      
}

class A{
    void m(){
        System.out.println("hola soy una m");
    }
    
    void n(){
        System.out.println("hola soy una n");
        this.m();
    }
}

class D{
    D(){
        System.out.println("Hola soy una D");
    }
    D(int e){
        this();
        System.out.println(e);
    }
}


