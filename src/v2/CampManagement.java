package v2;


import v2.management.ScoreManage;
import v2.management.StudentManage;
import v2.service.StudentService;
import v2.service.SubjectService;

import java.util.Scanner;

public class CampManagement {
    public void systemOn() {
        Scanner input = new Scanner(System.in);
        Frame frame = new Frame();
        AppConfig appConfig = new AppConfig();
        //할당
        StudentManage studentManage = appConfig.studentManage();
        ScoreManage scoreManage = appConfig.scoreManage();

        while (true) {
            //campManagement 로직
           frame.mainFrame();
           String click = input.next();
            if (click.equals("q")) {
                studentManage.registerStudent();
            }
            //수강생 목록
            if (click.equals("w")) {
                studentManage.showRegisteredStudentList();
            }
            //수강생 과목별 시험 회차 및 점수 등록
            if (click.equals("e")) {
                scoreManage.register();
            }
            //수강생 과목별 시험 회차 및 점수 수정
            if (click.equals("r")) {
                scoreManage.updateScore();
            }
            //수강생 특정 회차별 등급 조회
            if (click.equals("t")) {
                scoreManage.showScoreByRound();
            }
        }
    }
}
