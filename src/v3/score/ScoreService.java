package v3.score;

import v3.domain.Score;

public interface ScoreService {
    void register(Score score);
    void updateRoundAndScore(Long studentId,Long subjectId,Integer round,Integer changeScore);
    void showGradeByRound(Long studentId,Long subjectId,Integer round);

    void showScores();
}
