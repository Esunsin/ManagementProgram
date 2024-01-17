package v1.service;

import v1.domain.*;

import java.util.Scanner;

public class RoundAndScoreManagement {
    private KeepGrade keepGrade = new KeepGrade();
    private Scanner scanner = new Scanner(System.in);
    public void registerRoundAndScore(StudentList studentRepository,ScoreList scoreRepository) {
        Score score;
        System.out.println(" [ 수강생 회차 및 점수 등록 ]");
        studentRepository.showStudents();
        System.out.print("회차 정보 및 점수를 추가할 학생의 ID 값을 고르시오 : ");

        int inputStudentId = scanner.nextInt();
        Student findStudent = studentRepository.findStudentById(inputStudentId);
        System.out.println("[수강생의 수강 과목]");
        findStudent.showSubjectsRegisteredByStudent();
        System.out.print("회차 정보 및 점수를 추가할 과목의 ID 값을 고르시오 : ");
        int inputSubjectId = scanner.nextInt();
        System.out.println(" [회차 정보 및 점수 추가] ");
        System.out.print("회차 정보를 입력하세요 : ");
        int inputTestNumber = scanner.nextInt();
        System.out.print("점수를 입력하세요 : ");
        int inputScore = scanner.nextInt();
        score = new Score(inputStudentId, inputSubjectId, inputTestNumber, inputScore);
        String grade = keepGrade.keepScore(score, findStudent.pullRegisterSubjectById(inputSubjectId));
        score.keepGrade(grade);
        score.showScoreInfo();
        scoreRepository.addScore(score);
        System.out.println("등록이 완료 되었습니다.");

    }
    public void updateRoundAndScore(StudentList studentRepository,ScoreList scoreRepository){
        Score score;
        System.out.println(" [ 수강생 회차 및 점수 수정 ]");
        studentRepository.showStudents();
        System.out.print("회차 정보 및 점수를 수정할 학생의 ID 값을 고르시오 : ");

        int inputStudentId = scanner.nextInt();
        Student findStudent = studentRepository.findStudentById(inputStudentId);
        System.out.println("[수강생의 수강 과목]");
        findStudent.showSubjectsRegisteredByStudent();
        System.out.print("회차 정보 및 점수를 수정할 과목의 ID 값을 고르시오 : ");
        int inputSubjectId = scanner.nextInt();
        System.out.println(" [회차 정보 및 점수 수정] ");
        System.out.print("회차 정보를 입력하세요 : ");
        int inputTestNumber = scanner.nextInt();
        System.out.print("점수를 입력하세요 : ");
        int inputScore = scanner.nextInt();
        score = new Score(inputStudentId, inputSubjectId, inputTestNumber, inputScore);
        String grade = keepGrade.keepScore(score, findStudent.pullRegisterSubjectById(inputSubjectId));
        score.keepGrade(grade);
        score.showScoreInfo();
        scoreRepository.addScore(score);
        System.out.println("수정이 완료 되었습니다.");
    }
    public void showGradeByTestNumber(StudentList studentRepository,ScoreList scoreRepository){
        System.out.println("[ 수강생 회차별 등급 조회]");
        studentRepository.showStudents();
        System.out.print("회차 정보 및 점수를 조회할 학생의 ID 값을 고르시오 : ");
        int inputStudentId = scanner.nextInt();
        scoreRepository.showScoreListByStudentId(inputStudentId);
    }
}
