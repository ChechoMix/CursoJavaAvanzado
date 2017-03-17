package Jueves;


import java.io.FileInputStream;
import java.io.IOException;

public class TestIO3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("c:\\cadena.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
                        
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    
    
    
}
