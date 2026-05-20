package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer  {


    static List<Student> filter(List<Student> students , StudentFilter filter ){
        List<Student> result = new ArrayList<>();
        for(Student s: students){
            if(filter.test(s)){
                result.add(s);
            }
        }
        return result;
    }


    public static double averageGpa(List<Student> list) {
        double avg = 0;
        for(Student avge : list){
            avg+= avge.getGpa();

        }
        return avg/ list.size();
    }
}
