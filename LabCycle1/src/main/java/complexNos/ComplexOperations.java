/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexNos;
import java.lang.Math;
/**
 *
 * @author swani
 */
public class ComplexOperations {
    public static Complex add(Complex c1,Complex c2)
    {
        Complex result = new Complex();
        result.initialize(c1.getReal()+c2.getReal(), c1.getImg()+c2.getImg());
        return result;
    }
    public static Complex multiply(Complex c1,Complex c2)
    {
        Complex result = new Complex();
        result.initialize(c1.getReal()*c2.getReal()-c1.getImg()*c2.getImg(),c1.getReal()*c2.getImg()+c1.getImg()+c2.getReal());
        return result;
    }
    public static double modulus(Complex c)
    {
        double mod=0;
        mod=(c.getReal()*c.getReal())+((c.getImg()*c.getImg()));
        mod=Math.sqrt(mod);
        
        return mod;
    }
    
}
