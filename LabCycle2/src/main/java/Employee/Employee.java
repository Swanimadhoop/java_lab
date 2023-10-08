/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author swani
 */
public class Employee {
    static class Date{
        int day, month, year;
        
        Date(int day, int month, int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        public String toString(){
            return day + "/" + month + "/" + year ;
        }
    }
    int id;
    String name;
    Date dob,doj;
    double salary;
    
    Employee(int id, String name, Date dob, Date doj, double salary){
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.doj=doj;
        this.salary=salary;
    }
    public String toString(){
        return "id : "+id +"\n  Name : "+ name +"\n date of birth : "+ dob+"\n date of joining : "+doj+"\n Salary : "+salary;
    }
    
}
