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
//        String inputNumber = "";
//        Long id = null;
//        boolean flag = true;
//        do{
//           System.out.print("Идентификатор оценки: ");
//           inputNumber = scanner.nextLine();
//           try {
//              id=new Long(inputNumber);
//              flag = false;
//           }catch (Exception e){
//               System.out.println("Ошибка ввода!");
//           }
//        }while(flag);
//        grade.setId(id);
        System.out.print("Название оценки: ");
        grade.setName(scanner.nextLine());
        System.out.print("Описание оценки: ");
        grade.setText(scanner.nextLine());
        
        return grade;
    }
    
}
