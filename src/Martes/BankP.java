/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

public class BankP {
    float getRateOfInterest(){
        return 0;
    }
    
    public static void main(String[] args) {
        BankP b;
        b = new BankP();
        System.out.println(b.getRateOfInterest());
        b = new SBIP();
        System.out.println(b.getRateOfInterest());
        b = new ICICIP();
        System.out.println(b.getRateOfInterest());
        b = new AXISP();
        System.out.println(b.getRateOfInterest());
        
                
    }
    
}
class SBIP extends BankP{
    float getRateOfInterest(){
       return 8;
    }
}
    

class ICICIP extends BankP{
    float getRateOfInterest(){
        return 7;
    }
}

class AXISP extends BankP{
    float getRateOfInterest(){
        return 9;
    }
}