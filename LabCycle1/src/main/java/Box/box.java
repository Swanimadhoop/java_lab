/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Box;

/**
 *
 * @author swani
 */
public class box {
    private double length;
    private double breadth;
    private double height;
    private double area;
    private double volume;
    
    public box()
    {
        length=0;
        breadth=0;
        height=0;
        area=0;
        volume=0;                
    }
    public box(double s)
    {
        this.length=this.breadth=this.height=s;
    }
    public box(double l,double b)
    {
        this.length=l;
        this.breadth=this.height=b;
    }
    public box(double l,double b,double h)
    {
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    public double area()
    {
        this.area=2*((length*breadth)+(breadth*height)+(height*length));
        return area;
    }
    public double volume()
    {
        this.volume=length*breadth*height;
        return volume;
    }   
}
