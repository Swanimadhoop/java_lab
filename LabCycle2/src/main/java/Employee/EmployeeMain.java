/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author swani
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        
        List <Employee> employees = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Employees id : ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Employees name : ");
            String name =sc.nextLine();
            
            System.out.print("Employees date of birth(dd/mm/yyyy) : ");
            String dobStr = sc.nextLine();
            String[] dobParts = dobStr.split("/");
            Employee.Date dob = new Employee.Date(Integer.parseInt(dobParts[0]), Integer.parseInt(dobParts[1]), Integer.parseInt(dobParts[2]));
            
            System.out.print("Employees date of joining(dd/mm/yyyy)");
            String dojStr = sc.nextLine();
            String[] dojParts = dojStr.split("/");
            Employee.Date doj = new Employee.Date(Integer.parseInt(dojParts[0]),Integer.parseInt(dojParts[1]),Integer.parseInt(dojParts[2]));
            System.out.print("Enter salary : ");
            Double salary = sc.nextDouble();
            
            Employee employee= new Employee(id,name,dob,doj,salary);
            employees.add(employee);
        }
        Collections.sort(employees, Comparator.comparingDouble(emp->emp.salary));
        Collections.reverse(employees);
        
        System.out.println("Salary in descending order : ");
        for(Employee emp:employees){
            System.out.println(emp);
        }
    }
    
}
