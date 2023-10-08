/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexNos;

/**
 *
 * @author swani
 */
import java.util.Scanner;
public class ComplexMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        Complex c1= new Complex();
        System.out.print("Enter the real part of first complex number: ");
        double r1=sc.nextDouble();
        System.out.print("Enter the imaginary part of first complex number: ");
        double i1=sc.nextDouble();
        c1.initialize(r1, i1);
        
        Complex c2=new Complex();
        System.out.print("Enter the real part of second complex number: ");
        double r2=sc.nextDouble();
        System.out.print("enter the imaginary part of sceond complex numebr: ");
        double i2=sc.nextDouble();
        c2.initialize(r2, i2);
        
        sc.close();
        
        System.out.print("\n First complex number: ");
        c1.printComplex();
        System.out.print("\n second complex number: ");
        c2.printComplex();
        
        Complex sum= ComplexOperations.add(c1,c2);
        System.out.print("\n Sum of complex numbers");
        sum.printComplex();
        
        Complex product= ComplexOperations.multiply(c1, c2);
        System.out.println("\n product of complex numbers: ");
        product.printComplex();
        
        System.out.println("\n modulus of complex number 1: "+ComplexOperations.modulus(c1));
        System.out.println("\n modulus of complex number 1: "+ComplexOperations.modulus(c2));       
    }
    
}
