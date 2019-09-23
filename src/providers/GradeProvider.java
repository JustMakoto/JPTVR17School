package providers;

import entity.Subject;
import entity.Student;
import entity.Grade;
import java.util.Scanner;

public class GradeProvider {
    private Scanner scanner = new Scanner(System.in);
    public Grade createGrade() {
        Grade grade = new Grade();
        System.out.println("-------Создание оценки--------");
        System.out.print("Название оценки: ");
        grade.setName(scanner.nextLine());
        System.out.print("Описание оценки: ");
        grade.setText(scanner.nextLine());
        
        return grade;
    }
    
}
