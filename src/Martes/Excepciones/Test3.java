/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Excepciones;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class Test3 {
    void m() throws IOException{
        throw new IOException("device error");
    }
    
    void n() throws IOException{
        m();
    }
    
    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
    
    static void validate(int age){
        if(age<18)
            throw  new ArithmeticException("edad no valida");
        else
            System.out.println("Welcome to vote");
    }
        
    public static void main(String[] args) {
        Test3 obj = new Test3();
        obj.p();
                
        
        validate(13);
        System.out.println("resto del codigo");        
        
        
    }
    
}
