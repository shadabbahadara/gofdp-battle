package com.khan.creational.builder;

public class BuilderApplication {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .setName("ename")
                .setAddress("address")
                .setDepartment("department")
                .build();

        System.out.println(employee);
    }
}
