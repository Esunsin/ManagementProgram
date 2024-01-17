package v3.domain;

public class Score {
    private Long studentId;
    private Long subjectId;
    private Integer round;
    private Integer score;
    private String grade ="N";

    public Score(Long studentId, Long subjectId, Integer round, Integer score) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.round = round;
        this.score = score;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public Integer getRound() {
        return round;
    }

    public Integer getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Score{" +
                "studentId=" + studentId +
                ", subjectId=" + subjectId +
                ", round=" + round +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void calculateGrade(Subject subject, Integer score) {
        String grade ="";
        if(subject.getOptionalRequired() == OptionalRequired.ESSENTIAL){
            if(score >=95) grade = "A";
            else if(score >=90) grade = "B";
            else if(score >=85) grade = "C";
            else if(score >=80) grade = "D";
            else if(score >=70) grade = "E";
            else grade = "F";
        }
        else {
            if(score >=90) grade = "A";
            else if(score >=80) grade = "B";
            else if(score >=70) grade = "C";
            else if(score >=60) grade = "D";
            else if(score >=50) grade = "E";
            else grade = "F";
        }
        this.grade = grade;
    }

    public void updateScore(Integer inputScore) {
        this.score = inputScore;
    }
}
