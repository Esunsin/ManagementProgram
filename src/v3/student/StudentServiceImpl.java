package v3.student;

import v3.domain.Student;

import java.util.Set;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void join(Student student) {
        studentRepository.save(student);
    }
    @Override
    public Student findStudentById(Long studentId) {
        Student findStudent = studentRepository.findById(studentId);
        System.out.println(findStudent);
        return findStudent;
    }


    @Override
    public void showAllStudent(){
        Set<Long> allId = studentRepository.findAllId();
        for (Long studentId : allId) {
            Student student = studentRepository.findById(studentId);
            System.out.println(student);
        }
    }
}
