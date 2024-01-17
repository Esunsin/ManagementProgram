package v3.score;

import v3.domain.Score;
import v3.domain.Student;
import v3.student.StudentService;
import v3.subject.SubjectService;

import java.util.Scanner;

public class ScoreManageImpl1 implements ScoreManage {
    private Scanner input = new Scanner(System.in);
    private final StudentService studentService;
    private final SubjectService subjectService;
    private final ScoreService scoreService;

    public ScoreManageImpl1(StudentService studentService, SubjectService subjectService, ScoreService scoreService) {
        this.studentService = studentService;
        this.subjectService = subjectService;
        this.scoreService = scoreService;
    }

    @Override
    public void register() {
        System.out.println("[회차,점수 등록]");
        studentService.showAllStudent();
        System.out.println("등록할 수강생의 id값을 입력하세요");
        Long selectedStudentId = input.nextLong();
        Student findStudent = studentService.findStudentById(selectedStudentId);
        findStudent.showRegisteredSubject();
        System.out.println("회차와 점수를 등록할 과목의 id값을 입력하세요");
        Long selectedSubjectId = input.nextLong();
        System.out.println("점수를 입력할 회차를 입력하세요");
        Integer inputRound = input.nextInt();
        System.out.println("점수를 입력하세요");
        Integer inputScore = input.nextInt();

        Score score = new Score(selectedStudentId, selectedSubjectId, inputRound, inputScore);
        score.calculateGrade(subjectService.findSubject(score.getSubjectId()),score.getScore());

        scoreService.register(score);
    }

    @Override
    public void updateScore() {
        System.out.println("[점수 변경]");
        studentService.showAllStudent();
        System.out.println("변경할 수강생의 id값을 입력하세요");
        Long selectedStudentId = input.nextLong();
        Student findStudent = studentService.findStudentById(selectedStudentId);
        findStudent.showRegisteredSubject();
        System.out.println("회차와 점수를 변경할 과목의 id값을 입력하세요");
        Long selectedSubjectId = input.nextLong();
        System.out.println("점수를 변경 할 회차를 입력하세요");
        Integer inputRound = input.nextInt();
        System.out.println("변경할 점수를 입력하세요");
        Integer changeScore = input.nextInt();
        scoreService.updateRoundAndScore(selectedStudentId, selectedSubjectId, inputRound, changeScore);
        System.out.println("완료");
    }

    @Override
    public void showScoreByRound() {
        System.out.println("[점수 조회]");
        studentService.showAllStudent();
        System.out.println("조회할 수강생의 id값을 입력하세요");
        Long selectedStudentId = input.nextLong();
        Student findStudent = studentService.findStudentById(selectedStudentId);
        findStudent.showRegisteredSubject();
        System.out.println("회차와 점수를 조회할 과목의 id값을 입력하세요");
        Long selectedSubjectId = input.nextLong();
        System.out.println("점수를 조회 할 회차를 입력하세요");
        Integer inputRound = input.nextInt();
        scoreService.showGradeByRound(selectedStudentId,selectedSubjectId,inputRound);
    }

    @Override
    public void showScores() {
        scoreService.showScores();
    }
}
