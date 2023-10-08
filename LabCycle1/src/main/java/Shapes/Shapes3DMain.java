/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Shapes;

/**
 *
 * @author swani
 */
public class Shapes3DMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cylinder cylinder = new cylinder(2.0, 5.0);
        Sphere sphere = new Sphere(3.0);

        System.out.println("Cylinder Details:");
        cylinder.printVolume();
        cylinder.printArea();
        
        System.out.println("\nSphere Details:");
        sphere.printVolume();
        sphere.printArea();
    }
    
}
