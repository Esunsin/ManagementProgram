package v3.student;

import v3.domain.Student;

public interface StudentService {
    void join(Student student);

    Student findStudentById(Long studentId);


    void showAllStudent();
}
