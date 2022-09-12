/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2025.mu15.comp.sci.practice;

/**
 *
 * @author MUON
 */
public class Student {
    String name;
    int id, friendship;
    double grade, money;
    
    public Student(String n) {
        System.out.println("A new student has enrolled.");
        this.name = name;
        this.name = n;
        friendship = 0;
        money = 0;
    }
    
    public void introduce() {
        System.out.printf("Hello, my name is %s.%n", name);
    }
    
    public double getGrade() {
        return grade;
    }
}
