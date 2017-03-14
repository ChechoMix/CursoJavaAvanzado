/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

/**
 *
 * @author HP
 */
public class EjerciciosPropuestos {
    static int n1= 0, n2 =1, n3= 0; 
    
    /**
     *
     * @param numero
     * @return
     */
    private static void rFibonnaci(int numero){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.println(" "+ n3);
        if(numero > 1)
        rFibonnaci( numero - 1); 
                       
    }
    
    private static void Fibonnaci()    {
        int n1=0, n2=1, n3,i, count =10;
        //Imprime 0 y 1:
        System.out.println(n1+ " " + n2);       
        
        for ( i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        
    }
    
    public static int factorial(int numero){
        int fac = 0;
        if(numero == 1 )
            fac = 1;
        else 
            fac = numero * factorial(numero-1);
        
        System.out.println(fac);
        
        return fac;
    }
    
    public static boolean esPrimo(int numero){
        boolean primo = true;
        for (int i = 1; i <= numero; i++) {
            if(i != 1 && i!= numero)
                if((numero % i)==0){
                    primo=false;
                    break;
                }
            }
        return primo;
    }
        
    
    public static void main(String[] args) {
        
        //Fibonnaci();
        
        rFibonnaci(5);
        
        System.out.println(" " + factorial(5));
        
        System.out.println( 10 + " es primo? " + esPrimo(10)  );
        
        
    }
    
}
