/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author swani
 */
public class cylinder implements Shapes3D{
    private double radius;
    private double height;
    
    public cylinder(double h, double r)
    {
        this.height=h;
        this.radius=r;
    }
    
    public void printVolume()
    {
        double volume = Math.PI*radius*radius*height;
        System.out.println("Cylinder Volume ="+volume);
    }
    
    public void printArea()
    {
        double area = 2*Math.PI*radius*(radius+height);
        System.out.println("Cylinder Area = "+area);
    }
    
    
}

