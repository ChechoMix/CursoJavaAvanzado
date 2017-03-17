
package Viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.SequenceInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class TestIO9 {
    public static void main(String[] args) throws IOException{
        
        FileOutputStream fos1 = new FileOutputStream("c:\\a.txt");
        FileOutputStream fos2 = new FileOutputStream("c:\\b.txt");
        FileOutputStream fos3 = new FileOutputStream("c:\\c.txt");
        FileOutputStream fos4 = new FileOutputStream("c:\\d.txt");
        
        FileOutputStream f = new FileOutputStream("c:\\todos.txt");
        
        FileInputStream fis1 = new FileInputStream("c:\\a.txt");
        FileInputStream fis2 = new FileInputStream("c:\\b.txt");
        FileInputStream fis3 = new FileInputStream("c:\\c.txt");
        FileInputStream fis4 = new FileInputStream("c:\\d.txt");
        
        writeLine(fos1, fos2, fos3, fos4);
        
        closeFos(fos1, fos2, fos3,fos4);
        
        Vector todos = getVector(fis1, fis2, fis3, fis4);
                
        Enumeration e=todos.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        
        leer(sis,f);
        f.close();
        close(fis1, fis2, fis3, fis4);
        
        
    }

    private static void close(FileInputStream fis1, FileInputStream fis2, FileInputStream fis3, FileInputStream fis4) throws IOException {
        fis1.close();
        fis2.close();
        fis3.close();
        fis4.close();
    }

    private static void leer(SequenceInputStream sis,FileOutputStream f) throws IOException {
        int i=0;
        while((i=sis.read())!=-1){
            f.write(i);
            System.out.println((char)i);
        }
    }

    private static void closeFos(FileOutputStream fos1, FileOutputStream fos2, FileOutputStream fos3, FileOutputStream fos4) throws IOException {
        fos1.close();
        fos2.close();
        fos3.close();
        fos4.close();
    }

    private static void writeLine(FileOutputStream fos1, FileOutputStream fos2, FileOutputStream fos3, FileOutputStream fos4) throws IOException {
        String a= "Mensaje 1";
        String b= "Mensaje 2";
        String c= "Mensaje 3";
        String d= "Mensaje 4";
        
        fos1.write(a.getBytes());
        fos2.write(b.getBytes());
        fos3.write(c.getBytes());
        fos4.write(d.getBytes());
    }

    private static Vector getVector(FileInputStream fis1, FileInputStream fis2, FileInputStream fis3, FileInputStream fis4) {
        Vector v= new Vector();
                
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);
        v.add(fis4);
        
        return v;
        
    }
    
    
    
}
