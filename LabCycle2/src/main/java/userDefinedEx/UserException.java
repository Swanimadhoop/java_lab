/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userDefinedEx;

/**
 *
 * @author swani
 */
public class UserException extends Exception {
    
    public UserException(String s){
        super(s);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        i=7;
        j=9;
        
        try{
            int k=i/j;
            
            if(k==0)
                throw new UserException("this is not possible.");
            System.out.println(k);
        }
        catch(UserException e){
            System.out.println("error : "+e.getMessage());
        }
        
    }
    
}
