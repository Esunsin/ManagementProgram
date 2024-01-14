package domain;

public class Score {
    private Integer studentNumber;
    private Integer subjectNumber;
    private Integer testNumber;
    private Integer score;
    private String grade;

    public Score(Integer studentNumber,Integer subjectNumber, Integer testNumber, Integer score) {
        this.studentNumber = studentNumber;
        this.subjectNumber = subjectNumber;
        this.testNumber = testNumber;
        this.score = score;
    }

}
