/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author swani
 */
public class box extends rectangle {
    protected double height;
    protected double volume;
    
    public box()
    {
        super();
        this.height=0;
    }
    public box(double l,double b,double h)
    {
        super(l,b);
        this.height=h;
    }
    public void calculateVolume()
    {
        this.volume=length*breadth*height;
    }
    public double getVolume()
    {
        return volume;
    }
    
}
