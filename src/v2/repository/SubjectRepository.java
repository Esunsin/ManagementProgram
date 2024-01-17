package v2.repository;

import v2.domain.Subject;

import java.util.Set;

public interface SubjectRepository {
    void save(Subject subject);

    Subject findById(Long subjectId);

    Set<Long> findAllId();

}
