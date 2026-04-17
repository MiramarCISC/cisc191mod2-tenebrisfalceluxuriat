package edu.sdccd.cisc191;

public class Student implements StudentFilter.studentGet {
    private final int id;
    private final String name;
    private final double gpa;

    public Student(int id, String name, double gpa) {

        if(id <0 ){
            throw new IllegalArgumentException("does not work");
        }


        if(name== null || name.isEmpty() || name != toString()){
            throw new IllegalArgumentException("does not work");
        }

        if(gpa < 0|| gpa > 4.0){
            throw new IllegalArgumentException("this does not work");
        }
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }
   @Override
    public int getId(){
        return id;
    }



    @Override
    public double getGpa(){
        return gpa;
    }
    @Override
    public String getName(){
        return name;
    }
    }

