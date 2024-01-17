package v3;

import v3.subject.SubjectService;

public class SubjectApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        SubjectService subjectService = appConfig.subjectService();
        subjectService.showAllSubject();
    }
}
