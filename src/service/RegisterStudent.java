package service;

import domain.Student;
import domain.StudentList;
import domain.SubjectList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterStudent {
    private Scanner scanner = new Scanner(System.in);

    public void createStudent(StudentList studentRepository) {
        System.out.print("등록할 학생의 이름을 입력하세요 : ");
        String inputStudentName = scanner.next();
        Student addStudent = new Student(inputStudentName);
        studentRepository.addStudent(addStudent);
    }

}
