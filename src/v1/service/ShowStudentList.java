package v1.service;

import v1.domain.Student;
import v1.domain.StudentList;

import java.util.Scanner;

public class ShowStudentList {
    Scanner scanner = new Scanner(System.in);
    public void showStudentList(StudentList studentRepository){
        studentRepository.showStudents();
        System.out.print("등록된 과목을 볼 학생의 id값을 선택하세요 : ");
        int inputId = scanner.nextInt();
        Student selectedStudentById = studentRepository.findStudentById(inputId);
        selectedStudentById.showSubjectsRegisteredByStudent();
    }
}
