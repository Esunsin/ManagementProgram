package v2.domain;

public class Subject {
    private Long subjectId;
    private String name;
    private OptionalRequired optionalRequired;

    public Subject(Long subjectId, String name, OptionalRequired optionalRequired) {
        this.subjectId = subjectId;
        this.name = name;
        this.optionalRequired = optionalRequired;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public OptionalRequired getOptionalRequired() {
        return optionalRequired;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                ", optionalRequired=" + optionalRequired +
                '}';
    }
}
