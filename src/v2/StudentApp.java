package v2;

import v2.domain.Student;
import v2.service.StudentService;

public class StudentApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        StudentService studentService = appConfig.studentService();

        Student student = new Student(5L, "아이언맨");

        studentService.showAllStudent();
        System.out.println("==========================");
        studentService.join(student);
        studentService.showAllStudent();
        System.out.println("==========================");
        studentService.findStudentById(1L);

    }
}
