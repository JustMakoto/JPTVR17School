package interfaces;

import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.util.List;


public interface Savable {
    List<Subject> loadSubjectFromStorage();
    void saveSubjects(List<Subject> listSubjects);
    List<Student> loadStudentFromStorage();
    void saveStudents(List<Student> listStudents);
    List<Records> loadRecordsFromStorage();
    void saveRecords(List<Records> listRecords);
    List<Grade> loadGradeFromStorage();
    void saveGrades(List<Grade> listGrades);
}
