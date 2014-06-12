package com.hackbulgaria.corejava.collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSort {

    //

    public List<Student> sort (List<Student> list) {
        List<Student> gradeList = new ArrayList<>();
        for (Student student : list) {
            for(int i = 2; i <= 6; i++){
                if (i == student.grade) {
                    gradeList.add(student);
                }
            }
        }
        
        List<Student> sortedList = gradeList;
        //TODO sort by name
        return sortedList;
    }
}
