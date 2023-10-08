/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author swani
 */
public class nullPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n= null;
        
        try{
            int length= n.length();
            System.out.print("length of string = " +length);
        }
        catch(NullPointerException e){
            System.out.println("Null pointer Exception : "+e.getMessage());
        }
    }
    
}
