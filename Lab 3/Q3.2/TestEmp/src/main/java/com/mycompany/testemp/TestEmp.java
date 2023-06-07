package com.mycompany.testemp;
public class TestEmp {
    public static void main(String[] args) {
        Employee employee = new Employee("Bogdan", 50000.0, 10000.0);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Bonus: " + employee.getBonus());
        System.out.println("Bonus Amount: " + employee.calculateBonusAmount());
    }
}
