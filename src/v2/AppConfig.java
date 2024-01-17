package v2;

import v2.management.ScoreManage;
import v2.management.ScoreManageImpl1;
import v2.management.StudentManage;
import v2.management.StudentManageImpl1;
import v2.repository.*;
import v2.service.*;

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

    private ScoreRepository scoreRepository() {
        return new MemoryScoreRepository();
    }
    public ScoreService scoreService(){
        return new ScoreServiceImpl(scoreRepository());
    }
    public StudentManage studentManage(){
        return new StudentManageImpl1(studentService(), subjectService());
    }

    public ScoreManage scoreManage(){
        return new ScoreManageImpl1(studentService(), subjectService(), scoreService());
    }
}
