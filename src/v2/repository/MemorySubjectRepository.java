package v2.repository;


import v2.domain.OptionalRequired;
import v2.domain.Subject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemorySubjectRepository implements SubjectRepository{
    private static Map<Long, Subject> store = new HashMap<>();
    @Override
    public void save(Subject subject) {
        store.put(subject.getSubjectId(), subject);
    }

    @Override
    public Subject findById(Long subjectId) {
        return store.get(subjectId);
    }

    @Override
    public Set<Long> findAllId() {
        return store.keySet();
    }
    public void initSubjects(){
        save(new Subject(1L,"Java", OptionalRequired.ESSENTIAL));
        save(new Subject(2L,"객체지향", OptionalRequired.ESSENTIAL));
        save(new Subject(3L,"Spring", OptionalRequired.ESSENTIAL));
        save(new Subject(4L,"JPA", OptionalRequired.ESSENTIAL));
        save(new Subject(5L,"MySQL", OptionalRequired.ESSENTIAL));
        save(new Subject(6L,"디자인패턴", OptionalRequired.OPTIONAL));
        save(new Subject(7L,"Spring Security", OptionalRequired.OPTIONAL));
        save(new Subject(8L,"Redis", OptionalRequired.OPTIONAL));
        save(new Subject(9L,"MongoDB", OptionalRequired.OPTIONAL));
    }
}
