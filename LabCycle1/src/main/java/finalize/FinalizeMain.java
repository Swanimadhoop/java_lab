/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalize;

/**
 *
 * @author swani
 */
public class FinalizeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Finalize f1=new Finalize(5, 8, 4);
        Finalize f2=new Finalize(9, 2, 4);
        
        f1.printProduct();
        f2.printProduct();
        f1=null;
        System.gc();
        System.gc();
        System.gc();
       
        
    }
    
}
