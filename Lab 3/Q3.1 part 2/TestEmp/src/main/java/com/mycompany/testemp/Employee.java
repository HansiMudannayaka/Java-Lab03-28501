package com.mycompany.testemp;
public class Employee {
    private String Empname;
    private int Empage;
    private double Empsalary;

    
    public Employee(String Empname, int Empage, double Empsalary) {
        this.Empname = Empname;
        this.Empage = Empage;
        this.Empsalary = Empsalary;
    }

   
    public String getName() {
        return Empname;
    }

    public int getAge() {
        return Empage;
    }

    public double getSalary() {
        return Empsalary;
    }
}
