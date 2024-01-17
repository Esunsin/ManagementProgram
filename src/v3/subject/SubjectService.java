package v3.subject;

import v3.domain.Subject;

public interface SubjectService {
    void register(Subject subject);

    Subject findSubject(Long subjectId);

    void showAllSubject();

}
