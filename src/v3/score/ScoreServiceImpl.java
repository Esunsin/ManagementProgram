package v3.score;

import v3.domain.Score;

public class ScoreServiceImpl implements ScoreService {

    private final ScoreRepository scoreRepository;
    public ScoreServiceImpl(ScoreRepository scoreRepository) {

        this.scoreRepository = scoreRepository;
    }

    @Override
    public void register(Score score) {
        scoreRepository.save(score);
    }

    @Override
    public void updateRoundAndScore(Long studentId,Long subjectId,Integer round,Integer changeScore) {
        scoreRepository.findByIds(studentId, subjectId, round).updateScore(changeScore);
    }


    @Override
    public void showGradeByRound(Long studentId,Long subjectId,Integer round) {
        Score findScore = scoreRepository.findByIds(studentId, subjectId, round);
        System.out.println(findScore);
    }

    @Override
    public void showScores() {
        for (Score score : scoreRepository.findAllScore()) {
            System.out.println(score);
        }
    }
}
