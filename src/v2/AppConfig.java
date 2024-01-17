package v2;

import v2.repository.MemoryStudentRepository;
import v2.repository.StudentRepository;
import v2.repository.SubjectRepository;
import v2.repository.MemorySubjectRepository;
import v2.service.StudentServiceImpl;
import v2.service.StudentService;
import v2.service.SubjectService;
import v2.service.SubjectServiceImpl;

public class AppConfig {

    public StudentService studentService(){
        return new StudentServiceImpl(studentRepository());
    }
    private StudentRepository studentRepository(){
        MemoryStudentRepository memoryStudentRepository = new MemoryStudentRepository();
        memoryStudentRepository.initStudents();
        return memoryStudentRepository;
    }
    public SubjectService subjectService(){
        return new SubjectServiceImpl(subjectRepository());
    }
    private SubjectRepository subjectRepository(){
        MemorySubjectRepository memorySubjectRepository = new MemorySubjectRepository();
        memorySubjectRepository.initSubjects();
        return memorySubjectRepository;
    }

}
