package v2.repository;

import v2.domain.Student;

import java.util.Set;

public interface StudentRepository {

    void save(Student student);

    Student findById(Long studentId);

    Set<Long> findAllId();

}
