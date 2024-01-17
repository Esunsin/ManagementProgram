package v2.service;

import v2.domain.OptionalRequired;
import v2.domain.Subject;

public interface SubjectService {
    void register(Subject subject);

    Subject findSubject(Long subjectId);

    void showAllSubject();

}
