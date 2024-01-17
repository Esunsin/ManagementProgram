package v1.service;

import v1.domain.Student;
import v1.domain.StudentList;
import v1.domain.SubjectList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectManagement {
    private Scanner scanner = new Scanner(System.in);
    public Student addSubjectsToStudent(StudentList studentRepository,SubjectList subjectRepository){
        System.out.println("[ 학생 목록 ]");
        studentRepository.showStudents();
        System.out.print("과목을 추가할 학생의 id값을 고르세요 : ");
        int inputStudent = scanner.nextInt();
        Student findStudentById = studentRepository.findStudentById(inputStudent);
        findStudentById.addSubjects(registerSubjectByStudent(subjectRepository));
        return findStudentById;
    }

    private SubjectList registerSubjectByStudent(SubjectList subjectRepository) {
        SubjectList selectedSubjects = new SubjectList();
        System.out.println("[ 과 목 목 록 ]");
        subjectRepository.showSubjectList();
        System.out.println("추가할 과목의 id 값을 고르시오 (,으로 구분)");
        String inputSubjectId = scanner.next();
        String[] inputData = inputSubjectId.split(",");
        //숫자가 안들어 올때 예외 처리(해야함)
        List<Integer> selectedSubjectsId = new ArrayList<>();
        for (String data : inputData) {
            selectedSubjectsId.add(Integer.valueOf(data)-1);
        }

        for (Integer id : selectedSubjectsId) {
            selectedSubjects.addSubject(subjectRepository.pullSubjectById(id));
        }

        return selectedSubjects;
    }
}
