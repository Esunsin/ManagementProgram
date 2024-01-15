import data.InitData;
import domain.ScoreList;
import domain.Student;
import domain.StudentList;
import domain.SubjectList;
import service.RoundAndScoreManagement;
import service.StudentManagement;
import service.SubjectManagement;
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
        StudentManagement studentManagement = new StudentManagement();
        SubjectManagement subjectManagement = new SubjectManagement();
        ShowStudentList showStudentList = new ShowStudentList();
        RoundAndScoreManagement roundAndScoreManagement = new RoundAndScoreManagement();


        while (true) {
            //campManagement 로직
            while (true) {
                frame.mainFrame();
                int click = input.nextInt();
                //수강생 등록
                if (click == 1) {
                    studentManagement.createStudent(studentRepository);
                }
                //수강생 목록
                if (click == 2) {
                    showStudentList.showStudentList(studentRepository);
                }
                //수강생 과목별 시험 회차 및 점수 등록
                if (click == 3) {
                    roundAndScoreManagement.registerRoundAndScore(studentRepository,scoreRepository);
                }
                //수강생 과목별 시험 회차 및 점수 수정
                if (click == 4) {
                    roundAndScoreManagement.updateRoundAndScore(studentRepository,scoreRepository);
                }
                //수강생 특정 회차별 등급 조회
                if (click == 5) {
                    roundAndScoreManagement.showGradeByTestNumber(studentRepository,scoreRepository);
                }
                //수강생 과목 등록
                if (click == 6){
                    Student addedStudent = subjectManagement.addSubjectsToStudent(studentRepository, subjectRepository);
                    addedStudent.showStudentInfo();
                    addedStudent.showSubjectsRegisteredByStudent();
                }
            }
        }
    }
}
