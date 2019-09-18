package providers;

import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;


public class RecordProvider {
    private Scanner scanner = new Scanner(System.in);
    public Records setGrade(List<Subject> listSubjects, List<Student> listStudents, List<Grade> listGrades) {
        Records record = new Records();
        System.out.println("------- Поставить оценку ученику --------");
        System.out.println("Список учеников: ");
        for(int i=0; i<listStudents.size();i++){
            System.out.printf("%d. %s %s%n", 
                    i+1,
                   listStudents.get(i).getName(),
                  listStudents.get(i).getSurname()
            );
        }
        System.out.println("Список предметов: ");
        for(int i=0; i<listSubjects.size();i++){
            System.out.printf("%d. %s %s%n", 
                    i+1,
                    listSubjects.get(i).getName(),
                    listSubjects.get(i).getAuthor()
            );
        }
        System.out.println("Список оценок: ");
        for(int i=0; i<listGrades.size();i++){
            System.out.printf("%d. %s %s%n", 
                    i+1,
                    listGrades.get(i).getName(),
                    listGrades.get(i).getText()
            );
        }
        System.out.print("Выберите номер ученика: ");
        String numberStudent = scanner.nextLine();
        System.out.print("Выберите номер предмета: ");
        String numberSubject = scanner.nextLine();
        System.out.print("Выберите номер оценки: ");
        String numberGrade = scanner.nextLine();
        Student student = listStudents.get(new Integer(numberStudent)-1);
        Subject subject = listSubjects.get(new Integer(numberSubject) - 1);
        Grade grade = listGrades.get(new Integer(numberGrade) - 1);
        record.setStudent(student);
        record.setSubject(subject);
        record.setGrade(grade);
        Calendar c = new GregorianCalendar();
        record.setGradeDate(c.getTime());
        return record;
    }
    
}
