package com.mycompany.testemp;
public class TestEmp {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Ruwan Perera");
        employee.setAge(24);
        employee.setSalary(60000.0);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
      

