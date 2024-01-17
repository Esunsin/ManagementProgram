package v2.data;

import v2.AppConfig;
import v2.domain.*;
import v2.service.StudentService;
import v2.service.SubjectService;

public class InitData {
    AppConfig appConfig = new AppConfig();
    StudentService studentService = appConfig.studentService();
    SubjectService subjectService = appConfig.subjectService();


    private void initSubjects(){
        subjectService.register(new Subject(1L,"Java", OptionalRequired.ESSENTIAL));
        subjectService.register(new Subject(2L,"객체지향", OptionalRequired.ESSENTIAL));
        subjectService.register(new Subject(3L,"Spring", OptionalRequired.ESSENTIAL));
        subjectService.register(new Subject(4L,"JPA", OptionalRequired.ESSENTIAL));
        subjectService.register(new Subject(5L,"MySQL", OptionalRequired.ESSENTIAL));
        subjectService.register(new Subject(6L,"디자인패턴", OptionalRequired.OPTIONAL));
        subjectService.register(new Subject(7L,"Spring Security", OptionalRequired.OPTIONAL));
        subjectService.register(new Subject(8L,"Redis", OptionalRequired.OPTIONAL));
        subjectService.register(new Subject(9L,"MongoDB", OptionalRequired.OPTIONAL));
    }
    private void initStudents(){
        studentService.join(new Student(1L,"정진찬"));
        studentService.join(new Student(2L,"주준호"));
        studentService.join(new Student(3L,"박정섭"));
        studentService.join(new Student(4L,"홍세희"));
    }



}
