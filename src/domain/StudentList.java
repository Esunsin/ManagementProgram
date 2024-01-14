package domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList= new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void showStudents(){
        for (Student student : studentList) {
            student.showStudentInfo();
        }
    }

    public Student findStudentById(Integer id) {
        return studentList.get(id);
    }

}
