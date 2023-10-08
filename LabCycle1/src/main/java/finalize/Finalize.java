/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalize;

/**
 *
 * @author swani
 */
public class Finalize {
    int a,b,c;
    
    public Finalize(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void printProduct()
    {
        System.out.println("product = "+ a*b*c);
    }
    public void message()
    {
        System.out.println("garbage collected");
    }
    
}
