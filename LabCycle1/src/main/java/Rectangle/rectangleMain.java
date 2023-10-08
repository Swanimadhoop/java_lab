/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rectangle;

/**
 *
 * @author swani
 */
public class rectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectangle r =new rectangle(3,7);
        r.calculateArea();
        System.out.println("Rectangle");
        System.out.println("Area = "+r.getArea());
        
        box b= new box(7,9,6);
        b.calculateArea();
        b.calculateVolume();
        System.out.println("Box");
        System.out.println("Volume= "+b.getVolume());
    }
    
}
