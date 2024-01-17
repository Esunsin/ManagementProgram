package v2.repository;

import v2.domain.Score;

import java.util.HashSet;
import java.util.Set;

public class MemoryScoreRepository implements ScoreRepository{

    private final Set<Score> store = new HashSet<>();
    @Override
    public void save(Score score) {
        store.add(score);
    }

    @Override
    public Score findByIds(Long studentId, Long subjectId, Integer round) {
        for (Score score : store) {
            if (score.getStudentId() == studentId && score.getSubjectId() == subjectId && score.getRound() == round) {
                return score;
            }
        }
        return null;
    }

    @Override
    public Set<Score> findAllScore() {
        return store;
    }
}
