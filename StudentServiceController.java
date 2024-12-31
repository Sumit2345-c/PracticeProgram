package com.student.service;

import com.hibernate.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Spring;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
    private static Map<String,List<student>> schoolDB;
    static 
    {
        schoolDB = new HashMap<string,List<Student>>();
        List<Student> studList = new ArrayList<Student>();
        Student stud = new Student("Raj","Calss X");
        studList.add(stud);
        stud = new Student ("Ramu","Class VII");
        studList.add(stud);
        schoolDB.put("abcschool",studList);
        studList = new ArrayList<Student>();
        stud = new Student("Rutwik","Class VI");
        studList.add(stud);
        schoolDB.put("xyzschool", studList);
    }
    @RequestMapping("/getStudentDetailsForSchool/{schoolname}")
    public List<Student> getStudents(@PathVariable String schoolname)
    {
        List<Student> studList = schoolDB.get(schoolname);
        return studList;
    }

}
