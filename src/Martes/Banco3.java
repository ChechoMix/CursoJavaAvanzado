
package Martes;


abstract class Banco{
    abstract int getRateOfInterest();
}

class Bancomer extends Banco{
    int getRateOfInterest(){
        return 7;
    }
}
class HSBC extends Banco{
    int getRateOfInterest(){
        return 8;
    }
}
class Bancoppel extends Banco{
    int getRateOfInterest(){
        return 9;
    }
}

public class Banco3 {
    public static void main(String[] args) {
        Banco b;
        b= new Bancomer();
        System.out.println("La tasa de interes de Bancomer es :" + b.getRateOfInterest());
        
        b= new HSBC();
        System.out.println("La tasa de interes de HSBC es :" + b.getRateOfInterest());
        
        b= new Bancoppel();
        System.out.println("La tasa de interes de Bancoppel es :" + b.getRateOfInterest());
        
        
    }
    
}
