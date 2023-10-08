/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author swani
 */
public class Employee{
    protected String name;
    protected String code;
    protected double basicPay;
    
    public Employee(String name, String code, double basicPay)
    {
        this.name=name;
        this.code=code;
        this.basicPay=basicPay;
    }
    public void printInfo()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee code : "+code);
        System.out.println("Basic Pay : "+basicPay);
    }    
}

interface Salary{
    void CalcSalary();
}

class SalarySlip extends Employee implements Salary{
    double salary, deductions;
    
    public SalarySlip(String name, String code, double basicPay)
    {
        super(name, code, basicPay);
        this.deductions=0;
        this.salary=0;
    }
    public void CalcSalary(){
        deductions=0.5*basicPay;
        salary=basicPay-deductions;
    }
    public void printSlip()
    {
        System.out.println("Employee Salary : "+salary);
    }
}
