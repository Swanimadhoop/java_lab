/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author swani
 */
public class numFormatEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nonNumString = "aaa";
        
        try{
            int num=Integer.parseInt(nonNumString);
            System.out.println("num=" +nonNumString);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception : "+e.getMessage());
            
        }
    }
    
}
