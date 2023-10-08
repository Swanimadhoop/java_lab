/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexNos;

/**
 *
 * @author swani
 */
public class Complex {
    private double real;
    private double img;
    
    public void initialize(double real,double img)
    {
        this.real=real;
        this.img=img;       
    }
    public void printComplex()
    {
        System.out.print(real+"+"+img+"i");       
    }
    public double getReal()
    {
        return real;
    }
    public double getImg()
    {
        return img;
    }
}
