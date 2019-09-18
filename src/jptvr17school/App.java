package jptvr17school;

import providers.RecordProvider;
import providers.StudentProvider;
import entity.Subject;
import entity.Records;
import entity.Student;
import entity.Grade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import providers.SubjectProvider;
import interfaces.Savable;
import providers.GradeProvider;

public class App {
    private List<Subject> listSubjects = new ArrayList<>();
    private List<Student> listStudents = new ArrayList<>();
    private List<Grade> listGrades = new ArrayList<>();
    private List<Records> listRecords = new ArrayList<>();
    
    private Savable savable;
    public App() {
       savable = new StorageInBase() {};
       //savable = new StorageInFile();
        try {
            listSubjects = savable.loadSubjectFromStorage();
        } catch (Exception e) {
            System.out.println("Нет файла Subjects.txt");
        }
        try {
            listStudents = savable.loadStudentFromStorage();
        } catch (Exception e) {
            System.out.println("Нет файла Students.txt");
        }
        try {
            listGrades = savable.loadGradeFromStorage();
        } catch (Exception e) {
            System.out.println("Нет файла Grades.txt");
        }
        try {
            listRecords = savable.loadRecordsFromStorage();
        } catch (Exception e) {
            System.out.println("Нет файла Records.txt");
        }
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Наша школа ----");
        String repeat = "r";
        int operation;
        do{
            System.out.println("Выберите действие:");
            System.out.println("1. Создать новый предмет");
            System.out.println("2. Создать нового ученика");
            System.out.println("3. Создать новую оценку");
            System.out.println("4. Вывести список предметов");
            System.out.println("5. Вывести список учеников");
            System.out.println("6. Вывести список оценок");
            System.out.println("7. Поставить оценку ученику");
            System.out.println("8. Вывести журнал");
            operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    SubjectProvider subjectProvider = new SubjectProvider();
                    listSubjects.add(subjectProvider.createSubject());
                    savable.saveSubjects(listSubjects);
                    
                    break;
                case 2:
                    StudentProvider studentProvider = new StudentProvider();
                    listStudents.add(studentProvider.createStudent());
                    savable.saveStudents(listStudents);

                    break;
                case 3:
                    GradeProvider gradeProvider = new GradeProvider();
                    listGrades.add(gradeProvider.createGrade());
                    savable.saveGrades(listGrades);
 
                    break;
                case 4:
                    System.out.println("Список предметов: ");
                    for(int i=0;i<listSubjects.size();i++){
                        System.out.println(listSubjects.get(i));
                    }
                    break; 
                case 5:
                    System.out.println("Список учеников: ");
                    for(int i=0;i<listStudents.size();i++){
                        System.out.println(listStudents.get(i));
                    }
                    break;
                case 6:
                    System.out.println("Список оценок: ");
                    for(int i=0;i<listGrades.size();i++){
                        System.out.println(listGrades.get(i));
                    }
                    break;
                case 7:
                    RecordProvider newGradeProvider = new RecordProvider();
                    listRecords.add(newGradeProvider.setGrade(listSubjects,listStudents,listGrades
                    ));
                    savable.saveRecords(listRecords);
                    break;
                
                case 8:
                System.out.println("Оценки учеников: ");
                    for(int i=0;i<listRecords.size();i++){
                        System.out.println(listRecords.get(i));
                    }
                    break;
                
                default:
                    System.out.println("Такое действие не поддерживается");
                    continue;
            }
            System.out.println("Для продолжения программы");
            System.out.println("введите \"r\"");
            System.out.println("Для окончания \"q\"");
            repeat = scanner.nextLine();
        }while("r".equals(repeat));
        System.out.println("Программа закрывается");
    }
    
}
