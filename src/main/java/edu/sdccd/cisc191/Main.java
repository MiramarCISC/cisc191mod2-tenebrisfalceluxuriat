package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO create students
        Student[] students = new Student[4];
        Student a = new Student("alpha",3.5,1);
        Student b = new Student( "bravo", 3.6,2);
        Student c = new Student("charlie",3.7,3);
        Student d = new Student( "delta",3.8,4);
        List<Student> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        // TODO demonstrate filtering
        List<Student> GoodGpa = StudentAnalyzer.filter(list, s -> s.getGpa() > 3.5);
        System.out.println("Students that have a high gpa above 3.5");
        for(Student Above : GoodGpa){
            System.out.println(Above);
        }
        // TODO demonstrate sorting
        list.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println("Sorted by GPA");
        for (Student sort : students) {
            System.out.println(sort);
        }
        // TODO print average GPA
        Double averageGpa = 0.0;
        averageGpa = a.getGpa() + b.getGpa() +c.getGpa() +d.getGpa();
        averageGpa = averageGpa/4;
        System.out.println("average: " + averageGpa);
    }
}