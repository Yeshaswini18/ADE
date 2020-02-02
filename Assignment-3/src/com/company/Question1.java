package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {
        Course course = new Course("Science");

        course.registerStudent(new Student("a", 1));
        course.registerStudent(new Student("b", 2));
        course.registerStudent(new Student("c", 3));
        course.registerStudent(new Student("d", 4));
        course.registerStudent(new Student("e", 5));
        course.registerStudent(new Student("f", 6));
        course.registerStudent(new Student("g", 7));
        course.registerStudent(new Student("h", 8));
        course.registerStudent(new Student("i", 9));
        course.registerStudent(new Student("j", 10));
        course.registerStudent(new Student("k", 11));
    }

}

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Course {
    String title;
    int numberOfStudents = 0;
    int maxNumber = 10;
    Student[] registeredStudents = new Student[10];

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfStudents() {
        return numberOfStudents + 1;
    }

    public Student[] getStudents() {
        return registeredStudents;
    }

    public boolean isFull() {
        return numberOfStudents >= maxNumber;
    }

    public void registerStudent(Student student) {
        if (!isFull()) {
            registeredStudents[numberOfStudents] = student;
            numberOfStudents += 1;
            System.out.println("num of reg students " + numberOfStudents);
            System.out.println("Registered student with id: " + student.getId() + " and name: " + student.getName());
        } else {
            System.out.println("Cannot register student with id: " + student.getId() + " and name: " + student.getName()
                    + " as course is full");
        }
    }
}
