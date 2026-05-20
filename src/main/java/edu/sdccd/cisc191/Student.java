package edu.sdccd.cisc191;

public class Student  {

    private final String name;
    private final double gpa;
    private final int id;
    public Student(String name, double gpa, int id) {

        if(id <=0 ){
            throw new IllegalArgumentException("does not work");
        }


        if(name== null || name.isEmpty() ){
            throw new IllegalArgumentException("does not work");
        }

        if(gpa < 0|| gpa > 4.0){
            throw new IllegalArgumentException("this does not work");
        }
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return("name: " + getName()+" ID: " + getId() + " GPA: " +getGpa() );
    }


    public double getGpa(){
        return gpa;
    }

    public String getName(){
        return name;
    }
    }

