/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

public class HerenciaJerarquica {
       public static void main(String[] args) {
        Cat cat = new Cat();
        cat.nacen();
        cat.mueren();
        
    }
    
}

class Animales{
    void nacen(){
        System.out.println("Nacen");
    }
}

class Dog extends Animales{
    void crecen (){
        System.out.println("Crecen");
    }
}

class Cat extends Animales {
    void mueren(){
        System.out.println("Me los comi jajaja...");
    }
}


