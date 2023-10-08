/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author swani
 */
public class rectangle {
    protected double length;
    protected double breadth;
    protected double area;
    
    public rectangle()
    {
        this.length=0;
        this.breadth=0;
        this.area=0;
    }
    public rectangle(double l,double b)
    {
        this.length=l;
        this.breadth=b;
    }
    public void calculateArea()
    {
        this.area = length * breadth;
    }
    public double getArea()
    {
        return area;
    }
}
