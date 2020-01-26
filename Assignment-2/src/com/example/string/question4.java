package com.example.string;

import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Ross");
        emp1.setAge(25);
        emp1.setSalary(10000.00);

        System.out.println("The Social Security Tax of the Employee " + emp1.getName() + "is " + socialSecurityTax(emp1));
        System.out.println("Insurance Coverage for the employee" + emp1.getName() + "is " + insuranceCoverage(emp1));

        Employee emp2 = new Employee();
        emp2.setName("Rachel");
        emp2.setAge(45);
        emp2.setSalary(8000.00);

        System.out.println("The Social Security Tax of the Employee " + emp2.getName() + " is " + socialSecurityTax(emp2));
        System.out.println("Insurance Coverage for the employee" + emp2.getName() + " is " + insuranceCoverage(emp2));

        Employee emp3 = new Employee();
        emp3.setName("Chandler");
        emp3.setAge(55);
        emp3.setSalary(12000.00);
        System.out.println("The Social Security Tax of the Employee " + emp3.getName() + " is " + socialSecurityTax(emp3));
        System.out.println("Insurance Coverage for the employee" + emp3.getName() + " is " + insuranceCoverage(emp3));

        Employee emp4 = new Employee();
        emp4.setName("Monica");
        emp4.setAge(61);
        emp4.setSalary(13000.00);
        System.out.println("The Social Security Tax of the Employee " + emp4.getName() + " is " + socialSecurityTax(emp4));
        System.out.println("Insurance Coverage for the employee" + emp4.getName() + " is " + insuranceCoverage(emp4));

        sortSalary(emp1, emp4, emp3);
    }

    public static double socialSecurityTax(Employee emp) {

        double SST;
        if (emp.getSalary() <= 8900) {
            SST = 0.062 * emp.getSalary();
        } else {
            SST = 0.062 * 106800;
        }
        return SST;
    }

    public static double insuranceCoverage(Employee emp) {
        double insuranceCoverage = 0;
        if (emp.getAge() < 35) {
            insuranceCoverage = 0.03 * emp.getSalary();
        }
        if (emp.getAge() >= 35 && emp.getAge() <= 50) {
            insuranceCoverage = 0.04 * emp.getSalary();
        }
        if (emp.getAge() > 50 && emp.getAge() < 60) {
            insuranceCoverage = 0.05 * emp.getSalary();
        }
        if (emp.getAge() > 60) {
            insuranceCoverage = 0.06 * emp.getSalary();
        }
        return insuranceCoverage;
    }

    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        System.out.println("Employee names are arranged in ascending order according to their salary:(using comparator)"
                + " " + employees.get(0).getName() + " " + employees.get(1).getName() + " " + employees.get(2).getName());
    }
}

/*
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        double[] salary = {e1.getSalary(), e2.getSalary(), e3.getSalary()};
        double TotalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        double maxSalary = salary[0];
        double minSalary = salary[0];
        List<Employee> employees = new ArrayList<Employee>();
        for (double number : salary) {
            if (maxSalary < number) {
                maxSalary = number;
            }
            if (minSalary > number) {
                minSalary = number;
            }
        }
        double midSalary = TotalSalary - (maxSalary + minSalary);

        if (maxSalary == e1.getSalary()) {
            employees.add(e1);
        }
        if (maxSalary == e2.getSalary()) {
            employees.add(e2);
        }
        if (maxSalary == e3.getSalary()) {
            employees.add(e3);
        }

        if (midSalary == e1.getSalary()) {
            employees.add(e1);
        }
        if (midSalary == e2.getSalary()) {
            employees.add(e2);
        }
        if (midSalary == e3.getSalary()) {
            employees.add(e3);
        }

        if (minSalary == e1.getSalary()) {
            employees.add(e1);
        }
        if (minSalary == e2.getSalary()) {
            employees.add(e2);
        }
        if (minSalary == e3.getSalary()) {
            employees.add(e3);
        }
        System.out.println("Employee names are arranged in ascending order according to their salary :"
                + " " + employees.get(0).getName() + " " + employees.get(1).getName() + " " + employees.get(2).getName());

    }
}
*/

class Employee {
    String name;
    int age;
    double salary;

    public Employee() {}

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
