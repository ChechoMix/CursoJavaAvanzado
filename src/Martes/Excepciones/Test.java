
package Martes.Excepciones;

/*
5 palabras usadas para el manejo de excepciones:
    1.- Try
    2.- Catch
    3.- Finally
    4.- throw
    5.- throws
    
*/
public class Test {
    public static void main(String[] args) {
        try {
            // int dato = 50/0;     <- ArithmeticException     
            
            int a[] = new int[5];
          //  a[5] = 0; <- ArrayIndexOutOfBoundsException
                        
        } catch(ArithmeticException ae){
            System.out.println(ae);
        } catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe);
        } catch(Exception e){
            System.out.println("Las tareas comunes se completaron");
        }
            
        
        System.out.println("resto del codigo");
        
    }
    
    
}
