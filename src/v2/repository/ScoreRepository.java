package v2.repository;

import v2.domain.Score;

import java.util.Set;

public interface ScoreRepository {
    void save(Score score);
    Score findByIds(Long studentId,Long subjectId,Integer round);

    Set<Score> findAllScore();
}
