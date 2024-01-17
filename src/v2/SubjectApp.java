package v2;

import v2.data.InitData;
import v2.service.SubjectService;

public class SubjectApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        SubjectService subjectService = appConfig.subjectService();
        subjectService.showAllSubject();
    }
}
