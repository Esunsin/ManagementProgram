package v2.service;

import v2.domain.Student;

public interface StudentService {
    void join(Student student);

    Student findStudentById(Long studentId);

    void showAllStudent();
}
