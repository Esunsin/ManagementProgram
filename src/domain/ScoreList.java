package domain;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
    private List<Score> scoreList = new ArrayList<>();



    public void addScore(Score score) {
        scoreList.add(score);
    }
}
