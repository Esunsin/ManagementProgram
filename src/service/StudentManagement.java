package service;

import domain.Student;
import domain.StudentList;

import java.util.Scanner;

public class StudentManagement {
    private Scanner scanner = new Scanner(System.in);

    public void createStudent(StudentList studentRepository) {
        System.out.print("등록할 학생의 이름을 입력하세요 : ");
        String inputStudentName = scanner.next();
        Student addStudent = new Student(inputStudentName);
        studentRepository.addStudent(addStudent);
    }

}
