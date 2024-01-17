package v2.service;

import v2.domain.Subject;
import v2.repository.SubjectRepository;

import java.util.Map;
import java.util.Set;

public class SubjectServiceImpl implements SubjectService{
    private final SubjectRepository subjectRepository;
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void register(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public Subject findSubject(Long subjectId) {
        Subject findSubject = subjectRepository.findById(subjectId);
        System.out.println(findSubject);
        return findSubject;
    }

    @Override
    public void showAllSubject() {
        Set<Long> allSubjectId = subjectRepository.findAllId();
        for (Long subjectId : allSubjectId) {
            System.out.println(subjectRepository.findById(subjectId));
        }
    }

}
