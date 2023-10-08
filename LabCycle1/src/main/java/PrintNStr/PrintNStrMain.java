/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrintNStr;

/**
 *
 * @author swani
 */
public class PrintNStrMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length<2)
        {
            System.out.print("No Arguments Passed");
            return;
        }
        int n= Integer.parseInt(args[0]);
        String str = args[1];
        
        for(int i=0;i<n;i++)
        {
            System.out.print(str);
        }
    }
    
}
