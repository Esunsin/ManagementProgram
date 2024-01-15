package service;

import domain.Score;
import domain.ScoreList;
import domain.Subject;
import domain.SubjectList;

public class KeepGrade {
    public String keepScore(Score score, Subject subject){
        if(subject.isEssential()){
            if(score.getScore() >= 95) return "A";
            else if(score.getScore() >= 90) return "B";
            else if(score.getScore() >= 80) return "C";
            else if(score.getScore() >= 70) return "D";
            else if(score.getScore() >= 60) return "E";
            else return "F";
        }
        else{
            if(score.getScore() >= 90) return "A";
            else if(score.getScore() >= 80) return "B";
            else if(score.getScore() >= 70) return "C";
            else if(score.getScore() >= 60) return "D";
            else if(score.getScore() >= 50) return "E";
            else return "F";
        }
    }
}
