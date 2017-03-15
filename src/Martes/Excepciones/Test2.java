
package Martes.Excepciones;

public class Test2 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Vamos a dividir");
                int b = 39/0;
                
            } catch (ArithmeticException ae ) {
                System.out.println(ae);
            }
            try {
                int a[] = new int[4];
                a[5] = 4;
                        
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Cachado");
            }
            
        } catch (Exception e) {
            System.out.println("Otra excepcion");
        }
        
        System.out.println("FLUJO NORMAL");
        
        
    }
        
}
