/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaadvanced.Lunes;

class Rectangulo {
    int length,width;
        
    void agregar(int l, int w){
        this.length=l;
        this.width = w;
    }
    
    void calcularArea(){
        System.out.println(this.length * this.width);
    }
  }

public class PruebaRectangulo{
    
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(), rec2 = new Rectangulo();
        rec.agregar(2,4);
        rec2.agregar(4,10);
        
        rec.calcularArea();
        rec2.calcularArea();

    }
    
    
}