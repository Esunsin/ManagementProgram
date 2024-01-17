package v2.domain;

import java.util.List;

public class Student {
    private Long studentId;
    private String name;
    private List<Subject> registeredSubject;

    public Student(Long studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getRegisteredSubject() {
        return registeredSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}

