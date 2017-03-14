
package Martes;

/**
 *
 * @author HP
 */
public class Bank {
    float getRateOfInterest(){
        return 0;
    }
    
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        
        System.out.println(b.getRateOfInterest());
        System.out.println(s.getRateOfInterest());
        System.out.println(i.getRateOfInterest());
        System.out.println(a.getRateOfInterest());
                
    }
    
}
class SBI extends Bank{
    float getRateOfInterest(){
       return 8;
    }
}
    

class ICICI extends Bank{
    float getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    float getRateOfInterest(){
        return 9;
    }
}

/*
Un metodo estatico no puede ser redefinido por que el metodo estatico estan enlazado
con la clase, miestras que el metodo de una instancia esta enlazado al objeto

Signatura--> el encabezado de un metodo

*/
