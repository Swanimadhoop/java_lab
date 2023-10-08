/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author swani
 */
public class studentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student();
        s1.read();
        s1.calculate();
        s1.getTotal();
        
        student s2=new student();
        s2.read();
        s2.calculate();
        s2.getTotal();
        
        if(s1.getTotal()>s2.getTotal())
        {
            System.out.print("\n Details of the student with the higher score \n");
            s1.display();
        }
        else if(s2.getTotal()>s1.getTotal())
        {
            System.out.print("Details of the student with the higher score \n");
            s2.display();
        }
        else{
            System.out.print("Both have the same score");
        }
        
        
    }
    
}
