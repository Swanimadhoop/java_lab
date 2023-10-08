/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author swani
 */
public class Sphere implements Shapes3D{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void printVolume()
    {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Sphere Volume: " + volume);
    }
    
    
    public void printArea()
    {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }
}
