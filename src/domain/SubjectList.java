package domain;

import java.util.ArrayList;
import java.util.List;

public class SubjectList {
    private List<Subject> subjectList = new ArrayList<>();



    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public List<Subject> pullSubjects(){
        List<Subject> subjects = new ArrayList<>();
        for (Subject subject : subjectList) {
            subjects.add(subject);
        }
        return subjects;
    }

    public void showSubjectList(){
        for (Subject subject : subjectList) {
            subject.showSubject();
        }
    }

    public Subject pullSubjectById(Integer id) {
        return subjectList.get(id);
    }

}
