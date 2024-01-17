package v2.service;

import v2.domain.Score;

public interface ScoreService {
    void register(Score score);
    void updateRoundAndScore(Long studentId,Long subjectId,Integer round,Integer changeScore);
    void showGradeByRound(Long studentId,Long subjectId,Integer round);

    void showScores();
}
