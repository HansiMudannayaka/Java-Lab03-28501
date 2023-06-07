package com.mycompany.testemp;
public class Employee {
    private String Empname;
    private double EmpbasicSalary;
    private double Empbonus;

    
    public Employee(String Empname, double EmpbasicSalary, double Empbonus) {
        this.Empname = Empname;
        this.EmpbasicSalary = EmpbasicSalary;
        this.Empbonus = Empbonus;
    }

    
    public String getName() {
        return Empname;
    }

    public void setName(String Empname) {
        this.Empname = Empname;
    }

 
    public double getBasicSalary() {
        return EmpbasicSalary;
    }

    public void setBasicSalary(double EmpbasicSalary) {
        this.EmpbasicSalary = EmpbasicSalary;
    }

  
    public double getBonus() {
        return Empbonus;
    }

    public void setBonus(double Empbonus) {
        this.Empbonus = Empbonus;
    }

   
    public double calculateBonusAmount() {
        return EmpbasicSalary + Empbonus;
    }
}
