package com.mycompany.testemp;
public class TestEmp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ruwan Perera", 24, 60000.0);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}


