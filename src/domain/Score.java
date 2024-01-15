package domain;

import service.KeepGrade;

public class Score {
    private Integer studentNumber;
    private Integer subjectNumber;
    private Integer testNumber;
    private Integer score;
    private String grade ="N";

    public Score(Integer studentNumber,Integer subjectNumber, Integer testNumber, Integer score) {
        this.studentNumber = studentNumber;
        this.subjectNumber = subjectNumber;
        this.testNumber = testNumber;
        this.score = score;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public Integer getSubjectNumber() {
        return subjectNumber;
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public Integer getScore() {
        return score;
    }
    public void keepGrade(String recodedGrade){
        this.grade = recodedGrade;
    }
    public void showScoreInfo(){
        System.out.println("학생ID : " + studentNumber +
                " | 과목ID : " + subjectNumber +
                " | 회차 정보 : " + testNumber +
                " | 점수 : " + score +
                " | 등급 : " + grade);
    }
}
