package v1.domain;

public class Subject {
    static Integer idSeq = 1;

    private Integer id;
    private String name;
    private OptionalRequired optionalRequired;

    public Subject(String name, OptionalRequired optionalRequired) {
        this.id = idSeq++;
        this.name = name;
        this.optionalRequired = optionalRequired;
    }
    public void showSubject(){
        System.out.println("id : "+id + " | name : " + name + " | 필수/선택 : " + optionalRequired);
    }

    public boolean isEssential(){
        if(optionalRequired.equals(OptionalRequired.ESSENTIAL)) return true;
        else return false;
    }
}
