package v3.student;

import v3.domain.Student;
import v3.student.StudentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemoryStudentRepository implements StudentRepository {
    private static Map<Long, Student> store = new HashMap<>();
    //save시 중복된 id값을 넣으면 덮어쓰기됨
    @Override
    public void save(Student student) {
        store.put(student.getStudentId(), student);
    }
    @Override
    public Student findById(Long studentId) {
        return store.get(studentId);
    }
    @Override
    public Set<Long> findAllId(){
        return store.keySet();
    }
    public void initStudents(){
        save(new Student(1L,"정진찬"));
        save(new Student(2L,"주준호"));
        save(new Student(3L,"박정섭"));
        save(new Student(4L,"홍세희"));
    }
}
