package v3.student;

import v3.domain.Student;
import v3.domain.Subject;
import v3.subject.SubjectService;

import java.util.Scanner;

public class StudentManageImpl1 implements StudentManage {
    private Scanner input = new Scanner(System.in);
    private final StudentService studentService;
    private final SubjectService subjectService;

    public StudentManageImpl1(StudentService studentService, SubjectService subjectService) {
        this.studentService = studentService;
        this.subjectService = subjectService;
    }

    @Override
    public void registerStudent(){
        System.out.println("[ 수 강 생 등 록 ]\n" +
                "수강생의 Id값을 입력하세요.(숫자)");
        Long inputStudentId = input.nextLong();
        System.out.println("수강생의 이름을 입력하세요.");
        String inputStudentName = input.next();

        //리팩토링 요망-------
        subjectService.showAllSubject();
        System.out.println("등록할 과목의 Id 값을 입력하세요(한개) - test용 나중에 따로 뺄 예정");
        Long inputSubjectId = input.nextLong();
        Subject selectedSubject = subjectService.findSubject(inputSubjectId);
        //-----------------

        Student madeStudent = new Student(inputStudentId,inputStudentName);
        madeStudent.addSubject(selectedSubject);
        studentService.join(madeStudent);

        //등록된 학생 정보랑 같이 완료 메시지
        Student registeredStudent = studentService.findStudentById(madeStudent.getStudentId());
        System.out.println(registeredStudent);
        System.out.println("<<<등록된 과목>>>");
        registeredStudent.showRegisteredSubject();

        System.out.println("[등록되었습니다]");


    }
    @Override
    public void showRegisteredStudentList(){
        studentService.showAllStudent();
    }

}
