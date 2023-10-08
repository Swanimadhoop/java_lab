/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

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
        SalarySlip employee=new SalarySlip("swani", "123", 50000);
        employee.printInfo();
        employee.CalcSalary();
        employee.printSlip();
        
    }
    
}
