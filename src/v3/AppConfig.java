package v3;

import v3.score.ScoreManage;
import v3.score.ScoreManageImpl1;
import v3.student.StudentManage;
import v3.student.StudentManageImpl1;
import v3.score.MemoryScoreRepository;
import v3.score.ScoreRepository;
import v3.score.ScoreService;
import v3.score.ScoreServiceImpl;
import v3.student.MemoryStudentRepository;
import v3.student.StudentRepository;
import v3.student.StudentService;
import v3.student.StudentServiceImpl;
import v3.subject.MemorySubjectRepository;
import v3.subject.SubjectRepository;
import v3.subject.SubjectService;
import v3.subject.SubjectServiceImpl;

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
