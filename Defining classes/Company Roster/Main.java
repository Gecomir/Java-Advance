package Defining_classes.companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        ArrayList<Employee> employees = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        
        for (int i = 0; i < countPeople; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            Employee employee = null;


            switch (input.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (input[4].matches("\\d+")) {
                        int agePerson = Integer.parseInt(input[4]);
                        employee = new Employee(name, salary, position, department, agePerson);
                    } else {
                        String emailPerson = input[4];
                        employee = new Employee(name, salary, position, department, emailPerson);
                    }
                    break;
                case 6:
                    String email = input[4];
                    int age = Integer.parseInt(input[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }
            boolean departmentExists = departmentList.stream().anyMatch(dep -> dep.getName().equals(department));
            if(!departmentExists){
                departmentList.add(new Department(department));
            }
            Department currentDepartment = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDepartment.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentList.stream()
                .max(Comparator.comparingDouble(Department::calculateSalary))
                .get();
        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

    }
}
