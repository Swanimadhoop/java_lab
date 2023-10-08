/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author swani
 */
import java.util.Scanner;
public class student {
    private String name;
    private int rollNo,totalMark;
    private int[] marks;
    
    public student()
    {
        marks=new int[5];
    }
    public void read() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name= sc.nextLine();
        System.out.print("Enter roll no: ");
        rollNo =sc.nextInt();
        System.out.print("Enter 5 subject marks: ");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }
    }
    public void calculate()
    {
        totalMark=0;
        for(int i=0;i<5;i++)
        {
            totalMark+=marks[i];
        }
    }
    
    public int getTotal()
    {
        return totalMark;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollNo);
        System.out.println("Marks: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]+ " ");
        }
        System.out.print("Total Marks: "+totalMark);
    }
}
