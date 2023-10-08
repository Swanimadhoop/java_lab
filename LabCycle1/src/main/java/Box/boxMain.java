/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Box;

/**
 *
 * @author swani
 */

public class boxMain {
    public static void main(String[] args) {

        box cube = new box(5);
        System.out.println("\nCube:");
        System.out.println("Area: " + cube.area());
        System.out.println("Volume: " + cube.volume());

        box squarePrism = new box(4, 6);
        System.out.println("\nSquare Prism:");
        System.out.println("Area: " + squarePrism.area());
        System.out.println("Volume: " + squarePrism.volume());

        box rectangularPrism = new box(3, 4, 5);
        System.out.println("\nRectangular Prism:");
        System.out.println("Area: " + rectangularPrism.area());
        System.out.println("Volume: " + rectangularPrism.volume());
    }
}
