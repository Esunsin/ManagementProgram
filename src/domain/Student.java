package domain;

public class Student {
    static Integer idSeq = 1;

    private Integer id;
    private String name;
    private SubjectList subjectList = new SubjectList();


    public Student(String name) {
        this.id = idSeq++;
        this.name = name;

    }
    public void addSubjects(SubjectList selectedSubjects){
        for (Subject pullSubject : selectedSubjects.pullSubjects()) {
            subjectList.addSubject(pullSubject);
        }
    }


    public void showStudentInfo(){
        System.out.println("id : " + id + " | name : " + name);
    }

    public void showSubjectsRegisteredByStudent(){
        System.out.println("[등록한 과목]");
        subjectList.showSubjectList();
    }
}
