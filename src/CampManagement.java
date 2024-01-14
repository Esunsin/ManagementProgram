import data.InitData;
import domain.ScoreList;
import domain.Student;
import domain.StudentList;
import domain.SubjectList;
import service.RegisterStudent;
import service.RegisterSubject;
import service.ShowStudentList;

import java.util.Scanner;

public class CampManagement {
    public void systemOn() {
        Scanner input = new Scanner(System.in);
        //data
        InitData initData = new InitData();
        final StudentList studentRepository = initData.studentList();
        final SubjectList subjectRepository = initData.subjectList();
        final ScoreList scoreRepository = initData.scoreList();

        //할당
        Frame frame = new Frame();
        RegisterStudent registerStudent = new RegisterStudent();
        RegisterSubject registerSubject = new RegisterSubject();
        ShowStudentList showStudentList = new ShowStudentList();


        while (true) {
            //campManagement 로직
            while (true) {
                frame.mainFrame();
                int click = input.nextInt();
                //수강생 등록
                if (click == 1) {
                    registerStudent.createStudent(studentRepository);
                }
                //수강생 목록
                if (click == 2) {
                    showStudentList.showStudentList(studentRepository);
                }
                //수강생 과목별 시험 회차 및 점수 등록
                if (click == 3) {

                }
                //수강생 과목별 시험 회차 및 점수 수정
                if (click == 4) {

                }
                //수강생 특정 회차별 등급 조회
                if (click == 5) {

                }
                //수강생 과목 등록
                if (click == 6){
                    Student addedStudent = registerSubject.addSubjectsToStudent(studentRepository, subjectRepository);
                    addedStudent.showStudentInfo();
                    addedStudent.showSubjectsRegisteredByStudent();
                }
            }
        }
    }
}
