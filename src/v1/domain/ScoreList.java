package v1.domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
    private List<Score> scoreList = new ArrayList<>();

    public Score addScore(Score score) {
        scoreList.add(score);
        return score;
    }

    public void showScoreList(){
        for (Score score : scoreList) {
            score.showScoreInfo();
        }
    }
    public void showScoreListByStudentId(Integer studentId){
        for (Score score : scoreList) {
            if(score.getStudentNumber() == studentId) score.showScoreInfo();
        }
    }
}
